package weathermap;

public class APIURL {
	private String urlString;
	private String basicUrlString;
	
	public APIURL(String CityName,String Type){
		this.basicUrlString = "http://api.openweathermap.org/data/2.5/";
		setUrlString(CityName,Type);
	}
	
	public void setUrlString(String CityName,String Type){
		this.urlString = this.basicUrlString + Type + "?q=" + CityName + ",jp" + "&units=metric";
	}
	
	public String getUrlString(){
		return this.urlString;
	}
}
