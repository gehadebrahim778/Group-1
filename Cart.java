package Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Cart {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


    @Test
    public void verifyAddingItemInCart()
    {
//        Verify that a user can successfully add a product to the cart.

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
        driver.findElement(By.xpath("//a[@onclick=\"addToCart(1)\"]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a")).click();
        driver.findElement(By.xpath("//a[@onclick=\"addToCart(2)\"]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alert.accept();

        driver.findElement(By.id("cartur")).click();
        driver.quit();
    }
    @Test
    public void verifyLoginPromptBeforeCheckout()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
        driver.findElement(By.xpath("//a[@onclick=\"addToCart(1)\"]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Farah");
        driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("Egypt");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Assiut");
        driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("5421080101000000");
        driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("May");
        driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("2025");
        driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
//        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[10]")).getText(),"Can't Place Order");

    }

    @Test
    public void verifyRemovingItemFromCart()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[5]/div/div/h4/a")).click();
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")).click();
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alert.accept();

        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
        driver.findElement(By.xpath("//a[@onclick=\"addToCart(1)\"]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alert.accept();

        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a")).click();
        driver.findElement(By.xpath("//a[@onclick=\"addToCart(2)\"]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alert.accept();

        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[3]/td[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[4]/a")).click();

    }

    @Test
    public void  verifyOrderWithoutItems()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Farah");
        driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("Egypt");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Assiut");
        driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("5421080101000000");
        driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("May");
        driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("2025");
        driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();


    }
    @Test
    public void verifyOrderWithoutFillingData()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]")).click();
    }
}
