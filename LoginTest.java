package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {  //Successful Login
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("loginusername")).sendKeys("testuser123");
        driver.findElement(By.id("loginpassword")).sendKeys("P@$$wOrd123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(4000);
        driver.quit();
        //UnSuccessful Login
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("loginusername")).sendKeys("testuser123");
        driver.findElement(By.id("loginpassword")).sendKeys("WrongPassword");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(3000);
        driver.quit();
        //UserName with Special Characters
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("loginusername")).sendKeys("user-test");
        driver.findElement(By.id("loginpassword")).sendKeys("CorrectPass123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(3000);
        driver.quit();
        //InActivity Within Timeout
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("loginusername")).sendKeys("testuser123");
        driver.findElement(By.id("loginpassword")).sendKeys("P@$$wOrd123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(5000);
        driver.get("https://www.demoblaze.com/cart.html");
        Thread.sleep(3000);
        driver.get("https://www.demoblaze.com/index.html");
        Thread.sleep(2000);
        driver.quit();
        //Incorrect username
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("loginusername")).sendKeys("nonexistinguser");
        driver.findElement(By.id("loginpassword")).sendKeys("anypassword");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(3000);
        driver.quit();
        //Multiple Failed Attempts
        driver.get("https://www.demoblaze.com/");

        for (int i = 0; i < 3; i++) {
            driver.findElement(By.id("login2")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("loginusername")).sendKeys("wronguser");
            driver.findElement(By.id("loginpassword")).sendKeys("wrongpass");
            driver.findElement(By.xpath("//button[text()='Log in']")).click();
            Thread.sleep(3000);
        }

        driver.quit();
        //Leading /Trailling Spaces
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("loginusername")).sendKeys(" testuser123");
        driver.findElement(By.id("loginpassword")).sendKeys("P@$$wOrd123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("login2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("loginusername")).sendKeys("testuser123 ");
        driver.findElement(By.id("loginpassword")).sendKeys("P@$$wOrd123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(3000);

        driver.quit();

    }
}