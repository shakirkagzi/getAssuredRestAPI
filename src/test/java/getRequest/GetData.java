package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
	@Test
	public void testResponsecode()
	{
		Response resp= RestAssured.get("http://openweathermap.org/");
		int code = resp.getStatusCode();
		System.out.println("Response code: "+code);
		Assert.assertEquals(code, 200);
	}
	@Test
	public void testBody()
	{
		Response resp= RestAssured.get("http://openweathermap.org/");
		String data = resp.asString();
		System.out.println("Data is: "+data);
		System.out.println("Response Time:"+resp.getTime());
	}
}
