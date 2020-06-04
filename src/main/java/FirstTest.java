import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.windows.WindowsDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class FirstTest {
    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("platformVersion", "5.0.1");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "org.wikipedia");
        capabilities.setCapability("appActivity", ".main.MainActivity");
        capabilities.setCapability("app", "C:\\Users\\QS_Specialist\\IdeaProjects\\JavaAppium\\apks\\org.wikipedia.apk");
        //driver = new AndroidDriver(new URL("http:\\127.0.0.1:4723\\wd\\hub"), capabilities);
        driver = new AndroidDriver(new URL("http:\\127.0.0.1:4723\\wd\\hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    /*    @After
        public void tearDown(){
            driver.quit();
        }*/

    @Test
    public void firstTest() {

        WebElement element = driver.findElement(By.id("org.wikipedia:id/fragment_onboarding_skip_button"));
        element.click();
/*        WebElement element1 = driver.findElement(By.id("org.wikipedia:id/view_announcement_action_negative"));
        element1.click();*/
        WebElement element2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.view.View/android.view.View/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout/android.widget.TextView"));
        element2.click();
        WebElement element3 = driver.findElementById("org.wikipedia:id/search_src_text"); //waitElementPresentByXpath("org.wikipedia:id/search_src_text","padla",5); //driver.findElementById("org.wikipedia:id/search_src_text");
        element3.sendKeys("Facebook");
    }

    @Test
    public void secondTest() {
        WebElement element = driver.findElement(By.id("org.wikipedia:id/fragment_onboarding_skip_button"));
        element.click();
        WebElement element2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.view.View/android.view.View/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout/android.widget.TextView"));
        element2.click();
        WebElement element3 = driver.findElementById("org.wikipedia:id/search_src_text"); //waitElementPresentByXpath("org.wikipedia:id/search_src_text","padla",5); //driver.findElementById("org.wikipedia:id/search_src_text");
        element3.sendKeys("Facebook");
        WebElement element4 = driver.findElementByXPath("//*[@index = 3]//*[@text = 'Facebook Instant Articles']");
        System.out.println(element4.getText());
    }

    By searchString = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.view.View/android.view.View/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout/android.widget.TextView");

    @Test
    public void thirdTest() {
        WebElement element = driver.findElement(By.id("org.wikipedia:id/fragment_onboarding_skip_button"));
        element.click();
        WebElement element2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.view.View/android.view.View/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout/android.widget.TextView"));
        element2.click();
        WebElement element3 = waitElementPresentAndSendKeys(By.id("org.wikipedia:id/search_src_text"), "java", "padla", 10);
        waitElementPresent(By.id("org.wikipedia:id/search_close_btn"), "not found", 10);
        WebElement element1 = waitElementPresentAndClear(By.id("org.wikipedia:id/search_src_text"), "qwe", 10);
        //waitElementPresent(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.View/android.widget.ImageButton"), "padla", 10).click();
        Assert.assertTrue(waitElementNotPresent(By.id("org.wikipedia:id/search_close_btn"), "not found", 10));
    }

    @Test
    public void myTest() {
        WebElement element = waitElementPresentAndClick(By.id("org.wikipedia:id/fragment_onboarding_skip_button"), "qwe", 10);
        WebElement element1 = waitElementPresentAndClick(searchString, "qwe", 10);
        WebElement element2 = waitElementPresentAndSendKeys(By.id("org.wikipedia:id/search_src_text"), "java", "padla", 10);
        WebElement element3 = waitElementPresentAndClick(By.xpath("//*[@class = 'android.widget.ListView']//android.view.View[@index = 0]"), "asd", 10);
        WebElement element4 = waitElementPresent(By.xpath("//android.view.View[@content-desc = \"объектно-ориентированный язык программирования Объектно-ориентированный язык программирования\"]"), "qwe10", 10);
        System.out.println(element4.getAttribute("content-desc"));
    }

    @Test
    public void swipeTest() throws InterruptedException {
        WebElement element = waitElementPresentAndClick(By.id("org.wikipedia:id/fragment_onboarding_skip_button"), "qwe", 10);

        //  WebElement element1 = waitElementPresentAndClick(By.xpath("//android.widget.Button[@resource-id = 'org.wikipedia:id/view_announcement_action_negative']"),"asd",5);
        WebElement element1 = waitElementPresent(searchString, "padle", 10);
        swipeUp(1000);
        swipeUp(1000);
        swipeUp(1000);
    }

    @Test
    public void forthTest() throws InterruptedException {
        WebElement element = waitElementPresentAndClick(By.id("org.wikipedia:id/fragment_onboarding_skip_button"), "qwe", 10);
        WebElement element1 = waitElementPresentAndClick(searchString, "qwe", 10);
        WebElement element2 = waitElementPresentAndSendKeys(By.id("org.wikipedia:id/search_src_text"), "appium", "padla", 10);
        waitElementPresentAndClick(By.xpath("(//android.widget.TextView[@resource-id = 'org.wikipedia:id/page_list_item_title'])[1]"), "padl1", 10);
        swipeUpToFindElement(By.xpath("//android.view.View[@content-desc=\"Просмотреть статью в браузере\"]"),"suka",1);
    }
    @Test
    public void fifthTest(){
        waitElementPresentAndClick(By.id("org.wikipedia:id/fragment_onboarding_skip_button"), "qwe", 10);
        waitElementPresentAndClick(searchString, "qwe", 10);
        waitElementPresentAndSendKeys(By.id("org.wikipedia:id/search_src_text"), "appium", "padla", 10);
        waitElementPresentAndClick(By.xpath("(//android.widget.TextView[@resource-id = 'org.wikipedia:id/page_list_item_title'])[1]"), "padl1", 10);
        waitElementPresentAndClick(By.xpath("org.wikipedia:id/page_toolbar_button_show_overflow_menu"),"asd",10);

    }

/*driver.findElementByXPath("xpath");
    TouchAction touchAction4 = new TouchAction(driver);
touchAction4.press(100,0).moveTo(100,0).release();
driver.performTouchAction(touchAction4);*/


    public void swipeUpToFindElement(By by, String message,int maxSwipes) throws InterruptedException {
        int alreadySwipes = 0;
        while (driver.findElements(by).size() == 0){
            if (alreadySwipes>maxSwipes){
                waitElementPresent(by,"padla",0);
               // fail();
                return;
            }
            swipeUp(300);
            ++alreadySwipes;
        }
    }

    public void swipeUp(int timeOfSwipe) throws InterruptedException {
        TouchAction action = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        int x = size.width / 2;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);
        action.press(PointOption.point(x, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(timeOfSwipe))).moveTo(PointOption.point(x, endY)).release().perform();
    }

    public WebElement waitElementPresent(By by, String message, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.withMessage(message);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    private WebElement waitElementPresentAndClick(By by, String message, long time) {
        WebElement element = waitElementPresent(by, message, time);
        element.click();
        return element;
    }

    private WebElement waitElementPresentAndSendKeys(By by, String value, String message, long time) {
        WebElement element = waitElementPresent(by, message, time);
        element.sendKeys(value);
        return element;
    }

    private boolean waitElementNotPresent(By by, String message, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.withMessage(message);
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    private WebElement waitElementPresentAndClear(By by, String message, long time) {
        WebElement element = waitElementPresent(by, message, time);
        element.clear();
        return element;
    }

}
