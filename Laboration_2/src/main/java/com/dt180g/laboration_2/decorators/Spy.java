package com.dt180g.laboration_2.decorators;

import com.dt180g.laboration_2.components.Content;
import com.dt180g.laboration_2.support.Constants;
import java.util.concurrent.ThreadLocalRandom;


/**
 * implementations a spy class for encrypting/decrypting messages.
 * @author Muntaser Ibrahim
 */
public class Spy extends Operative {
    private final int rotation;

    public Spy(Content previous) {
        super(previous);
        // Random increment between LOWER_BOUNDARY and UPPER_BOUNDARY
        this.rotation = ThreadLocalRandom
                .current()
                .nextInt(Constants.LOWER_BOUNDARY, Constants.UPPER_BOUNDARY + 1);
        Content.increaseEncryptionLevel(rotation);
    }

    @Override
    public String getMessage() {
        // First get the message from the previous component
        String msg = previous.getMessage();
        // Then apply the additional rotation
        return Content.cipher(msg, rotation);
    }
}

