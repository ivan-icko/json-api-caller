package weather;

import java.util.Date;

public class WeatherCity {

	private String city;
	private String country;
	private Date dateTime;
	private int temperature;
	private double windSpeed;
	private int pressure;
	private int humidity;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public double getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	@Override
	public String toString() {
		return "WeatherCity [city=" + city + ", country=" + country + ", dateTime=" + dateTime + ", temperature="
				+ temperature + ", windSpeed=" + windSpeed + ", pressure=" + pressure + ", humidity=" + humidity + "]";
	}
	
	
}
