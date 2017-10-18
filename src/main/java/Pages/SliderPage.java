package Pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SliderPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"slider-range-max\"]/span")
    WebElement slider;

    @FindBy(how = How.ID, using = "amount1")
    WebElement valueOfSlider;

    public void moveSlider(int quantity) {
        switch (quantity) {
                case 1:
                    slider.sendKeys(Keys.ARROW_LEFT);
                    break;
                case 2:
                   break;
                default:
                    for (int i = 3; i <= quantity; i++) {
                        slider.sendKeys(Keys.ARROW_RIGHT);
            }
        }
    }

    public String getSliderValue() {
        return ((valueOfSlider.getText()));
    }


}
