package org.litejunit.v1;

/**
 * Created by john on 2017/9/2.
 */
public class AssertionFailedError  extends Error{
    public AssertionFailedError() {

    }

    public AssertionFailedError(String message) {
        super(message);
    }
}
