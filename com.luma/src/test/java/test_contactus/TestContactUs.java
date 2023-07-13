package test_contactus;


import base.BasePage;
import contactuspage.ContactUsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContactUs extends BasePage {



    @Test(priority = 12 , groups = {"BAT"})
    public void testContactUs(){
        ContactUsPage contactUsPage= new ContactUsPage();
        String name= "tita";
        String email="tititiha@gmail.com";
        String phoneNumber= "Azerty2025/*-";
        String comment= "Hello hello ";
        contactUsPage.doContactUs(name,email,phoneNumber,comment);

        Assert.assertTrue(isElementVisible(contactUsPage.thankYouForContactingUsMessage));
    }
}