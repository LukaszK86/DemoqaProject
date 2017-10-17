package Parameterized;

import Pages.Parameterized.SliderPageParameterized;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SliderParameterizedTest   {

   WebDriver driver;
    private int moveQuantity;
    private int expectedResult;

    public SliderParameterizedTest (int quantity, int expectedResult) {
        this.moveQuantity= quantity;
        this.expectedResult=expectedResult;
    }

    @Parameterized.Parameters
    public static Collection testData (){                             //Object[][] data = new Object[][] { {"1"}, {"JU"}, {"JUnit Parallel"}};
        return Arrays.asList(new Object[][] {{6,8}, {3,5}, {5,7}});       //return Arrays.asList(data);
    }
    @Before
    public void initialize() {
driver = new ChromeDriver();
    }

    @Test
    public void testMoveSlider (){
        driver.get("http://demoqa.com/slider/");
        SliderPageParameterized sliderPageParameterized = PageFactory.initElements(driver, SliderPageParameterized.class);
        sliderPageParameterized.moveSlider(moveQuantity);
        System.out.println(expectedResult);
        Assertions.assertEquals(sliderPageParameterized.getSliderValue(),Integer.toString(expectedResult));
    }

}
