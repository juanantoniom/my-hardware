package myhardware.view;






import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import myhardware.model.Components;
import myhardware.model.Motherboard;


public class MyJframe extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	public MyJframe(Components theComponents, Motherboard theMotherboard) {
		
		//********this library makes the Swing application view look beautiful*******// 
			FlatLightLaf.setup(); // if you remove this line the Swing application view back to the old Swing view 
		/*try {   // if you remove this try catch the Swing application view back to the old Swing view 
			UIManager.setLookAndFeel(new FlatDarkLaf());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//********this library do Swing application look beautiful*******// 
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setTitle("PC Master Race");
		setResizable(false);
		
		//add image icon Frame
		
		ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/images/logopcmaster.png"));
		
		setIconImage(icon.getImage());
		
		
		//Create JTabbedPane
		JTabbedPane myTabbedPane = new JTabbedPane();
		
		myTabbedPane.setTabLayoutPolicy(JTabbedPane.TOP);
		
		myTabbedPane.setFocusable(false);
		
		
		
		myTabbedPane.addTab("CPU-Ram-OS", new MyJpanelHardwareInfo(theComponents));
		//add JTabbePane to JFrame
		add(myTabbedPane);
		
		myTabbedPane.addTab("Graphics Card", new MyJpanelGraphicsCardInfo(theComponents));
		
		myTabbedPane.addTab("Motherboard", new MyJpanelMotherboard(theMotherboard));
		
		setVisible(true);
		
		
	}
	
	
	
	
}
