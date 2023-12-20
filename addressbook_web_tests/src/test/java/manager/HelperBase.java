package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HelperBase {
    protected final ApplicationManager manager;

    public HelperBase(ApplicationManager manager) {
        this.manager = manager;
    }

    protected void type(By locator, String text) {
        click(locator);
        manager.driver.findElement(locator).clear();
        manager.driver.findElement(locator).sendKeys(text);
    }

    protected void select(By locator, String text) {
        WebElement dropdown = manager.driver.findElement(locator);
        dropdown.click();
        dropdown.findElement(By.xpath("//option[. = '" + text + "']")).click();
    }

    protected void click(By locator) {
        manager.driver.findElement(locator).click();
    }
}
