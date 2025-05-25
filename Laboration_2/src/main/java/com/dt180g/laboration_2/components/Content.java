package com.dt180g.laboration_2.components;

import com.dt180g.laboration_2.support.Constants;
import com.dt180g.laboration_2.support.InvalidAuthorizationException;
import com.dt180g.laboration_2.decorators.SpyMaster;

/**
 * Base component for all message decorators and concrete components.
 * Tracks a  static encryption depth and provides ciphering functionality.
 * @author Muntaser Ibrahim
 */
public abstract class Content implements MessageInterface {
    /** encryption depth across all messages. */
    private static int encryptionLevel = 0;

    /** the base encryption level. */
    public static void setEncryptionLevel(int level) {
        encryptionLevel = level;
    }

    /** increase the encryption level. */
    public static void increaseEncryptionLevel(int delta) {
        encryptionLevel += delta;
    }

    /**
     * Returns the current encryption level, but only if requested by a SpyMaster.
     * @param requester the object asking for the level
     * @return the current encryption depth
     * @throws InvalidAuthorizationException if requester is not a SpyMaster
     * @author Muntaser Ibrahim
     */
    public static int getEncryptionLevel(Object requester) {
        if (requester instanceof SpyMaster) {
            return encryptionLevel;
        }
        throw new InvalidAuthorizationException(
                "Only spy masters may access encryption depth."
        );
    }

    /**
     * Applies a Caesar cipher to the given message.
     * @param message the input text
     * @param rotValue number of letter positions to shift
     * @return the ciphered text
     * @author Muntaser Ibrahim
     */
    protected static String cipher(String message, int rotValue) {
        StringBuilder result = new StringBuilder();
        int mod = Constants.ALPHABET_LENGTH;  // should be 26
        int shift = rotValue % mod;

        for (char ch : message.toCharArray()) {
            if (!Character.isLetter(ch)) {
                result.append(ch);
                continue;
            }
            int offset = Character.isUpperCase(ch) ? 'A' : 'a';
            int alphaPos = ((ch - offset) + shift + mod) % mod;
            result.append((char)(offset + alphaPos));
        }
        return result.toString();
    }
}
