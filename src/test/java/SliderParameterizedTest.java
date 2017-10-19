import Pages.SliderPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.support.PageFactory;


public class SliderParameterizedTest extends BaseTest {
//
//WebDriver driver;
//        private int moveQuantity;
//   private int expectedResult;
//
//    public SliderParameterizedTest(int quantity, int expectedResult) {
//        this.moveQuantity = quantity;
//       this.expectedResult = expectedResult;
//    }


//    public static Collection testData() {                             //Object[][] data = new Object[][] { {"1"}, {"JU"}, {"JUnit Parallel"}};
//        return Arrays.asList(new Object[][]{{6, 8}, {3, 5}, {5, 7}});       //return Arrays.asList(data);
    //  }


    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6})
    public void testMoveSlider(int moveQuantity) throws InterruptedException {
        driver.get("http://demoqa.com/slider/");
        System.out.println(driver.getPageSource());
        SliderPage sliderPageParameterized = PageFactory.initElements(driver, SliderPage.class);
        sliderPageParameterized.moveSlider(moveQuantity);
        sliderPageParameterized.getSliderValue();

        // Assertions.assertEquals(sliderPageParameterized.getSliderValue(), Integer.toString(moveQuantity));

    }

}
