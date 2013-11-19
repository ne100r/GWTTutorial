package com.tutorialspoint.helloWorld.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class HelloWorld implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        HTML html = new HTML("<p>Welcome to GWT application</p>");

        RootPanel.get("gwtContainer").add(html);
    }
}
