package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DatePickerPage extends DatePickerData {

    @FindBy(how = How.ID, using = "datepicker1")
    WebElement fieldData;

    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-month")
    WebElement currentMonth;

    @FindBy(how = How.CSS, using = "a.ui-state-default.ui-state-active.ui-state-hover")
    WebElement currentDay;

    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-year")
    WebElement currentYear;

    public void clickFieldData() {
        fieldData.click();
    }


    public void typeDate(DatePickerData dataToSet) {

      //  fieldData.sendKeys(dataToSet.getFormatedData(););
    }





    // public void typeDate(String month, int day, int year){
    //       fieldData.sendKeys(month + " " + day + ", " + year );
//    }

    public String getCurrentMonth() {
        return currentMonth.getText();
    }

    public int getCurrentDay() {
        return Integer.parseInt(currentDay.getText());
    }

    public int getCurrentYear() {
        return Integer.parseInt(currentYear.getText());
    }

    public void verifyData() {
//        Assertions.assertEquals(getMonth(), getCurrentMonth());
//        Assertions.assertEquals(getYear(), getCurrentYear());
//        Assertions.assertEquals(getDay(), getCurrentDay());
//        System.out.println(getMonth());
//        System.out.println(getYear());
//        System.out.println(getDay());
    }

}




