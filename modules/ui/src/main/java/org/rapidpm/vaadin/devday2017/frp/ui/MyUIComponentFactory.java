package org.rapidpm.vaadin.devday2017.frp.ui;

import javax.inject.Inject;

import org.rapidpm.vaadin.devday2017.frp.ui.components.mainview.MainView;
import org.rapidpm.vaadin.devday2017.frp.vaadin.JumpstartUIComponentFactory;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;

/**
 *
 */
public class MyUIComponentFactory implements JumpstartUIComponentFactory {


  @Inject private MainView view;

  @Override
  public Component createComponentToSetAsContent(VaadinRequest vaadinRequest) {
    return view;
  }
}
