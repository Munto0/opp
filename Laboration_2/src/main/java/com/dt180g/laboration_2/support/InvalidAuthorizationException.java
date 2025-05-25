package com.dt180g.laboration_2.support;

/** Thrown when a non‑SpyMaster tries to get encryption depth.
 * @author Muntaser Ibrahim
 * */
public class InvalidAuthorizationException extends RuntimeException {
    public InvalidAuthorizationException(String message) {
        super(message);
    }
}

