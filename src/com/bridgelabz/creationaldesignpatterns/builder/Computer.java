package com.bridgelabz.creationaldesignpatterns.builder;

public class Computer {
	
	private String hdd;
	private String ram;
	
	private boolean isGraphicCardEnabled;
	private boolean isBluetoothEnabled;
	
	
	public String getHdd() {
		return hdd;
	}

	public String getRam() {
		return ram;
	}

	public boolean isGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	private Computer(ComputerBuilder computerBuilder) {
		this.ram = computerBuilder.ram;
		this.hdd = computerBuilder.hdd;
		this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
		this.isGraphicCardEnabled = computerBuilder.isGraphicCardEnabled;
	}
	
	public static class ComputerBuilder {
		
		private String hdd;
		private String ram;
		private boolean isGraphicCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String ram, String hdd) {
			this.hdd = hdd;
			this.ram = ram;
		}
		
		public ComputerBuilder setGraphicCardEnabled(boolean isGraphicCardEnabled) {
			this.isGraphicCardEnabled = isGraphicCardEnabled;
			return this;
		}
		
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}

	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ram=" + ram + ", isGraphicCardEnabled=" + isGraphicCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

}
