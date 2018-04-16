package ua.kyiv.order_book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		String url = "https://www.bitstamp.net/api/order_book/";
		HttpClient client = HttpClientBuilder.create()
				.setDefaultRequestConfig(RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build()).build();
		HttpPost post = new HttpPost(url);
		
		HttpResponse response = client.execute(post);
		System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
			
		}
		
	}
}
