package org.rapidpm.vaadin.devday2017.frp.ui.components.mainview;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.rapidpm.vaadin.devday2017.frp.ui.components.demo01.CheckBoxComp;
import org.rapidpm.vaadin.devday2017.frp.ui.components.demo02.NotificationComp;
import org.rapidpm.vaadin.devday2017.frp.ui.components.demo03.DemoIDComponent;
import com.vaadin.ui.Composite;
import com.vaadin.ui.VerticalLayout;

/**
 *
 */
public class MainView extends Composite {


  private final VerticalLayout layout = new VerticalLayout();

  @Inject private CheckBoxComp checkBoxComp;
  @Inject private NotificationComp notificationComp;
  @Inject private DemoIDComponent demoIDComponent;

  public MainView() {
    setCompositionRoot(layout);
  }

  @PostConstruct
  private void postConstruct() {
    layout.addComponents(
        checkBoxComp ,
        notificationComp ,
        demoIDComponent);
  }

}
