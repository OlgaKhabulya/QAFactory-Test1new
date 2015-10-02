package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.List;

/**
 * Created by md212 on 09.08.15.
 */
public class WEB_DRIVER {
    public static void main(String[] args) {


        // WEBDRIVER INSTALLATION

        System.setProperty("webdriver.chrome.driver", "/Users/md212/Desktop/chromedriver");

        ChromeDriver d123 = new ChromeDriver();

        d123.get("http://google.com"); // starting

        System.out.println(d123.getTitle()); // the same Assert.assertEquals("Google", d123.getTitle()) <- this is used everywhere where sout used to.
        WebElement j = d123.findElementByName("q"); // find input field
        j.sendKeys("котята"); // typing in input fild
        j.sendKeys(Keys.ENTER); // press Enter

        d123.findElementByName("btnG").click(); // clicking button "search"
        System.out.println(j.getAttribute("value")); // getting value (text in this case) from input field. will reflected in console

        sleep(3);

        WebElement d = d123.findElementByClassName("srg"); // searching list of results
        List<WebElement> res = d.findElements(By.tagName("a")); // searching all links in the list of found results
        WebElement res1 = res.get(0); // first link in the list;
            System.out.println( res1.getText()); // getting test from the link. will reflected in console

        sleep(3);

        System.out.println(d123.getTitle());
        d123.navigate().back();

        sleep(3);

        d123.quit();
    }

    private static void sleep(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {   // waiting 5 seconds before closing. But it's better not to use this class. In tests it's unacceptable.
            e.printStackTrace();
        }
    }

}
