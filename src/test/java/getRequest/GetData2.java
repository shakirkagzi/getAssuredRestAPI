package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetData2 {
	@Test 
	public void testResponsecode()
	{
		int code= get("http://openweathermap.org/").getStatusCode();
		Assert.assertEquals(code, 200);
		System.out.println("Status Code: "+code);
	}
	@Test(dependsOnMethods="testResponsecode")
	public void testBody()
	{
		String data=get("http://openweathermap.org/").asString();
		System.out.println("Data is: "+data);
		long time=get("http://openweathermap.org/").getTime();
		System.out.println("Response Time:"+time);
	}
}
