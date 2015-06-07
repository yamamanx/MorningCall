package weathermap;

public class ConditionCode {

	private String conditionString;

	public String getConditionString() {
		return conditionString;
	}

	public void setConditionString(int conditionId) {
		switch (conditionId) {
		case 200:
			this.conditionString = "軽い雨の雷雨です。";
			break;
		case 201:
			this.conditionString = "雷雨です。";
			break;
		case 202:
			this.conditionString = "激しい雨の雷雨です。";
			break;
		case 210:
			this.conditionString = "軽い雷です。";
			break;
		case 211:
			this.conditionString = "雷です。";
			break;
		case 212:
			this.conditionString = "激しい雷です。";
			break;
		case 221:
			this.conditionString = "超激しい雷です。";
			break;
		case 230:
			this.conditionString = "軽い霧雨と雷です。";
			break;
		case 231:
			this.conditionString = "霧雨と雷です。";
			break;
		case 232:
			this.conditionString = "激しい霧雨と雷です。";
			break;
		case 300:
			this.conditionString = "軽い霧雨です。";
			break;
		case 301:
			this.conditionString = "霧雨です。";
			break;
		case 302:
			this.conditionString = "激しい霧雨です。";
			break;
		case 310:
			this.conditionString = "軽い霧と雨です。";
			break;
		case 311:
			this.conditionString = "霧と雨です。";
			break;
		case 312:
			this.conditionString = "激しい霧と雨です。";
			break;
		case 313:
			this.conditionString = "霧雨と霧です。";
			break;
		case 314:
			this.conditionString = "激しい霧雨と雨です。";
			break;
		case 321:
			this.conditionString = "細かい霧雨です。";
			break;
		case 500:
			this.conditionString = "軽い雨です。";
			break;
		case 501:
			this.conditionString = "雨です。";
			break;
		case 502:
			this.conditionString = "激しい雨です。";
			break;
		case 503:
			this.conditionString = "超激しい雨です。";
			break;
		case 504:
			this.conditionString = "ウルトラ激しい雨です。";
			break;
		case 511:
			this.conditionString = "冷たい雨です。";
			break;
		case 520:
			this.conditionString = "軽いシャワーのような雨です。";
			break;
		case 521:
			this.conditionString = "シャワーのような雨です。";
			break;
		case 522:
			this.conditionString = "激しいシャワーのような雨です。";
			break;
		case 531:
			this.conditionString = "超シャワーの雨です。";
			break;
		case 600:
			this.conditionString = "軽い雪です。";
			break;
		case 601:
			this.conditionString = "雪です。";
			break;
		case 602:
			this.conditionString = "激しい雪です。";
			break;
		case 611:
			this.conditionString = "みぞれです。";
			break;
		case 612:
			this.conditionString = "細かいみぞれです。";
			break;
		case 615:
			this.conditionString = "軽い雨と雪です。";
			break;
		case 616:
			this.conditionString = "雨と雪です。";
			break;
		case 620:
			this.conditionString = "軽く細かい雪です。";
			break;
		case 621:
			this.conditionString = "細かい雪です。";
			break;
		case 622:
			this.conditionString = "激しく細かい雪です。";
			break;
		case 701:
			this.conditionString = "霧状です。";
			break;

		case 711:
			this.conditionString = "煙っています。";
			break;
		case 721:
			this.conditionString = "ヘイズです。";
			break;
		case 731:
			this.conditionString = "砂埃です。";
			break;
		case 741:
			this.conditionString = "霧霧です。";
			break;
		case 751:
			this.conditionString = "砂です。";
			break;
		case 761:
			this.conditionString = "埃です。";
			break;
		case 771:
			this.conditionString = "スコールです。";
			break;
		case 781:
			this.conditionString = "竜巻です。";
			break;
		case 800:
			this.conditionString = "快晴です。";
			break;
		case 801:
			this.conditionString = "晴れです。";
			break;
		case 802:
			this.conditionString = "ところどころ曇りです。";
			break;
		case 803:
			this.conditionString = "やや曇りです。";
			break;
		case 804:
			this.conditionString = "曇りです。";
			break;
		case 900:
			this.conditionString = "竜巻です。";
			break;
		case 901:
			this.conditionString = "鮮やかな雲です。";
			break;
		case 902:
			this.conditionString = "ハリケーンです。";
			break;
		case 903:
			this.conditionString = "寒いです。";
			break;
		case 904:
			this.conditionString = "暑いです。";
			break;
		case 905:
			this.conditionString = "風があります。";
			break;
		case 906:
			this.conditionString = "ひょうです。";
			break;
		case 951:
			this.conditionString = "穏やかです。";
			break;
		case 952:
			this.conditionString = "軽い風です。";
			break;
		case 953:
			this.conditionString = "そよ風です。";
			break;
		case 954:
			this.conditionString = "風です。";
			break;
		case 955:
			this.conditionString = "さわやかな風です。";
			break;
		case 956:
			this.conditionString = "強い風です。";
			break;
		case 957:
			this.conditionString = "早い強風です。";
			break;
		case 958:
			this.conditionString = "強風です。";
			break;
		case 959:
			this.conditionString = "かなり強風です。";
			break;
		case 960:
			this.conditionString = "嵐です。";
			break;
		case 961:
			this.conditionString = "バイオレンスな嵐です。";
			break;
		case 962:
			this.conditionString = "ハリケーンです。";
			break;
		default:
			this.conditionString = "わかりません。ID" + "は" + conditionId;
		}

	}

}
