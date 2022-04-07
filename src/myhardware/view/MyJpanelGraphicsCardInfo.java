package myhardware.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import myhardware.model.Components;

public class MyJpanelGraphicsCardInfo extends JPanel{

	public MyJpanelGraphicsCardInfo(Components theComponents) {
		
		//set it setLayout = null so you can use setBounds and move it anywhere
		setLayout(null);
		//setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		JLabel labelGraphicsCardName = new JLabel("Graphics card name:");
		labelGraphicsCardName.setBounds(70, 100, 190, 20);
		labelGraphicsCardName.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelGraphicsCardName);
		
		JTextField textGraphicsCardName = new JTextField();
		textGraphicsCardName.setBounds(250, 100, 500, 20);
		textGraphicsCardName.setFont(new Font("comic sans ms", Font.BOLD,16));
		textGraphicsCardName.setBorder(BorderFactory.createEmptyBorder());
		textGraphicsCardName.setEditable(false);
		textGraphicsCardName.setText(theComponents.getInfoGraphicsCardName());
		add(textGraphicsCardName);
		
		
		
		JLabel labelGraphicsCardVRam = new JLabel("Graphics card vram:");
		labelGraphicsCardVRam.setBounds(70, 200, 190, 20);
		labelGraphicsCardVRam.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelGraphicsCardVRam);
		
		JTextField textGraphicsCardVRam = new JTextField();
		textGraphicsCardVRam.setBounds(250, 200, 500, 20);
		textGraphicsCardVRam.setFont(new Font("comic sans ms", Font.BOLD,16));
		textGraphicsCardVRam.setBorder(BorderFactory.createEmptyBorder());
		textGraphicsCardVRam.setEditable(false);
		textGraphicsCardVRam.setText(theComponents.getInfoGraphicsCardVRam());
		add(textGraphicsCardVRam);
		
		
		
		
		JLabel labelGraphicsCardVersion = new JLabel("Graphics card version:");
		labelGraphicsCardVersion.setBounds(70, 300, 190, 20);
		labelGraphicsCardVersion.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelGraphicsCardVersion);
		
		JTextField textGraphicsCardVersion = new JTextField();
		textGraphicsCardVersion.setBounds(250, 300, 500, 20);
		textGraphicsCardVersion.setFont(new Font("comic sans ms", Font.BOLD,16));
		textGraphicsCardVersion.setBorder(BorderFactory.createEmptyBorder());
		textGraphicsCardVersion.setEditable(false);
		textGraphicsCardVersion.setText(theComponents.getInfoGraphicsCardVersionInfo());
		add(textGraphicsCardVersion);
		
		
		
			
		JLabel labelGraphicsCardVendor = new JLabel("Graphics card vendor:");
		labelGraphicsCardVendor.setBounds(70, 400, 190, 20);
		labelGraphicsCardVendor.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelGraphicsCardVendor);	
		
		JTextField textGraphicsCardVendor = new JTextField();
		textGraphicsCardVendor.setBounds(250, 400, 500, 20);
		textGraphicsCardVendor.setFont(new Font("comic sans ms", Font.BOLD,16));
		textGraphicsCardVendor.setBorder(BorderFactory.createEmptyBorder());
		textGraphicsCardVendor.setEditable(false);
		textGraphicsCardVendor.setText(theComponents.getInfoGraphicsCardVendor());
		add(textGraphicsCardVendor);
		
		
		
		
		//add image
			
				Toolkit myToolkit = Toolkit.getDefaultToolkit();
				
				URL imageURL  = myToolkit.getClass().getResource("/images/pc_master_race_pj2.png");
				
				ImageIcon theImage = new ImageIcon(imageURL);
					
				JLabel thePicture = new JLabel(theImage);
					
				thePicture.setBounds(750, 10, 200, 400);
					
				add(thePicture);
					
	}
				
			
		
		
	
}
