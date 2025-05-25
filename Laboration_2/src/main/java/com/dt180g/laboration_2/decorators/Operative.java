package com.dt180g.laboration_2.decorators;

import com.dt180g.laboration_2.components.Content;


/**
 * abstract base decorator which  wraps another Content component.
 * @author Muntaser Ibrahim
 */
public abstract class Operative extends Content {
    /** The previous component in the decoration */
    protected final Content previous;

    /**
     * @param previous the Content to wrap
     */
    public Operative(Content previous) {
        this.previous = previous;
    }

    /**
     * @return the decorated (encrypted / decrypted) message
     * @author Muntaser Ibrahim
     */
    @Override
    public abstract String getMessage();
}

