package com.nastation.c16;

//: appendixa:DeepCopy.java
//Cloning a composed object.
class DepthReading implements Cloneable {
	private double depth;

	public DepthReading(double depth) {
		this.depth = depth;
	}

	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace(System.err);
		}
		return o;
	}

	public void change(double d) {
		this.depth = d;
	}

	@Override
	public String toString() {
		return "depth=" + depth;
	}

}

class TemperatureReading implements Cloneable {
	private long time;
	private double temperature;

	public TemperatureReading(double temperature) {
		time = System.currentTimeMillis();
		this.temperature = temperature;
	}

	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace(System.err);
		}
		return o;
	}

	@Override
	public String toString() {
		return "time=" + time + ",temp=" + temperature;
	}
}

class OceanReading implements Cloneable {
	private DepthReading depth;
	private TemperatureReading temperature;

	public OceanReading(double tdata, double ddata) {
		temperature = new TemperatureReading(tdata);
		depth = new DepthReading(ddata);
	}

	public void change(double d) {
		depth.change(d);
	}

	public Object clone() {
		OceanReading o = null;
		try {
			o = (OceanReading) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace(System.err);
		}
		// Must clone references:
		o.depth = (DepthReading) o.depth.clone();
		o.temperature = (TemperatureReading) o.temperature.clone();
		return o; // Upcasts back to Object
	}

	@Override
	public String toString() {
		return depth + "," + temperature;
	}
}

public class DeepCopy {
	public static void main(String[] args) {
		OceanReading reading = new OceanReading(33.9, 100.5);
		System.out.println(reading);

		// Now clone it:
		OceanReading r = (OceanReading) reading.clone();
		reading.change(88.88);
		System.out.println(r);
	}
}