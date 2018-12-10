package ru.stqa.pft.addressbook;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {



    @Test
    public void testContactCreation() throws Exception {
        initContactCreation();
        fillContactForm(new ContactData("Svjat", "CHI", "+380682863842", "svjat@chisoftware.com"));
        submitContactCreation();
        goToHomePage();
    }


}
