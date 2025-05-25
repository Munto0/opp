package com.dt180g.laboration_2.decorators;

import com.dt180g.laboration_2.components.Content;
import com.dt180g.laboration_2.support.Constants;


/**
 * Final decorator that decrypts the message using the accumulated encryption depth.
 * @author Muntaser Ibrahim
 */
public class SpyMaster extends Operative {

    /**
     * @param previous the Content chain to decrypt
     */
    public SpyMaster(Content previous) {
        super(previous);
    }

    @Override
    public String getMessage() {
        // Retrieve the fully encrypted text
        String encrypted = previous.getMessage();

        // Obtain the total depth (only SpyMaster is authorized)
        int depth = Content.getEncryptionLevel(this);

        // Calculate reverse rotation: 26 - (depth % 26)
        int mod = Constants.ALPHABET_LENGTH;
        int rot = mod - (depth % mod);

        // Decrypt by applying reverse rotation
        return Content.cipher(encrypted, rot);
    }
}

