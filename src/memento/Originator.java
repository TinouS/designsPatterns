package memento;

public class Originator {

	private double temperature;
	private double pressure;
	private double volume;

	public void setState(double temperature, double pressure, double volume) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.volume = volume;
	}

	public Memento saveToMemento() {
		return new Memento(temperature, pressure, volume);
	}

	public void restoreStateFromMemento(Memento m) {
		this.temperature = m.getTemperature();
		this.pressure = m.getPressure();
		this.volume = m.getVolume();
	}

	@Override
	public String toString() {
		return "temperature : " + temperature + ", pressure : " + pressure + ", volume : " + volume;
	}

}
