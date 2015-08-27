package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.List;

/**
 * Created by md212 on 23.08.15.
 */
public class Lesson10 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/md212/Desktop/chromedriver");

        WebDriver wdr = new ChromeDriver();

//        1. Открьій сайт https://stage.tether.to

        wdr.get("https://stage.tether.to");

//        2. Заполнить в логин пустую строку, и в пароль пустую строку
        WebElement a = wdr.findElement(By.xpath("//input[@name='username']"));
        a.sendKeys("");

        WebElement b = wdr.findElement(By.xpath("//input[@name='password']"));
        b.sendKeys("");

//        3. Напечатать в консоль сообщение об ошибке от логина
        findElement("//div[@ng-message][@class='ng-scope']", wdr);
        WebElement c = wdr.findElement(By.xpath("(//div[@ng-message])[1]"));
        System.out.println("login " + c.getText());


//        4. Нажать TAB в поле пароля
        b.sendKeys(Keys.TAB);

//        5. Напечатать в консоль сообщение об ошибке от пароля
        WebElement d = wdr.findElement(By.xpath("(//div[@ng-message])[2]"));
        System.out.println("password " + d.getText());

//        6. Заполнить пароль строкой "asd"
        b.sendKeys("asd");

//        7. Напечатать в консоль сообщение об ошибке от пароля (должно бьіть другое)
        sleep(1);
        WebElement e = wdr.findElement(By.xpath("(//div[@ng-message])[2]"));
        System.out.println("password 2 " + e.getText());

//        8. Дописать в пароль еще "fff"
        b.sendKeys("fff");

//        9. Напечатать в консоль количество вебєлементов найденньіх по XPath которьій использовали в шагах 5 и 7. (findElements .... .size())
        List<WebElement> f = wdr.findElements(By.xpath("(//div[@ng-message])[2]"));
        System.out.println(f.size());

//        10. Заполнить в логин "a"
        a.sendKeys("a");

//        11. Напечатать в консоль сообщение об ошибке от логина
        sleep(1);
        WebElement g = wdr.findElement(By.xpath("(//div[@ng-message])[1]"));
        System.out.println(g.getText());

//        12. Дописать в логин "qwe"
        a.sendKeys("qwe");

//        13. Напечатать в консоль количество вебєлементов найденньіх по XPath которьій использовали в шагах 3 и 11. (findElements .... .size())
        List<WebElement> h = wdr.findElements(By.xpath("//div[@ng-message]"));
        System.out.println(h.size());

//        14. Нажать Log In
        WebElement t = wdr.findElement(By.xpath("//button[@class]"));
        t.click();


        wdr.quit();
    }

    private static void sleep(long msec) {
        try {
            Thread.sleep(msec * 2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebElement findElement(String targetXPath, WebDriver wdr) {
        for (int i = 0; i < 600; i++) {
            if (wdr.findElements(By.xpath(targetXPath)).size() > 0) {
                break;
            }
            sleep(100);
        }
        return wdr.findElement(By.xpath(targetXPath));
    }
}
