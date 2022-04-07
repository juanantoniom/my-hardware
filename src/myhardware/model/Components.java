package myhardware.model;

import java.util.List;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.CentralProcessor.ProcessorIdentifier;
import oshi.hardware.GlobalMemory;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.Sensors;
import oshi.software.os.OperatingSystem;
import oshi.util.FormatUtil;

public class Components {

	public Components() {
		
	}
	
	
	public String getProcessorHardware() {
		
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
				
		CentralProcessor processor = hal.getProcessor();
						
		String processor2 = processor.toString();
		
		return processor2 ;
				
	}
	
	public String getMemory() {
		
		SystemInfo systemInfo = new SystemInfo();
		GlobalMemory hardwardLayer =  systemInfo.getHardware().getMemory();
		
		return hardwardLayer.toString();
		
		
	}
	
	public String getMaxFreq() {
		
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		
		CentralProcessor processor = hal.getProcessor();
		
		long proceesor1 = processor.getMaxFreq();
		
		String processor2 = String.valueOf( proceesor1);
		
		String processor3 = processor2.substring(0, 1);
		
		String processor4 = processor2.substring(1,3);
		
		
		
		return processor3 + "," + processor4 + " GHz";
		
	}
	
	//Esta funcion esta bug , no detecta bien la frecuencia actual
	public String getCurrentFreq() {
		
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		
		CentralProcessor processor = hal.getProcessor();
		
		long[] proceesor1 = processor.getCurrentFreq();
		
		long proceesor2 = proceesor1[0];
		
		String processor3 = String.valueOf(proceesor2);
		
		String processor4 = processor3.substring(0, 3);
		
				
		String parnumerb1 = processor4.substring(0,1);
		
		String parnumber2 = processor4.substring(1, 3);
		
			
		
		return parnumerb1 + "," +  parnumber2 + " GHz" ;
		
	}
	
	
	
	
	public String getOperatingSystem() {
		
		SystemInfo systemInfo = new SystemInfo();
		OperatingSystem os = systemInfo.getOperatingSystem();
		
		
		
		return os.toString();
	}
	
	
	public String  getInfoGraphicsCard() {
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		List<GraphicsCard> cards = hal.getGraphicsCards();
		
		String mygraphic = "";
		for (GraphicsCard card : cards) {
             mygraphic = String.valueOf(card);
        }
			
		
		return mygraphic;
		
		
	}
	
	public String  getInfoGraphicsCardName() {
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		List<GraphicsCard> cards = hal.getGraphicsCards();
		
//		String mygraphic = "";
//		for (GraphicsCard card : cards) {
//             mygraphic = String.valueOf(card);
//        }
		
		//return mygraphic;

		
		
		
//	
		
		String GpuName = cards.get(0).getName().toString();
		
		return GpuName;
		
	}
	
	public String getInfoGraphicsCardVRam() {
		
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		List<GraphicsCard> cards = hal.getGraphicsCards();
		
		long vram = cards.get(0).getVRam();
		
		//utilizamos la clase FormatUtil y el metodo format bytes para covertirlo 
		return String.valueOf(FormatUtil.formatBytes(vram));
	}
	
	public String getInfoGraphicsCardVersionInfo() {

		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		List<GraphicsCard> cards = hal.getGraphicsCards();
		
		String VersionInfoCard = cards.get(0).getVersionInfo();
		
		return VersionInfoCard;
		
		
		
	}
	
	public String getInfoGraphicsCardVendor() {
		
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		List<GraphicsCard> cards = hal.getGraphicsCards();
		
		String vendorCard = cards.get(0).getVendor();
		
		return vendorCard;
	}
	
	
	
	
	// no funciona por los drivers para medir la temperatura del pc no estan instalados
	public String getSensor() {
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		Sensors processor = hal.getSensors();
		
		double p  = processor.getCpuTemperature();
		
		return String.valueOf(p) ;
	}
	
	
}
