package login.io.login;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class google {

	private static final int HTTP_STATUS_CODE = 200;

	@Test
	public void RegistrationSuccessful() {
		RestAssured.baseURI = "https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&dsh=S-167357984%3A1568626928786246&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Virender"); // Cast
		requestParams.put("LastName", "Singh");
		requestParams.put("UserName", "sdimpleuser2dd2011");
		requestParams.put("Password", "password1");
		requestParams.put("Email", "sample2ee26d9@gmail.com");

		request.body(((JSONObject) requestParams).toJSONString());
		Response response = request.get("/register");

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());
	}
}
