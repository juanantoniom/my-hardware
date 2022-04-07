package myhardware.view;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import myhardware.model.Motherboard;

public class MyJpanelMotherboard extends JPanel {
	
	public MyJpanelMotherboard(Motherboard theMotherboard) {
		
		//set it setLayout = null so you can use setBounds and move it anywhere
		setLayout(null);
		
		//MotherboardModel
		
		JLabel labelMBmodel = new JLabel("Motherboard model:");
		labelMBmodel.setBounds(70, 50, 190, 20);
		labelMBmodel.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelMBmodel);
		
		JTextField textMBmodel = new JTextField();
		textMBmodel.setBounds(240, 37, 250, 50);
		textMBmodel.setBorder(BorderFactory.createEmptyBorder());
		textMBmodel.setEditable(false);
		textMBmodel.setFont(new Font("comic sans ms", Font.BOLD,16));
		textMBmodel.setText(theMotherboard.getMotherboardModel());
		add(textMBmodel);
		
		
		
		//MotherboardManufacturer
		
		JLabel labelMBmanufacturer = new JLabel("Motherboard manufacturer:");
		labelMBmanufacturer.setBounds(70, 120, 250, 20);
		labelMBmanufacturer.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelMBmanufacturer);
		
		JTextField textMBmanufacturer = new JTextField();
		textMBmanufacturer.setBounds(300, 106, 250, 50);
		textMBmanufacturer.setEditable(false);
		textMBmanufacturer.setBorder(BorderFactory.createEmptyBorder());
		textMBmanufacturer.setFont(new Font("comic sans ms", Font.BOLD,16));
		textMBmanufacturer.setText(theMotherboard.getMotheboardManufacturer());
		add(textMBmanufacturer);
		
		
		//MotherboardVersion
		
		JLabel labelMBversion = new JLabel("Motherboard version:");
		labelMBversion.setBounds(70, 160, 250, 50);
		labelMBversion.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelMBversion);
		
		JTextField textMBversion = new JTextField();
		textMBversion.setBounds(250, 160, 250, 50);
		textMBversion.setEditable(false);
		textMBversion.setBorder(BorderFactory.createEmptyBorder());
		textMBversion.setFont(new Font("comic sans ms", Font.BOLD,16));
		textMBversion.setText(theMotherboard.getMotherboardVersion());
		add(textMBversion);
		
		
		//MotherboardSerialNumber
		
		JLabel labelMBSerialNumber = new JLabel("Motherboard serial number:");
		labelMBSerialNumber.setBounds(70, 220, 250, 50);
		labelMBSerialNumber.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelMBSerialNumber);
		
		JTextField textMBSerialNumber = new JTextField();
		textMBSerialNumber.setBounds(300, 220, 250, 50);
		textMBSerialNumber.setEditable(false);
		textMBSerialNumber.setBorder(BorderFactory.createEmptyBorder());
		textMBSerialNumber.setFont(new Font("comic sans ms", Font.BOLD,16));
		textMBSerialNumber.setText(theMotherboard.getSerialNumber());
		add(textMBSerialNumber);
		
		
		
		// MotherboardFirmwareVersion
		JLabel labelMBFirmwareVersion = new JLabel("Motherboard firmware Version:");
		labelMBFirmwareVersion.setBounds(70, 280, 300, 50);
		labelMBFirmwareVersion.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelMBFirmwareVersion);
		
		JTextField textMBFirmwareVersion = new JTextField();
		textMBFirmwareVersion.setBounds(325, 280, 300, 50);
		textMBFirmwareVersion.setEditable(false);
		textMBFirmwareVersion.setBorder(BorderFactory.createEmptyBorder());
		textMBFirmwareVersion.setFont(new Font("comic sans ms", Font.BOLD,16));
		textMBFirmwareVersion.setText(theMotherboard.getMotherboardFirmwareVersion());
		add(textMBFirmwareVersion);
		
		
		// MotherboardFirmwareName
		
		JLabel labelMBFirmwareName = new JLabel("Motherboard firmware Name:");
		labelMBFirmwareName.setBounds(70, 340, 300, 50);
		labelMBFirmwareName.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelMBFirmwareName);
		
		JTextField textMBFirmwareName = new JTextField();
		textMBFirmwareName.setBounds(310, 340, 200, 50);
		textMBFirmwareName.setEditable(false);
		textMBFirmwareName.setBorder(BorderFactory.createEmptyBorder());
		textMBFirmwareName.setFont(new Font("comic sans ms", Font.BOLD,16));
		textMBFirmwareName.setText(theMotherboard.getMotherboardFirmwareName());
		add(textMBFirmwareName);
		
		
		// MotherboardFirmwareManufacturer
		
		JLabel labelMBFirmwareManuFacturer = new JLabel("Motherboard firmware manufacturer:");
		labelMBFirmwareManuFacturer.setBounds(70, 400, 300, 50);
		labelMBFirmwareManuFacturer.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelMBFirmwareManuFacturer);
		
		JTextField textMBFirmwareManufacturer = new JTextField();
		textMBFirmwareManufacturer.setBounds(380, 400, 500, 50);
		textMBFirmwareManufacturer.setEditable(false);
		textMBFirmwareManufacturer.setBorder(BorderFactory.createEmptyBorder());
		textMBFirmwareManufacturer.setFont(new Font("comic sans ms", Font.BOLD,16));
		textMBFirmwareManufacturer.setText(theMotherboard.getMotherboardFirmwareManufacturer());
		add(textMBFirmwareManufacturer);
		
		
		// MotheboardFirmwareDesctiption
		
		JLabel labelMBFirmwareDescription = new JLabel("Motherboard firmware description:");
		labelMBFirmwareDescription.setBounds(70, 450, 300, 50);
		labelMBFirmwareDescription.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelMBFirmwareDescription);
		
		JTextField textMBFirmwareDescription = new JTextField();
		textMBFirmwareDescription.setBounds(350, 450, 300, 50);
		textMBFirmwareDescription.setEditable(false);
		textMBFirmwareDescription.setBorder(BorderFactory.createEmptyBorder());
		textMBFirmwareDescription.setFont(new Font("comic sans ms", Font.BOLD,16));
		textMBFirmwareDescription.setText(theMotherboard.getMotheboardFirmwareDescription());
		add(textMBFirmwareDescription);
		
		
		// add image
						
			Toolkit myToolkit = Toolkit.getDefaultToolkit();
			
			URL imagePath = myToolkit.getClass().getResource("/images/pc_master_race_pj2.png");
		
			ImageIcon theImage = new ImageIcon(imagePath);
			
			JLabel thePicture = new JLabel(theImage);
			
			thePicture.setBounds(750, 10, 200, 400);
			
			add(thePicture);
			
		
		
	}
}
