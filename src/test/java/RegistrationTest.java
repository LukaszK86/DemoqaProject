import Pages.Menus.SideMenu;
import Pages.RegistrationPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class RegistrationTest extends BaseTest {

    @Test
    public void registerAccountOnDemoqa() {

        driver.get("http://demoqa.com/");

        SideMenu sideBar = PageFactory.initElements(driver, SideMenu.class);
        sideBar.clickRegistration();
        RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        registrationPage.findAllMethodsFromRegistrationPage();
        registrationPage.clickSubmitnButton();
        registrationPage.typeUsername("Andrzej727");
        registrationPage.clickSubmitnButton();
        registrationPage.typeMail("andrzej727@.ahoj.pl");


    }
}
