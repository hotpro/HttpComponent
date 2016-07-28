package com.ef.engage.data.net.impl;

import com.ef.engage.data.ErrorMetaData;
import com.ef.engage.data.net.WebError;

/**
 * Created with Android Studio
 * User: Chris.Hou
 * Date: 11/19/14
 */
public class DefaultWebError implements WebError{
    private final int code;
    private final String message;
    private final ErrorMetaData errorMetaData;

    public DefaultWebError(int code, String message, ErrorMetaData errorMetaData) {
        this.code = code;
        this.message = message;
        this.errorMetaData = errorMetaData;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public ErrorMetaData getErrorMetaData() {
        return errorMetaData;
    }
}
