package myhardware.view;

import javax.swing.JTabbedPane;

public class MyJtabbedPane {

	public MyJtabbedPane(MyJpanelHardwareInfo theJpanelHardwareInfo, MyJpanelGraphicsCardInfo theJpanelGraphicCardInfo, MyJpanelMotherboard theJpanelMotherboard) {
		
		JTabbedPane myTabbedPane = new JTabbedPane();
		
		myTabbedPane.setTabLayoutPolicy(JTabbedPane.TOP);
		
		myTabbedPane.addTab("panel 1", theJpanelHardwareInfo);
		
		myTabbedPane.addTab("panel 2", theJpanelGraphicCardInfo);
		
		myTabbedPane.addTab("panel 3", theJpanelMotherboard);
		
		
	}
}
