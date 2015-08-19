package org.vaadin.addon.leaflet.demoandtestapp;


import com.vaadin.server.FontAwesome;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LMarker;

import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.addon.leaflet.LCircleMarker;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
import org.vaadin.addon.leaflet.shared.Point;
import org.vaadin.addonhelpers.AbstractTest;

public class FontawesomeMarker extends AbstractTest {

    @Override
    public String getDescription() {
        return "A should not show empty map";
    }


	@Override
	public Component getTestComponent() {

        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSizeFull();

        // Getting my map.
        LMap map = new LMap();
        map.addComponent(new LOpenStreetMapLayer());
        LMarker lMarker = new LMarker(61, 22);
        lMarker.setIcon(FontAwesome.BEER);
        map.addComponent(lMarker);
        
        LCircleMarker lCircleMarker = new LCircleMarker(61,22, 2);
        map.addComponent(lCircleMarker);
        
        map.zoomToContent();

        layout.addComponent(map);
        return layout;
	}
}
