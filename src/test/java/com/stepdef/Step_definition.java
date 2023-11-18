package com.stepdef;

import com.Base_class.Methods;
import com.Pom.Login;

import cucumber.api.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step_definition extends Methods{
	Login l=new Login();
		@When("User launch the url {string}")
		public void user_launch_the_url(String url) throws InterruptedException {
		    geturl(url);
		    Thread.sleep(5000);
		}
@And("User clicks on Shop men")
public void user_clicks_on_Shop_men() throws InterruptedException {
			Thread.sleep(7000);
			click(l.getShopmen());
		}
	
@And("User clicks on men module")
public void user_clicks_on_men_module() throws InterruptedException {
	Thread.sleep(5000);
		   actions(l.getMen());
		}

@And("User select on T-shirts submodule")
public void user_select_on_T_shirts_submodule() throws InterruptedException {
	Thread.sleep(5000);
		  click(l.getT_shirts());
		}

@And("User clicks on selected T-shirt")
public void user_select_on_clicks_on_selected_T_shirt() throws InterruptedException {
	Thread.sleep(5000);
		  click(l.getProduct()); 
		}
@And("User select on size")
public void user_select_on_size() throws InterruptedException {
	Thread.sleep(5000);
	click(l.getSelectsize());
}

@Then("User clicks on Add to cart button")
public void user_clicks_on_Add_to_cart_button() {
		  click(l.getAddtocart());
		}
@And("User close the browser")
public void user_close_the_browser() {  
	closemethod();
		}
		
		

		

	
}

