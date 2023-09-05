package pages;

	import org.openqa.selenium.WebDriver;

	import utils.SeleniumWrappers;
	
	//toate clasele de page objects, vor extinde selenium wrappers
	//cand folosim findby nu mai facem driver find element
	
	public class BasePage extends SeleniumWrappers{

		public BasePage(WebDriver driver) {
			super(driver);
		}

		public MenuPage menu =  new MenuPage(driver);
		public MyAccountPage myAccount = new MyAccountPage(driver);
		
	}