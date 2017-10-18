import Pages.SliderPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collection;


public class SliderParameterizedTest extends BaseTest {

    WebDriver driver;
//    private int moveQuantity;
//    private int expectedResult;
//
//    public SliderParameterizedTest(int quantity, int expectedResult) {
//        this.moveQuantity = quantity;
//        this.expectedResult = expectedResult;
//    }
//
//
//    public static Collection testData() {                             //Object[][] data = new Object[][] { {"1"}, {"JU"}, {"JUnit Parallel"}};
//        return Arrays.asList(new Object[][]{{6, 8}, {3, 5}, {5, 7}});       //return Arrays.asList(data);
//    }
//
//
////    @Before
////    public void initialize() {
////      WebDriver driver = new ChromeDriver();
////    }


//    @ParameterizedTest
//    @ValueSource(ints ={4,5,6})
//    public void testMoveSlider() {
//        driver.get("http://demoqa.com/slider/");
//        SliderPage sliderPageParameterized = PageFactory.initElements(driver, SliderPage.class);
//        sliderPageParameterized.moveSlider(moveQuantity);
//        System.out.println(expectedResult);
//        Assertions.assertEquals(sliderPageParameterized.getSliderValue(), Integer.toString(expectedResult));
//    }

}
