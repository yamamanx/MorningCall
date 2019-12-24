package morningcall;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.CallFactory;
import com.twilio.sdk.resource.instance.Call;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import java.util.ArrayList;
import java.util.List;

public class TwilioCall {

	public void doCall(Properties properties) {
		TwilioRestClient client = new TwilioRestClient(
				properties.getAccount_sid(), properties.getAuth_token());
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("To", properties.getTo()));
		params.add(new BasicNameValuePair("From", properties.getFrom()));
		params.add(new BasicNameValuePair("Url", properties.getUrl()));
		params.add(new BasicNameValuePair("Method", "GET"));
		params.add(new BasicNameValuePair("FallbackMethod", "GET"));
		params.add(new BasicNameValuePair("StatusCallbackMethod", "GET"));
		params.add(new BasicNameValuePair("Record", "false"));

		CallFactory callFactory = client.getAccount().getCallFactory();
		Call call = null;
		try {
			call = callFactory.create(params);
		} catch (TwilioRestException e) {
			e.printStackTrace();
		}
		System.out.println("Twilio Call SID!!:" + call.getSid());
	}

}
