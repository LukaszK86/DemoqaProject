import Pages.SliderPage;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.support.PageFactory;


public class SliderTest extends BaseTest {

    @Test
    public void moveSliderTest() {
        driver.get("http://demoqa.com/slider/");
        SliderPage sliderPage = PageFactory.initElements(driver, SliderPage.class);
sliderPage.moveSlider(1);
    }
}
