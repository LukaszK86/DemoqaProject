package Grid;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class ParallelTest2 extends DriverManager {

    //Chrome Test
    @Test
    public void testChrome2() throws MalformedURLException {
        driver = new DriverManager().getDriver("chrome");
        driver.navigate().to("http://www.yahoo.com/");
        driver.manage().window().maximize();
    }

    }

