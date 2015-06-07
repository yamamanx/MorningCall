package morningcall;

import org.w3c.dom.Document;

import weathermap.APIURL;
import weathermap.GenerateJsonString;

public class MainProcess {

	public static void main(String[] args) {

		Properties properties = new Properties();

		String filePath = properties.getFile_path();

		APIURL apiUrl = new APIURL(properties.getCity(), "weather");
		GenerateJsonString generateJsonString = new GenerateJsonString();
		GenerateXMLFile generateXmlFile = new GenerateXMLFile();

		generateJsonString.setJsonData(apiUrl.getUrlString());
		generateXmlFile.GenerateWeatherString(generateJsonString.getJsonData());

		apiUrl.setUrlString(properties.getCity(), "forecast");

		generateJsonString.setJsonData(apiUrl.getUrlString());
		generateXmlFile
				.GenerateForecastString(generateJsonString.getJsonData());

		String sayString = generateXmlFile.getSayString();
		Document xmlDocument = generateXmlFile.SayXMLDocument(sayString);
		generateXmlFile.WriteXMLFile(xmlDocument, filePath);

		TwilioCall twilioCall = new TwilioCall();
		twilioCall.doCall(properties);

	}

}
