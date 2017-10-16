
import Pages.SliderPage;
import Pages.SliderPageParameterized;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SliderParameterizedTest   {

   WebDriver driver;
    private int moveQuantity;
    private int expectedResult;

    public SliderParameterizedTest (int quantity,int expectedResult) {
        this.moveQuantity= quantity;
        this.expectedResult=expectedResult;
    }

    @Parameterized.Parameters
    public static Collection testData (){                             //Object[][] data = new Object[][] { {"1"}, {"JU"}, {"JUnit Parallel"}};
        return Arrays.asList(new Object[][] {{6,7}, {3,4}, {5,6}});       //return Arrays.asList(data);
    }
    @Before
    public void initialize() {
driver = new ChromeDriver();
    }

    @Test
    public void testMoveSlider (){
        driver.get("http://demoqa.com/slider/");
        SliderPageParameterized sliderPageParameterized = PageFactory.initElements(driver, SliderPageParameterized.class);
        sliderPageParameterized.moveSlider(4);
    }

}
