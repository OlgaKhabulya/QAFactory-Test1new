package com.company;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by md212 on 03.09.15.
 */
public class Lesson12 { //Select
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "/Users/md212/Desktop/chromedriver");

        WebDriver wdr = new ChromeDriver();

        wdr.get("https://strahovator.com.ua/kupit_strahovku/avtocivilka_avtograzhdanka_osago_oscpv");

        WebElement s = wdr.findElement(By.xpath("//*[@id='ts_type']"));
        Select sel = new Select(s);
        System.out.println(
                sel.getFirstSelectedOption().getText());

        sel.selectByVisibleText("мотоцикл или мотороллер");

        new Select(wdr.findElement(By.xpath("//div/select[@name='ts_details_type']"))).
                selectByVisibleText("объем двигателя более 300 см³");

        sleep(5);
        wdr.quit();

    }

    private static void sleep(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {   // waiting 5 seconds before closing. But it's better not to use this class. In tests it's unacceptable.
            e.printStackTrace();
        }
    }
}
