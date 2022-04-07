package myhardware.controller;



import myhardware.model.Components;
import myhardware.model.Motherboard;
import myhardware.view.MyJframe;

public class Controller {
	
	public Controller() {
		
		Components theComponents = new Components();
		Motherboard theMotherboard = new Motherboard();
						
		MyJframe jframe = new MyJframe(theComponents, theMotherboard);
	}

}
