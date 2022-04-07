package myhardware.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import myhardware.model.Components;
import oshi.SystemInfo;
import oshi.hardware.Baseboard;
import oshi.hardware.CentralProcessor;
import oshi.hardware.ComputerSystem;
import oshi.hardware.Firmware;
import oshi.hardware.GlobalMemory;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.PowerSource;
import oshi.hardware.Sensors;
import oshi.hardware.common.AbstractBaseboard;
import oshi.hardware.common.AbstractCentralProcessor;
import oshi.software.os.OperatingSystem;





public class MyJpanelHardwareInfo extends JPanel{
	
	
	public MyJpanelHardwareInfo(Components theComponents) {
		
		//set it setLayout = null so you can use setBounds and move it anywhere
		setLayout(null);
		//setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel labelCpu = new JLabel("Processor/CPU:");
		labelCpu.setBounds(70, 100, 120, 20);
		labelCpu.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelCpu);
		
		JTextArea textCpu = new JTextArea();
		//textCpu.setBounds(x, y, width, height);
		textCpu.setBounds(200, 95, 450, 190);
		textCpu.setText(theComponents.getProcessorHardware());
		textCpu.setEditable(false);
		textCpu.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(textCpu);

		
		/*
		JLabel labelCurrentFreq = new JLabel("Current frequency:");
		labelCurrentFreq.setBounds(70, 350, 150, 20);
		labelCurrentFreq.setFont(new Font("comic sans ms", Font.BOLD,16));
		add(labelCurrentFreq);
		
		JTextField textCurrentFreq = new JTextField();
		textCurrentFreq.setBounds(230, 350, 100, 20);
		textCurrentFreq.setFont(new Font("comic sans ms", Font.BOLD,16));
		textCurrentFreq.setBorder(BorderFactory.createEmptyBorder());
		textCurrentFreq.setEditable(false);
		textCurrentFreq.setText(theComponents.getCurrentFreq());
		add(textCurrentFreq);
		*/
		
		
		JLabel labelMaxFreq = new JLabel("Maximum frequeny:");
		labelMaxFreq.setBounds(70, 320, 150, 20);
		labelMaxFreq.setFont(new Font("comic sans ms", Font.BOLD, 16));
		add(labelMaxFreq);
		
		JTextField textMaxFreq = new JTextField();
		textMaxFreq.setBounds(230, 320, 100, 20);
		textMaxFreq.setFont(new Font("comic sans ms", Font.BOLD, 16));
		textMaxFreq.setBorder(BorderFactory.createEmptyBorder());
		textMaxFreq.setEditable(false);
		textMaxFreq.setText(theComponents.getMaxFreq());
		add(textMaxFreq);
		
		
		
		JLabel labelRamMemory = new JLabel("Ram memory:");
		labelRamMemory.setBounds(70, 370, 120, 20);
		labelRamMemory.setFont(new Font("comic sans ms", Font.BOLD, 16));
		add(labelRamMemory);
		
		JTextField textRamMemory = new JTextField();
		textRamMemory.setBounds(220, 370, 400, 20);
		textRamMemory.setFont(new Font("comic sans ms", Font.BOLD, 16));
		textRamMemory.setBorder(BorderFactory.createEmptyBorder());
		textRamMemory.setEditable(false);
		textRamMemory.setText(theComponents.getMemory());
		add(textRamMemory);
		
		
		JLabel labelOS = new JLabel("Operating system:");
		labelOS.setBounds(70, 420, 190, 20);
		labelOS.setFont(new Font("comic sans ms", Font.BOLD, 16));
		add(labelOS);
		
		JTextField textOS = new JTextField();
		textOS.setBounds(240, 420, 500, 20);
		textOS.setFont(new Font("comic sans ms", Font.BOLD, 16));
		textOS.setBorder(BorderFactory.createEmptyBorder());
		textOS.setEditable(false);
		textOS.setText(theComponents.getOperatingSystem());
		add(textOS);
		
		
		
		//add image
					
			Toolkit myToolkit = Toolkit.getDefaultToolkit();
			
			URL imagePath = myToolkit.getClass().getResource("/images/pc_master_race_pj2.png");
			
			ImageIcon theImage = new ImageIcon(imagePath);
									
			JLabel thePicture = new JLabel(theImage);
			
			thePicture.setBounds(750, 10, 200, 400);
			
			add(thePicture);
			
	
		
	}
	
	
	
	
	
	
	
	
	
}
