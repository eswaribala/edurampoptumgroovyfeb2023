package com.optum.insurance.tests

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

import java.time.Duration

class CanadaPhoneTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.canada411.ca/");

    }
    @Test public void canadaSearchTitleTest() {
        Assert.assertEquals(driver.getTitle(), "Free People Search, Reverse Phone Lookup, " +
                "Business Telephone Directory | Canada411.ca");
    }
////*[@id="c411PeopleReverseWhat"]
////*[@id="c411PeopleReverseFind"]
    @Test(description = "This test validates error message when credentials are incorrect", priority = 0 , dataProvider = "dp")
    public void verifyIncorrectCredentials(String phoneNo) {

        driver.findElement(By.id("c411PeopleReverseWhat")).sendKeys(phoneNo);
        driver.findElement(By.id("c411PeopleReverseFind")).submit()

        String message = driver.findElement(By.xpath("//*[@id=\"ypgBody\"]/div[3]/div/div[1]/div[2]/div[1]/div[1]/h1/span")).getText();

        // Verify Error Message
        Assert.assertEquals(message,"Golf Town");

    }

    @DataProvider(name = "dp",parallel=true)
    public Object[][] dp1() {
        return new Object[][] {
                new Object[] { "905-841-0191" },
                new Object[] {"647-846-8449" },
                new Object[] { "416-244-2644" },
                new Object[] { "647-846-7271" },
                new Object[] { "416-848-0701" },
                new Object[] { "647-846-8452" }

        };
    }

/*
    @Test(description = "This test will fail", priority = 1)
    public void verifyBlankCredentials() {

        driver.findElement(By.name("username")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();

        String actualErrorMessage = driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();

        // Verify Error Message
        Assert.assertEquals(actualErrorMessage,"Invalid credentials");

    }

    @Test(description = "This test validates  successful login to Home page", priority = 2)
    public void verifyLoginPage() {

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();

        String homePageHeading = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")).getText();

        //Verify new page - HomePage
        Assert.assertEquals(homePageHeading,"Employee Information");

    }
 */
    @AfterMethod
    public void teardown() {

        driver.quit();
    }


}
