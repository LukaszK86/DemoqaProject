//package Pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//
//import java.util.List;
//
//
//public class DataPickerPage {
//
//    WebDriver driver;
//
//    @FindBy(how = How.ID, using = "datepicker1")
//    WebElement fieldData;
//
//    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")
//    WebElement nextButton;
//
//    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")
//    WebElement previousButton;
//
//    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-month")
//    WebElement currentMonth;
//
//    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-year")
//    WebElement currentYear;
//
////    @FindBy(how = How.)
//
//
//    public void clickFieldData() {
//        fieldData.click();
//    }
//
//    public void clickNextMonth() {
//        nextButton.click();
//    }
//
//    public void clickPreviousMonth() {
//        previousButton.click();
//    }
//
//    public void displayCurrentMonth() {
//        System.out.println("Current month is: " + currentMonth.getText());
//    }
//
//    public void displayCurrentYear() {
//        System.out.println("Current year is: " + currentYear.getText());
//    }
//
//    public void compareExpectedYearEqualsCurrentYear(String expectedYear) {
//        if (expectedYear.equals(currentYear.getText())) {
//            System.out.println("Year already selected");
//        }
//    }
//
//    public void compareExpectedYearLessCurrentYear(String expectedYear) {
//        if (Integer.parseInt(expectedYear) < Integer.parseInt(currentYear.getText())) ;
//        do {
//            previousButton.click();
//        } while (Integer.parseInt(expectedYear) < (Integer.parseInt(currentYear.getText())));
//    }
//
//    public void compareExpectedYearMoreCurrentYear(String expectedYear) {
//        if (Integer.parseInt(expectedYear) > Integer.parseInt(currentYear.getText())) ;
//        do {
//            nextButton.click();
//        } while (Integer.parseInt(expectedYear) > (Integer.parseInt(currentYear.getText())));
//    }
//
//
//    public void compareExpectedwithCurrentMonth(String expectedMonth) {
//
//        displayCurrentMonth();
//
//        do {
//            for (int i = 1; i < 12; i++) {
//                nextButton.click();
//            }
//        }
//        while (expectedMonth.equals(currentMonth.getText()));
//    }
//
//    public void pickTheDay() {
//        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
//
//        for (WebElement ele : allDates) {
//
//            String date = ele.getText();
//
//            if (date.equalsIgnoreCase("28")) {
//                ele.click();
//                break;
//            }
//        }
//    }
//}
//


