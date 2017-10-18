package Pages.DatePicker;

import org.junit.jupiter.api.Assertions;

public class DatePickerAssertions extends DatePickerPage{
    public void verifyData(DatePickerData datePickerData) {
        Assertions.assertEquals(datePickerData.getMonth(), getCurrentMonth());
        Assertions.assertEquals(datePickerData.getYear(), getCurrentYear());
        Assertions.assertEquals(datePickerData.getDay(), getCurrentDay());
        System.out.printf("Date value: " + datePickerData.getMonth() + " " + datePickerData.getYear() + " " + datePickerData.getDay() + " is displayed! Scucess!" );

    }
}
