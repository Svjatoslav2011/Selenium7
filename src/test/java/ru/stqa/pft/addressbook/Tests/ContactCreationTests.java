package ru.stqa.pft.addressbook.Tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {



    @Test
    public void testContactCreation() throws Exception {
        app.initContactCreation();
        app.fillContactForm(new ContactData("Svjat", "CHI", "+380682863842", "svjat@chisoftware.com"));
        app.submitContactCreation();
        app.goToHomePage();
    }


}
