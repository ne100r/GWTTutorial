package com.tutorialspoint.helloWorld.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class HelloWorld implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        // add button to change font to big when clicked.
        Button btn1 = new Button("Big Text");
        btn1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                RootPanel.get("mytext").setStyleName("gwt-Big-Text");
            }
        });

        // add button to change font to small when clicked.
        Button btn2 = new Button("Big Text");
        btn2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                RootPanel.get("mytext").setStyleName("gwt-Small-Text");
            }
        });

        RootPanel.get("gwtGreenButton").add(btn1);
        RootPanel.get("gwtRedButton").add(btn2);
    }


}
