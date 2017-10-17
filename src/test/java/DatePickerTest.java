import Pages.DatePickerPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class DatePickerTest extends BaseTest {

    @Test
    public void selectData() {
        driver.get("http://demoqa.com/datepicker/");
        DatePickerPage datePickerPage = PageFactory.initElements(driver, DatePickerPage.class);
        datePickerPage.clickFieldData();
        datePickerPage.typeDate("November", 8, 2015);
        datePickerPage.verifyData();
    }
}
