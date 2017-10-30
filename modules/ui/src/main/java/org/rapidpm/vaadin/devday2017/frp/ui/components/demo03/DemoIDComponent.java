package org.rapidpm.vaadin.devday2017.frp.ui.components.demo03;

import static org.rapidpm.vaadin.devday2017.frp.ui.ComponentIDGenerator.buttonID;

import com.vaadin.ui.Button;
import com.vaadin.ui.Composite;

/**
 *
 */
public class DemoIDComponent extends Composite {

  // Generated ID = BTN_ID = demoidcomponent-button-btn
  public static final String BTN_ID = buttonID().apply(DemoIDComponent.class, "btn");

  private final Button btn = new Button();

  public DemoIDComponent() {
    btn.setId(BTN_ID);
    setCompositionRoot(btn);
  }
}
