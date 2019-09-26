package zetShop;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testNavigat {
    public static WebDriver driver;
    @Given("^Open home page$")
    public void Open_home_page(){
        System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
    driver = new ChromeDriver();
        driver.get("https://zetshop.com.ua");
    }
    @And("^Find the search form$")
    public void Find_the_search_form() {
        WebElement formSearch = driver.findElement(By.xpath("//input[@id='search_input']"));
    }
    @And("^Find the button ПОИСК$")
    public void Find_the_button_ПОИСК() {
        WebElement buttonПОИСК = driver.findElement(By.xpath("//input[@id='button_search']"));
    }
@And("^Enter the request in field search$")
    public void Enter_the_request_in_field_search() {
    driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("колодки");
}
@And("^Push button ПОИСК$")
    public void Push_button_ПОИСК() {
    WebElement push = driver.findElement(By.xpath("//input[@id='button_search']"));
}


}

