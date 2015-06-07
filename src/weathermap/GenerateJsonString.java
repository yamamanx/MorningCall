package weathermap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class GenerateJsonString {
	private String jsonDataString;

	public String getJsonData() {
		return this.jsonDataString;
	}

	public void setJsonData(String urlString) {
		StringBuilder builder = new StringBuilder();
		try {
			URL url = new URL(urlString);
			Object content = url.getContent();
			if (content instanceof InputStream) {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader((InputStream) content));
				String line;
				while ((line = reader.readLine()) != null) {
					builder.append(line);
				}
				this.jsonDataString = builder.toString();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
