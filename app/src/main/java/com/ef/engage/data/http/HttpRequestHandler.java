package com.ef.engage.data.http;

/**
 * Created with Android Studio
 * User: Chris.Hou
 * Date: 11/19/14
 */
public interface HttpRequestHandler {
    public void onStart();
    public void onSuccess(HttpRequest httpRequest, HttpResponse httpResponse);
    public void onError(HttpRequest httpRequest, HttpError httpError);
}
