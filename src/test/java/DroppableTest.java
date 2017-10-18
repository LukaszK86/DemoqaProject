import Pages.DroppablePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class DroppableTest extends BaseTest{


@Test
public void dragAndDrop (){
driver.get("http://demoqa.com/droppable/");
DroppablePage droppablePage = PageFactory.initElements(driver,DroppablePage.class);
    droppablePage.setBuilder(driver);
    droppablePage.getWordDropped();





}

}
