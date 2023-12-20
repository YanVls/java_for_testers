package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactRemovalTests extends TestBase {

    @Test
    public void canRemoveContact() {
        if (!app.contacts().isContactPresent()) {
            app.contacts().createContact(new ContactData(
                    "Yan",
                    "non",
                    "Vlasenko",
                    "YanVls",
                    "Test Title",
                    "Test Company",
                    "Test Address",
                    "111111",
                    "222222",
                    "333333",
                    "444444",
                    "test.test@test.com",
                    "13",
                    "August",
                    "1992"));
        }
        app.contacts().removeContact();
    }
}

