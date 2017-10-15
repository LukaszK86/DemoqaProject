import Pages.DataPickerPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class DataPickerTest extends BaseTest {

    @Test
    public void selectData (){
        driver.get("http://demoqa.com/datepicker/");
        DataPickerPage dataPickerPage = PageFactory.initElements(driver,DataPickerPage.class);
        dataPickerPage.clickFieldData();
//        dataPickerPage.clickNextMonth();
//        dataPickerPage.clickPreviousMonth();
//        dataPickerPage.clickPreviousMonth();
        dataPickerPage.displayCurrentMonth();
        dataPickerPage.displayCurrentYear();
        dataPickerPage.compareExpectedYearMoreCurrentYear("2019");
        dataPickerPage.compareExpectedwithCurrentMonth("November");


    }
}
