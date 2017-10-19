package Grid;

import Pages.DatePicker.DatePickerAssertions;
import Pages.DatePicker.DatePickerData;
import Pages.DatePicker.DatePickerPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class DatePickerTestGrid extends DriverManager {

    @Test
    public void selectData() throws MalformedURLException {
        driver = new DriverManager().getDriver("chrome");
        driver.get("http://demoqa.com/datepicker/");
        DatePickerPage datePickerPage = PageFactory.initElements(driver, DatePickerPage.class);
        datePickerPage.clickFieldData();
        DatePickerData datePickerData = new DatePickerData("November", 7, 2018);
        datePickerPage.typeDate(datePickerData);
        DatePickerAssertions datePickerAssertions = PageFactory.initElements(driver, DatePickerAssertions.class);
        datePickerAssertions.verifyData(datePickerData);


    }
}
