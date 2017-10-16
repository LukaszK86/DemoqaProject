package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DatePickerPage {

    @FindBy(how = How.ID, using = "datepicker1")
    WebElement fieldData;

    public void clickFieldData() {
        fieldData.click();
    }

    String date;

    public void typeDate(String date) {
        this.date = date;
        fieldData.sendKeys(date);
    }


}




