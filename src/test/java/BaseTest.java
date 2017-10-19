import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected static WebDriver driver;


    @BeforeAll


    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setPlatform(Platform.WINDOWS);
        driver = new RemoteWebDriver(new URL("http://192.168.8.101:5556/wd/hub"), capabilities);
    }


    @AfterAll
    public static void tearDown() {
        driver.quit();

    }
}
