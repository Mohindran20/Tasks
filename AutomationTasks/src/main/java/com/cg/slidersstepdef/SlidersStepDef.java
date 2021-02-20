package com.cg.slidersstepdef;

import com.cg.page.Sliders;

import io.cucumber.java.en.*;

public class SlidersStepDef {

	Sliders slider;

	@Given("User opens the browser and go to webpage")
	public void user_opens_the_browser_and_go_to_webpage() {
		slider = new Sliders();
	}

	@When("User click shop menu")
	public void user_click_shop_menu() {
		slider.Shop();
	}

	@When("user click on Home menu")
	public void user_click_on_Home_menu() {
		slider.Home();
	}

	@When("test home page has three slides only")
	public void test_home_page_has_three_slides_only() {

	}

	@Then("check its only have three slides")
	public void check_its_only_have_three_slides() {

	}

}
