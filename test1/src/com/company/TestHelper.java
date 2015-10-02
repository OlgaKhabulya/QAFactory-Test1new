package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by md212 on 09.09.15.
 */
public class TestHelper {

    public static WebDriver wdr;

    public static void setup(String url) { // creating WebDriver and opening url
        System.setProperty("webdriver.chrome.driver", "/Users/md212/Desktop/chromedriver");
        wdr = new ChromeDriver();
        wdr.get(url);
    }

    public static void quit() {
        wdr.quit();
    }

    public static void sleep(float sec) {
        try {
            Thread.sleep((long) (sec * 1000));
        } catch (InterruptedException e) {   // waiting 5 seconds before closing. But it's better not to use this class. In tests it's unacceptable.
            e.printStackTrace();
        }
    }


    public static WebElement waitForElement(String targetXPath) {
        for (int i = 0; i < 600; i++) {
            List<WebElement> elements = wdr.findElements(By.xpath(targetXPath));
            System.out.println("waitForElement: " + targetXPath + " => " + elements.size());
            if (elements.size() > 0) {
                return elements.get(0);
            }
            sleep(0.1f);
        }
        throw new RuntimeException("No elements for xpath: " + targetXPath);
    }

    public static void waitWhenElementDisappear(String targetXPath) {
        new WebDriverWait (wdr, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(targetXPath)));
    }
}



