package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static browserfactory.BaseTest.driver;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }



    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
     //Find Computer Link And Click on it
     driver.findElement(By.xpath("//u1@class='top-menu notmobile']//a[text() = 'Computers ']")).click();

     //verify computer text
        String expected = "Computers";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //Find and click on Electronic tab
        driver.findElement(By.xpath("//u1@class='top-menu notmobile']//a[text() ='Electronics']")).click();
        //verify electronics text
        String expected = "Electronics";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //find apparel link and click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Apparel ']")).click();

        //verify Apparel text
        String expected = "Apparel";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //find Digital downloads link and click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Digital downloads ']")).click();

        //verify Digital downloads text
        String expected = "Digital downloads";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //find Books link and click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Books ']")).click();

        //verify Books text
        String expected = "Books";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //find Jewelry link and click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Jewelry ']")).click();

        //verify Jewelry text
        String expected = "Jewelry";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //find Gift Cards link and click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Gift Cards ']")).click();

        //verify Gift Cards text
        String expected = "Gift Cards";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected,actual);
    }
    }


