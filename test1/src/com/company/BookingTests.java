package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;

/**
 * Created by md212 on 22.09.15.
 */
public class BookingTests {
    @Before
    public void WDriver() {
        TestHelper.setup(BookingPage.url);
    }

    @Test
    public void test1() {
        BookingPage.ChoosingSiteLanguage();
        BookingPage.setFromWhere("Ки");
        BookingPage.clickStationFromAutosuggest("Київ");
        BookingPage.setToWhere("Івано");
        BookingPage.clickStationsToAutosuggest("Івано-Франківськ");
        BookingPage.setDateOfDeparture(new GregorianCalendar(2015, 10 - 1, 20));
        BookingPage.clickingSearchButton();
        BookingPage.choosingTheNumberOfTrain("043 К");
        BookingPage.closingPopupWindow();
        BookingPage.choosingTypeOfPlace("043 К", "Купе");
        BookingPage.choosingPlaceInWagon("Місце: 31");
        BookingPage.fillingLastName(" 31", "Іванов");
        BookingPage.fillingFirstName(" 31", "Іван");
        BookingPage.AssertPrice("179,07 грн");
        TestHelper.sleep(5);
    }

    @Test
    public void test2() {
        BookingPage.ChoosingSiteLanguage();
        BookingPage.setFromWhere("Ль");
        BookingPage.clickStationFromAutosuggest("Львів");
        BookingPage.setToWhere("Ужг");
        BookingPage.clickStationsToAutosuggest("Ужгород");
        BookingPage.setDateOfDeparture(new GregorianCalendar(2015, 10 - 1, 30));
        BookingPage.clickingSearchButton();
        BookingPage.choosingTypeOfPlace("601 Л", "Плацкарт");
        BookingPage.choosingPlaceInWagon("Місце: 40");
        BookingPage.choosingPlaceInWagon("Місце: 42");
        BookingPage.fillingLastName(" 40", "Іванова");
        BookingPage.fillingFirstName(" 40", "Іван");
        BookingPage.fillingLastName(" 42", "Сидоров");
        BookingPage.fillingFirstName(" 42", "Роман");
        BookingPage.AssertPrice("163,76 грн");
        TestHelper.sleep(5);
    }

    @Test
    public void test3() {
        BookingPage.ChoosingSiteLanguage();
        BookingPage.setFromWhere("Мик");
        BookingPage.clickStationFromAutosuggest("Миколаїв Пас");
        BookingPage.setToWhere("Од");
        BookingPage.clickStationsToAutosuggest("Одеса");
        BookingPage.setDateOfDeparture(new GregorianCalendar(2015, 11 - 1, 1));
        BookingPage.clickingSearchButton();
        BookingPage.AssertResultOfSearch("За заданими Вами значенням нічого не знайдено.");
    }


    @After
    public void QUIT() {
        TestHelper.quit();
    }
}
