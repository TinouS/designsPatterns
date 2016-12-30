package memento;

public class Memento {

	private double temperature;
	private double pressure;
	private double volume;

	public Memento(double temperature, double pressure, double volume) {
		super();
		this.temperature = temperature;
		this.pressure = pressure;
		this.volume = volume;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "temperature : " + temperature + ", pressure : " + pressure + ", volume : " + volume;
	}
}
