package Grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class DriverManager {

    public WebDriver driver;
    String nodeURL = "http://192.168.8.101:5556/wd/hub";


    public WebDriver getDriver(String browser) throws MalformedURLException {
        DesiredCapabilities capabilities = null;
        if (browser == "chrome") {
            capabilities = DesiredCapabilities.chrome();
        } else if (browser == "firefox") {
            capabilities = DesiredCapabilities.firefox();
        }
        capabilities.setPlatform(Platform.WINDOWS);

        return driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
    }
}


