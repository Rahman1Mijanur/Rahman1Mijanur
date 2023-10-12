import io.netty.buffer.ByteBufProcessor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathException;

public class Qaclass



{
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.xpath("//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']")).click();
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        driver.navigate().back();
       driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket")).click();
       driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
       driver.findElement(By.cssSelector("#checkout")).click();
       driver.findElement(By.cssSelector("#first-name")).sendKeys("Mijanur");
       driver.findElement(By.cssSelector("#last-name")).sendKeys("Rahman");
       driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("10462");
      driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
      driver.findElement(By.cssSelector("#finish")).click();
       driver.quit();









    }
    }
