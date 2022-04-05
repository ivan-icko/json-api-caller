package domain;



public class Current {

	
	private int temperature;
	private int wind_speed;
	private int pressure;
	private int humidity;
	
	
	
	
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public int getWind_speed() {
		return wind_speed;
	}
	public void setWind_speed(int wind_speed) {
		this.wind_speed = wind_speed;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	@Override
	public String toString() {
		return "temperatura=" + temperature+", brzina vetra: "+wind_speed+"Km/h"+", pritisak: "+pressure+"Mbar"+", vlaznost vazduha: "+humidity+"%";
	}
	
	
	
}
