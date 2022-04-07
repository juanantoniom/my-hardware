package myhardware.model;

import oshi.SystemInfo;
import oshi.hardware.Baseboard;
import oshi.hardware.ComputerSystem;
import oshi.hardware.Firmware;
import oshi.hardware.HardwareAbstractionLayer;

public class Motherboard {
	
	public Motherboard() {
		
	}
	
	
public String getMotheboardManufacturer() {
		
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		ComputerSystem computerSystem = hal.getComputerSystem();
		
		return  computerSystem.getManufacturer().toString();
	}
	
	public String getMotherboardModel() {
		
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		ComputerSystem thecomputerSystem = hal.getComputerSystem();
		
		String motherboard = thecomputerSystem.getModel();
		
		return motherboard;
		
	}
	
	public String getMotherboardVersion() {
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		ComputerSystem thecomputerSystem = hal.getComputerSystem();
		
		Baseboard themotherboad = thecomputerSystem.getBaseboard();
		
		String theMotherboadVersion = themotherboad.getVersion();
		
		return theMotherboadVersion;
		
	}
	
	public String getSerialNumber() {
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		ComputerSystem thecomputerSystem = hal.getComputerSystem();
		
		Baseboard themotherboad = thecomputerSystem.getBaseboard();
		
		String theMotherboardSerialNumber = themotherboad.getSerialNumber();
		
		return theMotherboardSerialNumber;
		
	}
	
	
	public String getMotherboardFirmwareVersion() {
		
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		ComputerSystem thecomputerSystem = hal.getComputerSystem();
		
		Firmware theFirmware = thecomputerSystem.getFirmware();
		
		String theFirmwareVersion = theFirmware.getVersion();
		
		return theFirmwareVersion;
	}
	
	public String getMotherboardFirmwareName() {
		
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		ComputerSystem thecomputerSystem = hal.getComputerSystem();
		
		Firmware theFirmware = thecomputerSystem.getFirmware();
		
		String theFirmwareName = theFirmware.getName();
		
		return theFirmwareName;
	}
	
	public String getMotherboardFirmwareManufacturer() {
		
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		ComputerSystem theComputerSystem = hal.getComputerSystem();
		
		Firmware theFirmware = theComputerSystem.getFirmware();
		
		String theFirmwareManufacturer = theFirmware.getManufacturer();
		
		return theFirmwareManufacturer;
		
		
		
	}
	
	public String getMotheboardFirmwareDescription() {
		SystemInfo systemInfo = new SystemInfo();
		HardwareAbstractionLayer hal = systemInfo.getHardware();
		
		ComputerSystem theComputerSystem = hal.getComputerSystem();
		
		Firmware theFirmware = theComputerSystem.getFirmware();
		
		String theFirmwareDescription = theFirmware.getDescription();
		
		return theFirmwareDescription;
		
		
		
	}
	

}
