package weathermap;

public class APIURL {
	private String urlString;
	private String basicUrlString;
	
	public APIURL(String CityName,String Type,String appId){
		this.basicUrlString = "http://api.openweathermap.org/data/2.5/";
		setUrlString(CityName,Type,appId);
	}
	
	public void setUrlString(String CityName,String Type,String appId){
		this.urlString = this.basicUrlString + Type + "?q=" + CityName + ",jp" + "&units=metric"
		+ "&appid=" + appId;
	}
	
	public String getUrlString(){
		return this.urlString;
	}
}
