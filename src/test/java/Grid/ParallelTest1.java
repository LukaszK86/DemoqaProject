package Grid;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class ParallelTest1 extends DriverManager {


    //Chrome Test
    @Test
    public void testChrome1() throws MalformedURLException {
        driver = new DriverManager().getDriver("chrome");
        driver.navigate().to("http://www.facebook.com/");
        driver.manage().window().maximize();
    }

    //Firefox Test
    @Test
    public void testFirefox1() throws MalformedURLException {
        driver = new DriverManager().getDriver("firefox");
        driver.navigate().to("http://www.amazon.com/");

    }
}