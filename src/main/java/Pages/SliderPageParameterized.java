package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SliderPageParameterized {

    @FindBy(how = How.XPATH, using = "//*[@id=\"slider-range-max\"]/span")
    WebElement slider;

    public void moveSlider(int quantity) {
        for (int i = 1; i <= quantity; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
