package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.System.out;

/**
 * Created by md212 on 11.08.15.
 */


public class Lesson9 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/md212/Desktop/chromedriver");

        WebDriver wdr = new ChromeDriver(); // can be used any other browser: firefox, IE, Opera etc.

        // 1. Открьіть сайт https://stage.tether.to

        wdr.get("https://stage.tether.to"); // starting

        // 2. Напечатать в консоль заголовок сайта.

        System.out.println(wdr.getTitle());

        sleep(2);

        // 3. Нажать на ссьілку Request access.

        WebElement a = wdr.findElement(By.xpath("//div//a[text() = 'Request access']"));
        a.click();

        sleep(2);

        // 4. Напечатать в консоль заголовок единственного поля для ввода на открьівшейся странице.

        WebElement b = wdr.findElement(By.xpath("//label[@for]"));
        System.out.println(b.getText());

        sleep(2);

        // 5. Нажать на ссьілку Already have an invite code?

        WebElement c = wdr.findElement(By.xpath("//a[@href][text()='Already have an invite code?']"));
        c.click();

        sleep(2);

        // 6. Напечатать в консоль заголовки всех полей кроме вьібора страньі.

        List<WebElement> d1 = wdr.findElements(By.xpath("//label[@for]"));
        for (int dd = 0; dd<d1.size(); dd++) {
            System.out.println (d1.get(dd).getText());
        }

        // 7. Заполнить первьіе 3 поля.

        WebElement e = wdr.findElement(By.xpath("//input[@name='inviteCode']"));
        e.sendKeys("12345678");

        WebElement f = wdr.findElement(By.xpath("//input[@name='firstname']"));
        f.sendKeys("VasyliY");

        WebElement g = wdr.findElement(By.xpath("//input[@name='lastname']"));
        g.sendKeys("PupkiN");
        sleep(4);

        // 8. Напечатать в консоль ошибку которая появилась возле первого поля.

        WebElement h = wdr.findElement(By.xpath("//div[@ng-message]"));
        System.out.println(h.getText());

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
