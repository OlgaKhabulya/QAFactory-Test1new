package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;


/**
 * Created by md212 on 22.09.15.
 */
public class BookingPage {
    public static String url = "http://booking.uz.gov.ua";

    public static void ChoosingSiteLanguage() {
        TestHelper.wdr.findElement(By.xpath("//li/a[@href='http://booking.uz.gov.ua/']")).click();
        TestHelper.waitForElement("html[@lang='uk']");
    }

    public static void setFromWhere(String firstLetters) {

        TestHelper.wdr.findElement(By.xpath("//input[@name='station_from']")).sendKeys(firstLetters);
    }

    public static void clickStationFromAutosuggest(String fullStationName) {
        WebElement comboBoxItem = TestHelper.waitForElement("//div[@id='stations_from']/div[@title='" + fullStationName + "']");
        comboBoxItem.click();
    }

    public static void setToWhere(String firstLetters) {
        TestHelper.wdr.findElement(By.xpath("//input[@name='station_till']")).sendKeys(firstLetters);
    }

    public static void clickStationsToAutosuggest(String fullStationName) {
        WebElement combobBoxItem = TestHelper.waitForElement("//div[@id='stations_till']/div[@title='" + fullStationName + "']");
        combobBoxItem.click();
    }


    public static void setDateOfDeparture(GregorianCalendar date) {
        TestHelper.wdr.findElement(By.xpath("//input[@id='date_dep']")).click();
        String monthAndYear = new SimpleDateFormat("LLLLL yyyy", new Locale("UK")).format(date.getTime());
        String dayOfMonth = new SimpleDateFormat("d").format(date.getTime());
        TestHelper.wdr.findElement(By.xpath("//caption[text()='"
                + monthAndYear +"']/..//td[text()="
                + dayOfMonth+"]")).click();


    }

    public static void clickingSearchButton() {
        TestHelper.wdr.findElement(By.xpath("//button[@name='search']")).click();
    }

    public static void choosingTheNumberOfTrain(String NumberOfTrain) {
        WebElement WaitingListOfTrains = TestHelper.waitForElement("//td/a[text()='"+ NumberOfTrain +"']");
        WaitingListOfTrains.click();
    }

    public static void closingPopupWindow() {
        WebElement WaitingForPopup = TestHelper.waitForElement("//div[@class='vToolsPopupHeader']/a[@href='javascript://']");
        WaitingForPopup.click();
    }


    public static void choosingTypeOfPlace(String trainCode, String TypeOfPlace) {
        TestHelper.waitWhenElementDisappear("//div[@id='loading_img']");
        TestHelper.waitWhenElementDisappear("//div[@class='vToolsPopupHeader']/a[@href='javascript://']");
        WebElement waitWhenTrainCodeAndTypeOfPlaceAppear = TestHelper.waitForElement("//tr[@class='vToolsDataTableRowSelected' or @class='vToolsDataTableRow' or @class='vToolsDataTableRow2'][td[@class='num']/a[text()='" + trainCode + "'] ]//div[@title='" + TypeOfPlace + "']/button");
        waitWhenTrainCodeAndTypeOfPlaceAppear.click();
    }

    public static void choosingPlaceInWagon(String NumberOfPlaceInWagon) {
        TestHelper.waitWhenElementDisappear("//div[@id='loading_img']");
        WebElement WaitingForPlaceInPopup = TestHelper.waitForElement("//a[@title='" + NumberOfPlaceInWagon + "']");
        WaitingForPlaceInPopup.click();
    }

    public static void fillingLastName(String Place, String LastName) {
        TestHelper.wdr.findElement(By.xpath("//tr[@class='vToolsDataTableRowSelected' or @class='vToolsDataTableRow2' or @class='vToolsDataTableRow'][td//text()[contains(., '"+ Place+"')]]//label/input[@class='lastname']")).sendKeys(LastName);
    }

    public static void fillingFirstName(String Place, String FirstName) {
        TestHelper.wdr.findElement(By.xpath("//tr[@class='vToolsDataTableRowSelected' or @class='vToolsDataTableRow2' or @class='vToolsDataTableRow'][td//text()[contains(., '"+ Place+"')]]//label/input[@class='firstname']")).sendKeys(FirstName);
    }

    public static void AssertPrice(String Price) {
        TestHelper.waitForElement("//button/b");
        org.junit.Assert.assertEquals(Price, TestHelper.wdr.findElement(By.xpath("//button/b")).getText());
    }

    public static void AssertResultOfSearch(String ResultsOfSearch) {
        TestHelper.waitWhenElementDisappear("//div[@id='loading_img']");
        TestHelper.waitForElement("//div[@id='ts_res_not_found'][text()]");
        org.junit.Assert.assertEquals(ResultsOfSearch, TestHelper.wdr.findElement(By.xpath("//div[@id='ts_res_not_found'][text()]")).getText());

    }
}


//tr[@class='vToolsDataTableRowSelected' or @class='vToolsDataTableRow2'][td//text()[contains(., ' 40')]]//label/input[@class='lastname']
//div[@id='loading_img']



/////div[@class='vToolsPopup coachScheme']//a[@href='#5' and @class='active']//..//a[@title='Місце: 21']
//(//tr[@class='vToolsDataTableRow']//td/a[text()='043 К'])|(//tr[@class='vToolsDataTableRow']//div[@title='Купе']/button)
//tr[@class='vToolsDataTableRow'][contains (@a,'043 К')]//div[@title='Купе']/button)]

