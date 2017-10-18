package Pages;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DroppablePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"draggableview\"]")
    WebElement smallSquare;

    @FindBy(how = How.XPATH, using = "//*[@id=\"droppableview\"]")
    WebElement largeSquare;

    @FindBy(how = How.XPATH, using = "//*[@id='droppableview']/p")
    WebElement wordDropped;


    public void setBuilder(WebDriver driver) {

        Actions builder = new Actions(driver);
        builder.dragAndDrop(smallSquare, largeSquare).perform();
    }

    public void getWordDropped() {
        System.out.println(wordDropped.getText());
        wordDropped.equals("Dropped!");
    }

    public void getXYElements() throws Exception {
        Point square = largeSquare.getLocation();
        int xcordi = square.getX();
        System.out.println("Element's position from left side" + xcordi + " pixels.");
    }


}
