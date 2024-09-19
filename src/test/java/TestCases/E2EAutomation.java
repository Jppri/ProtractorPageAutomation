package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class E2EAutomation {
    WebDriver driver = new ChromeDriver();

    @Test(priority = 1)
    public void openWebLink() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
    }
    @Test(priority = 2)
    public void enterUsername(){
            driver.findElement(By.xpath("(//input[@name='name'])[1]"))
                    .sendKeys("Jeffrey Equipaje");
    }

    @Test(priority = 3)
    public void enterEmail(){
        driver.findElement(By.cssSelector("input[name='email']"))
                .sendKeys("jeffheff@gmail.com");
    }

    @Test(priority = 4)
    public void enterPassword(){
        driver.findElement(By.id("exampleInputPassword1"))
                .sendKeys("123345");
    }

    @Test(priority = 5)
    public void checkBox() {
        driver.findElement(By.id("exampleCheck1"))
                .click();
    }

    @Test(priority = 6)
    public void enterGender() {
        WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText("Male");
    }

    @Test(priority = 7)
    public void selectEmploymentStatus() {
        driver.findElement(By.id("inlineRadio1")).click();
    }
    @Test(priority = 8)
    public void enterBirthDate() {
        driver.findElement(By.cssSelector("input[name='bday']"))
                .sendKeys("02/05/2002");
    }

    @Test(priority = 9)
    public void clickSubmitButton() {
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }

    @Test(priority = 10)
    public void verifyName() {
        WebElement nameBoxed = driver.findElement(By.xpath("(//input[@name='name'])[2]"));
        System.out.println("Name is: " + nameBoxed.getText());
    }

    @Test(priority = 11)
    public void verifySuccessText() {
        String successMessage = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
        //System.out.println("Message is: " + successMessage);
        String expectedMessage = "×\nSuccess! The Form has been submitted successfully!.";
        Assert.assertEquals(successMessage, expectedMessage, "The success message does not match the expected text!");
    }

    @Test(priority = 12)
    public void tearDown(){
        driver.quit();
    }

}
