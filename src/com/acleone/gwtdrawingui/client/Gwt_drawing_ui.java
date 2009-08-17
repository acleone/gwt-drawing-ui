package com.acleone.gwtdrawingui.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.widgetideas.graphics.client.GWTCanvas;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwt_drawing_ui implements EntryPoint {
	
	public void onModuleLoad() {
		GWTCanvas canvas = new GWTCanvas(1000, 1000);
		DOM.setElementAttribute(canvas.getElement(), "id", "c");
		RootPanel.get().add(canvas);
	}
}
