import Pages.DroppablePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class DroppableTest extends BaseTest {


    @Test
    public void dragAndDrop() throws Exception {
        driver.get("http://demoqa.com/droppable/");
        DroppablePage droppablePage = PageFactory.initElements(driver, DroppablePage.class);
        droppablePage.setBuilder(driver);
        Assert.assertEquals("Dropped!", droppablePage.getWordDropped());


    }

}
