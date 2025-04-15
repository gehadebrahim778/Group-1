package Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpTest {   //SignUp1 to SignuP3
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("sign-username")).sendKeys("testuser123");
        driver.findElement(By.id("sign-password")).sendKeys("P@$$wOrd123");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {}
        driver.quit();

        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("sign-username")).sendKeys("test_user_123");
        driver.findElement(By.id("sign-password")).sendKeys("StrongPassword1");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {}
        driver.quit();

        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("sign-username")).sendKeys("uniqueUser567");
        driver.findElement(By.id("sign-password")).sendKeys("SecureP@ss123!");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {}
        driver.quit();

        //SignUp5 To SignUp12
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("sign-username")).sendKeys("");
        driver.findElement(By.id("sign-password")).sendKeys("ValidPass123");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {}
        driver.quit();

        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("sign-username")).sendKeys("uniqueUser789");
        driver.findElement(By.id("sign-password")).sendKeys("");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {}
        driver.quit();

        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("sign-username")).sendKeys("ab");
        driver.findElement(By.id("sign-password")).sendKeys("ValidPass123");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {}
        driver.quit();

        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("sign-username")).sendKeys("averyveryveryveryverylongusername");
        driver.findElement(By.id("sign-password")).sendKeys("ValidPass123");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {}
        driver.quit();

        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("sign-username")).sendKeys("uniqueUser999");
        driver.findElement(By.id("sign-password")).sendKeys("123");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {}
        driver.quit();

        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("sign-username")).sendKeys("uniqueUser1000");
        driver.findElement(By.id("sign-password")).sendKeys("ThisIsAVeryLongPasswordMoreThanExpected123456789");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {}
        driver.quit();
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("sign-username")).sendKeys("test user");
        driver.findElement(By.id("sign-password")).sendKeys("ValidPass123");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {}
        driver.quit();
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("sign-username")).sendKeys("testuser123");
        driver.findElement(By.id("sign-password")).sendKeys("AnotherPass123");
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
        Thread.sleep(2000);
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {}
        driver.quit();
    }
}


