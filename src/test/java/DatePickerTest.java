import Pages.DatePickerPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class DatePickerTest extends BaseTest {

    @Test
    public void selectData() {
        driver.get("http://demoqa.com/datepicker/");
        DatePickerPage datePickerPage = PageFactory.initElements(driver, DatePickerPage.class);
        datePickerPage.clickFieldData();
        datePickerPage.typeDate("November", 8, 2015 );
       Assertions.assertEquals(datePickerPage.getMonth(),datePickerPage.getCurrentMonth());
       Assertions.assertEquals(datePickerPage.getYear(),datePickerPage.getCurrentYear());
        System.out.println(datePickerPage.getMonth());
        System.out.println(datePickerPage.getYear());
//        Assertions.assertEquals(datePickerPage.getDay(),datePickerPage.getCurrentDay());

    }
}
