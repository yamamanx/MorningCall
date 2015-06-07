package weathermap;

import java.util.ArrayList;
import com.google.gson.annotations.SerializedName;

public class ForecastJson {

	private String cod;
	private double message;

	private city city;

	public class city {
		private String id;
		private String name;

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

		private String country;
		private double population;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public double getPopulation() {
			return this.population;
		}

		public void setPopulation(double population) {
			this.population = population;
		}

		public coord getCoord() {
			return coord;
		}

		public void setCoord(coord coord) {
			this.coord = coord;
		}
	}

	private long cnt;
	private ArrayList<list> list;

	public class list {
		private long dt;

		private main main;

		public class main {
			private double temp;
			private double temp_min;
			private double temp_max;
			private double pressure;
			private double sea_level;
			private double grnd_level;
			private double humidity;
			private double temp_kf;

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

			public double getTemp_kf() {
				return temp_kf;
			}

			public void setTemp_kf(double temp_kf) {
				this.temp_kf = temp_kf;
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

		private rain rain;

		public class rain {
			@SerializedName("3h")
			private double threeh;

			public double getThreeh() {
				return this.threeh;
			}

			public void setThreeh(double threeh) {
				this.threeh = threeh;
			}
		}

		private sys sys;

		public class sys {
			private String pod;

			public String getPod() {
				return pod;
			}

			public void setPod(String pod) {
				this.pod = pod;
			}

		}

		private String dt_txt;

		public long getDt() {
			return dt;
		}

		public void setDt(long dt) {
			this.dt = dt;
		}

		public ArrayList<weather> getWeather() {
			return weather;
		}

		public void setWeather(ArrayList<weather> weather) {
			this.weather = weather;
		}

		public String getDt_txt() {
			return dt_txt;
		}

		public void setDt_txt(String dt_txt) {
			this.dt_txt = dt_txt;
		}

		public main getMain() {
			return main;
		}

		public void setMain(main main) {
			this.main = main;
		}

		public clouds getClouds() {
			return clouds;
		}

		public void setClouds(clouds clouds) {
			this.clouds = clouds;
		}

		public wind getWind() {
			return wind;
		}

		public void setWind(wind wind) {
			this.wind = wind;
		}

		public rain getRain() {
			return rain;
		}

		public void setRain(rain rain) {
			this.rain = rain;
		}

		public sys getSys() {
			return sys;
		}

		public void setSys(sys sys) {
			this.sys = sys;
		}

	}

	public String getCod() {
		return this.cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public double getmessage() {
		return this.message;
	}

	public void setMessage(double message) {
		this.message = message;
	}

	public long getCnt() {
		return this.cnt;
	}

	public void setCnt(long cnt) {
		this.cnt = cnt;
	}

	public ArrayList<list> getList() {
		return this.list;
	}

	public void setList(ArrayList<list> list) {
		this.list = list;
	}

	public city getCity() {
		return city;
	}

	public void setCity(city city) {
		this.city = city;
	}
}
