package com.tutorialspoint.helloWorld.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class HelloWorld implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        Window.alert("Hello, World!");
    }
}
