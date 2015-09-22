package com.company;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by md212 on 09.09.15.
 */
public class AngelPage {
    public static String url=//"http://oxogamestudio.com/passwd.current8.htm";
    //"http://oxogamestudio.com/passwd.current9.htm" - different XPath like with site versions 6 and 8 and pop-up windows
    //"http://oxogamestudio.com/passwd.current8.htm" - different XPath like with site version 6 and needs pause after filling Master Password
    //"http://oxogamestudio.com/passwd.current7.htm" - test 5-14 requires pause to wait generated password
    // READY //"http://oxogamestudio.com/passwd.current6.htm" - XPath differs from XPath for other sites. CREATE GENERAL XPath FOR ALL SITES
    // READY / should fail tests 15-17 //"http://oxogamestudio.com/passwd.current5.htm" - mistakes in fields names. CREATE TEST CASE
    //"http://oxogamestudio.com/passwd.current4.htm"
    //"http://oxogamestudio.com/passwd.current3.htm";
    // READY - should fail test 2 and 3 // "http://oxogamestudio.com/passwd.current2.htm";// - previous two field after generating password become empty.
    // CREATE TEST CASE WHICH WILL CHECK IT

           "http://angel.net/~nic/passwd.current.html"; //- BASIC SITE

    public static By passwordInput = By.xpath("//input[@type='password']");

    public static void setMasterPassword(String value) {
        TestHelper.wdr.findElement(passwordInput).sendKeys(value);
    }

    public static void assertMasterPasswordIs(String expectedValue){
        String value = TestHelper.wdr.findElement(passwordInput).getAttribute("value");
        Assert.assertEquals(expectedValue, value);
    }

    public static void assertSiteNameIs (String expectedValue) {
        String value = TestHelper.wdr.findElement(By.xpath("(//input)[2]")).getAttribute("value");
        Assert.assertEquals(expectedValue,value);
    }


    public static void setSiteName(String value) {
        TestHelper.wdr.findElement(By.xpath("(//input)[2]")).sendKeys(value);
    }

    public static void ClickingENTER() {
        TestHelper.wdr.findElement(By.xpath("(//input)[2]")).sendKeys(Keys.ENTER);
    }

    public  static void clickingButtonGenerate() {
        TestHelper.wdr.findElement(By.xpath("//input[@value='Generate']")).click();
    }

    public static String getGeneratedPassword() {
        return TestHelper.wdr.findElement(By.xpath("(//input)[4]")).getAttribute("value");
    }

    public static void AssertGeneratedPassword(String value) {
        Assert.assertEquals(value, TestHelper.wdr.findElement(By.xpath("(//input)[4]")).getAttribute("value"));
    }

    public static void AssertIfPasswordCorrect(int f, String value) {
        Assert.assertEquals(f,TestHelper.wdr.findElement(By.xpath("(//input)[4]")).getAttribute(value).length());
    }

    public static void AssertNameOfFieldMasterPas(String names) {
        Assert.assertEquals(names, TestHelper.wdr.findElement(By.xpath("//td[text()='Your master password']")).getText());
    }

    public static void AssertNameOfFieldSiteName(String names) {
        Assert.assertEquals(names, TestHelper.wdr.findElement(By.xpath("//td[text()='Site name']")).getText());
    }

    public static void AssertNamesOfFieldGeneratedPassword (String names) {
        Assert.assertEquals(names, TestHelper.wdr.findElement(By.xpath("//td[text()='Generated password']")).getText());
    }

}
