package morningcall;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import weathermap.ConditionCode;
import weathermap.ForecastJson;
import weathermap.ForecastJson.list;
import weathermap.ForecastJson.list.main;
import weathermap.ForecastJson.list.weather;
import weathermap.WeatherJson;

import com.google.gson.Gson;

public class GenerateXMLFile {

	private Gson gson;
	private String todayString;
	private String sayString;

	GenerateXMLFile() {
		gson = new Gson();
		todayString = getTodayString();
		sayString = todayString.substring(0, 4) + "" + "年"
				+ todayString.substring(5, 7) + "月"
				+ todayString.substring(8, 10) + "日の天気をお知らせします。";
	}

	public void GenerateWeatherString(String jsonString) {
		WeatherJson weatherJson = gson.fromJson(jsonString, WeatherJson.class);
		ArrayList<weathermap.WeatherJson.weather> weatherWeather = weatherJson
				.getWeather();
		WeatherJson.main weatherMain = weatherJson.getMain();
		ConditionCode conditionCode = new ConditionCode();
		conditionCode.setConditionString(weatherWeather.get(0).getId());
		sayString += "現在の気温は" + weatherMain.getTemp() + "度。天気は"
				+ conditionCode.getConditionString();
		conditionCode = null;
	}

	public void GenerateForecastString(String jsonString) {
		ForecastJson forecastJson = gson.fromJson(jsonString,
				ForecastJson.class);
		ArrayList<list> forecastLists = forecastJson.getList();

		int loopNumber = 0;
		for (list forecastList : forecastLists) {
			switch (loopNumber) {
			case 3:
			case 5:
				main forecastMain = forecastList.getMain();
				ArrayList<weather> forecastWeather = forecastList.getWeather();
				ConditionCode conditionCode = new ConditionCode();
				conditionCode
						.setConditionString(forecastWeather.get(0).getId());
				sayString += getJpTimeString(forecastList.getDt_txt()) + "時の気温は" + forecastMain.getTemp()
						+ "度。天気は" + conditionCode.getConditionString();
				conditionCode = null;
				break;
			}
			loopNumber++;
		}
	}

	public String getSayString() {
		return this.sayString;
	}

	private String getJpTimeString(String dt_txt) {

		String jpTimeString = "";

		int jpTimeInt = Integer.parseInt(dt_txt.substring(11, 13)) + 9;
		if (jpTimeInt > 23) {
			jpTimeString = "明日" + (jpTimeInt - 24);
		} else {
			jpTimeString = String.valueOf(jpTimeInt);
		}
		return jpTimeString;
	}

	private String getTodayString() {

		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String todayString = dateFormat.format(calendar.getTime());

		return todayString;
	}

	public Document SayXMLDocument(String sayString) {
		DocumentBuilder builder = null;

		String voice = "alice";
		String language = "ja-jp";

		try {
			builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		Document XMLDocument = builder.newDocument();

		Element response = XMLDocument.createElement("Response");
		XMLDocument.appendChild(response);
		Element say = XMLDocument.createElement("Say");
		say.setAttribute("voice", voice);
		say.setAttribute("language", language);
		say.appendChild(XMLDocument.createTextNode(sayString));
		response.appendChild(say);

		return XMLDocument;
	}

	public void WriteXMLFile(Document XMLDocument, String filePath) {
		Transformer transformer = null;
		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		try {
			transformer = transformerFactory.newTransformer();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		}
		transformer.setOutputProperty("indent", "yes");
		transformer.setOutputProperty("encoding", "UTF-8");

		try {
			transformer.transform(new DOMSource(XMLDocument), new StreamResult(
					filePath));
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}
}
