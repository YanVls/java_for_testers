package manager;

import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper extends HelperBase {

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void createContact(ContactData contact) {
        openContactPage();
        fillContactInfo(contact);
        submitContactCreation();
        openHomePage();
    }

    public void removeContact() {
        openHomePage();
        selectContact();
        removeSelectedContact();
        openHomePage();
    }

    private void fillContactInfo(ContactData contact) {
        type(By.name("firstname"), contact.firstName());
        type(By.name("middlename"), contact.middleName());
        type(By.name("lastname"), contact.lastName());
        type(By.name("nickname"), contact.nickname());
        type(By.name("title"), contact.title());
        type(By.name("company"), contact.company());
        type(By.name("address"), contact.address());
        type(By.name("home"), contact.homeTelephoneNumber());
        type(By.name("mobile"), contact.mobileNumber());
        type(By.name("work"), contact.workTelephoneNumber());
        type(By.name("fax"), contact.fax());
        type(By.name("email"), contact.email());
        select(By.name("bday"), contact.birthdayDay());
        select(By.name("bmonth"), contact.birthDayMonth());
        type(By.name("byear"), contact.birthDayYear());
    }

    public boolean isContactPresent() {
        openHomePage();
        return manager.isElementPresent(By.name("selected[]"));
    }

    private void openHomePage() {
        click(By.linkText("home"));
    }

    private void submitContactCreation() {
        click(By.name("submit"));
    }

    private void openContactPage() {
        if (!manager.isElementPresent(By.name("enter"))) {
            click(By.linkText("add new"));
        }
    }

    private void selectContact() {
        click(By.name("selected[]"));
    }

    private void removeSelectedContact() {
        click(By.xpath("//input[@value='Delete']"));
    }
}
