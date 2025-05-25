package com.dt180g.laboration_2.components;


public class Container extends Content {
    // Holds the encrypted message
    private final String message;

    /**
     * @param original      the plaintext message
     * @param baseEncryption the initial encryption depth
     * @author Muntaser Ibrahim
     */
    public Container(String original, int baseEncryption) {
        // If negative, default to 10
        int level = (baseEncryption < 0 ? 10 : baseEncryption);
        // Set the shared encryption depth
        Content.setEncryptionLevel(level);
        // Encrypt once with the base level
        this.message = Content.cipher(original, level);
    }

    /**
     * Returns the message after initial encryption.
     * @author Muntaser Ibrahim
     */
    @Override
    public String getMessage() {
        return message;
    }
}
