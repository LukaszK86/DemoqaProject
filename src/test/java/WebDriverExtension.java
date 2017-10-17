import org.junit.jupiter.api.extension.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//@https://github.com/junit-team/junit5/issues/944
//public class WebDriverExtension implements ParameterResolver, AfterAllCallback {
//
//    @Override
//    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
//        return parameterContext.getParameter().getType().equals(WebDriver.class);
//    }
//
//    @Override
//    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
//        ExtensionContext.Store store = extensionContext.getParent().get().getStore();
//        return store.getOrComputeIfAbsent(WebDriver.class, webDriverClass -> new ChromeDriver());
//    }
//
//    @Override
//    public void afterAll(ExtensionContext extensionContext) throws Exception {
//        ExtensionContext.Store store = extensionContext.getParent().get().getStore();
//        store.get(WebDriver.class, WebDriver.class).quit();
//    }
//
//}
