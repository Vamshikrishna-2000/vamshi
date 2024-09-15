package cucumber.apiautomation;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import java.util.HashMap;
import static io.restassured.matcher.RestAssuredMatchers.*;
public class apiautomation {
	@Test
	public void getrequest() {
		given()
		.when()
		.get("https://reqres.in/api/users/2")
		.then()
		.log().all()
		.statusCode(200);	
	}
	@Test 
	public void verifygetrequestwithrecord() {
	Response res=given()	
			    .when()
				.get("https://reqres.in/api/users?page=2");
				String actual=res.jsonPath().getString("per_page");
				String expected="6";
				Assert.assertEquals(actual,expected);	
	}
	@Test
	public void postrequest() {
		HashMap hm=new HashMap();
		hm.put("name","morpheus");
		hm.put("job","leader");
		given()
	   .contentType("application/json").body(hm)
	   .when()
	   .post("https://reqres.in/api/users")
	   .then()
	   //.body("name", equalToIgnoringCase("morpheus"))
	   .statusCode(201)
	   .log().all();
		}
	@Test
	public void verifypatchrequest() {
		HashMap m=new HashMap();
		m.put("job","tl");
		given()
		.contentType("application/json").body(m)
		.when()
		.patch("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().all();
	}
	@Test
	public void verifyputrquest() {
		HashMap h=new HashMap();
		h.put( "name","vamshi");
		h.put("job", "tl");
		given()
		.contentType("application/json").body(h)
		.when()
		.put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().all();
			}
	@Test
	public void verifydeleterequest() {
		given()
		.when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log().all();
			}
	}
