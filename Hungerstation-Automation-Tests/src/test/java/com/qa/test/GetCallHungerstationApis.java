package com.qa.test;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;




public class GetCallHungerstationApis {

	
@Test


public void IsUserAbleToOpenApp_testOpeningApi () {

	
	given().
	when()
	.get ("https://hs-staging.com/api/v2/devices/open").
	then().
	assertThat ().
	statusCode(204);
	
	}
	
@Test
public void IsUserAbleToSelectAddress_TestSpecificLocationCordinates () {


	given().
	when()
	.get ("https://hs-staging.com/api/v2/locals/coords?lat=24.8284551&lng=46.639818").
	then().
	assertThat ().
	statusCode(200);
	{
	}
}

	@Test
	public void UserShouldSeePromotionsBanner_TestPromotionBannerOnListingScreen () {


		given().
		when()
		.get ("https://hs-staging.com/api/v2/promotions/banner?lat=24.81839942932129&lng=46.64219665527344&placement=restaurant_listing_screen").
		then().
		assertThat ().
		statusCode(200);
		{
		
		
	}
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
