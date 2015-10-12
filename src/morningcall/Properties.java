package morningcall;

import java.util.ResourceBundle;

public class Properties {

	private String account_sid;
	private String auth_token;
	private String to;
	private String from;
	private String url;
	private String file_path;
	private String city;
	private String app_id;
	
	Properties(){
		ResourceBundle bundle = ResourceBundle.getBundle("MoringCall");
		setAccount_sid(bundle.getString("account_sid"));
		setAuth_token(bundle.getString("auth_token"));
		setTo(bundle.getString("to"));
		setFrom(bundle.getString("from"));
		setUrl(bundle.getString("url"));
		setFile_path(bundle.getString("file_path"));
		setCity(bundle.getString("city"));
		setApp_id(bundle.getString("app_id"));
	}
	
	public String getAccount_sid() {
		return account_sid;
	}
	public void setAccount_sid(String account_sid) {
		this.account_sid = account_sid;
	}
	public String getAuth_token() {
		return auth_token;
	}
	public void setAuth_token(String auth_token) {
		this.auth_token = auth_token;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getApp_id() {
		return app_id;
	}
	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}
	
	
}
