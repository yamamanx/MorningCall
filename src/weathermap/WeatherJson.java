package weathermap;

import java.util.ArrayList;

public class WeatherJson {
	private coord coord;

	public class coord {
		private double lon;
		private double lat;

		public double getLon() {
			return this.lon;
		}

		public void setLon(double lon) {
			this.lon = lon;
		}

		public double getLat() {
			return this.lat;
		}

		public void setLat(double lat) {
			this.lat = lat;
		}
	}

	private sys sys;

	public class sys {
		private double message;
		private String country;
		private long sunrise;
		private long sunset;

		public double getMessage() {
			return message;
		}

		public void setMessage(double message) {
			this.message = message;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public long getSunrise() {
			return sunrise;
		}

		public void setSunrise(long sunrise) {
			this.sunrise = sunrise;
		}

		public long getSunset() {
			return sunset;
		}

		public void setSunset(long sunset) {
			this.sunset = sunset;
		}

	}

	private ArrayList<weather> weather;

	public class weather {
		private int id;
		private String main;
		private String description;
		private String icon;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getMain() {
			return main;
		}

		public void setMain(String main) {
			this.main = main;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

	}

	private String base;

	private main main;

	public class main {
		private double temp;
		private double temp_min;
		private double temp_max;
		private double pressure;
		private double sea_level;
		private double grnd_level;
		private double humidity;

		public double getTemp() {
			return temp;
		}

		public void setTemp(double temp) {
			this.temp = temp;
		}

		public double getTemp_min() {
			return temp_min;
		}

		public void setTemp_min(double temp_min) {
			this.temp_min = temp_min;
		}

		public double getTemp_max() {
			return temp_max;
		}

		public void setTemp_max(double temp_max) {
			this.temp_max = temp_max;
		}

		public double getPressure() {
			return pressure;
		}

		public void setPressure(double pressure) {
			this.pressure = pressure;
		}

		public double getSea_level() {
			return sea_level;
		}

		public void setSea_level(double sea_level) {
			this.sea_level = sea_level;
		}

		public double getGrnd_level() {
			return grnd_level;
		}

		public void setGrnd_level(double grnd_level) {
			this.grnd_level = grnd_level;
		}

		public double getHumidity() {
			return humidity;
		}

		public void setHumidity(double humidity) {
			this.humidity = humidity;
		}

	}

	private wind wind;

	public class wind {
		private double speed;
		private double deg;

		public double getSpeed() {
			return speed;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}

		public double getDeg() {
			return deg;
		}

		public void setDeg(double deg) {
			this.deg = deg;
		}

	}

	private clouds clouds;

	public class clouds {
		private long all;

		public long getAll() {
			return all;
		}

		public void setAll(long all) {
			this.all = all;
		}

	}

	private long dt;
	private long id;
	private String name;

	private long cod;

	public coord getCoord() {
		return coord;
	}

	public void setCoord(coord coord) {
		this.coord = coord;
	}

	public sys getSys() {
		return sys;
	}

	public void setSys(sys sys) {
		this.sys = sys;
	}

	public ArrayList<weather> getWeather() {
		return weather;
	}

	public void setWeather(ArrayList<weather> weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public main getMain() {
		return main;
	}

	public void setMain(main main) {
		this.main = main;
	}

	public wind getWind() {
		return wind;
	}

	public void setWind(wind wind) {
		this.wind = wind;
	}

	public clouds getClouds() {
		return clouds;
	}

	public void setClouds(clouds clouds) {
		this.clouds = clouds;
	}

	public long getDt() {
		return dt;
	}

	public void setDt(long dt) {
		this.dt = dt;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCod() {
		return cod;
	}

	public void setCod(long cod) {
		this.cod = cod;
	}

}
