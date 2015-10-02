package com.company;

import com.sun.jna.platform.win32.BaseTSD;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by md212 on 03.09.15.
 */
public class AngelTests {

    @Before
    public void WDriver() {
        TestHelper.setup(AngelPage.url);
        //TestHelper.get("http://angel.net/~nic/passwd.current.html"); // opening url

    }

    @Test
    public void test1() {

        AngelPage.setMasterPassword("master");

        AngelPage.setSiteName("google.com");

        AngelPage.clickingButtonGenerate();

        System.out.println(AngelPage.getGeneratedPassword());

        TestHelper.sleep(1);
    }

    @Test
    public void test2() {
        String master = "master";
        String SiteName = "goole.com";

        AngelPage.setMasterPassword(master);

        AngelPage.setSiteName(SiteName);

        AngelPage.clickingButtonGenerate();

        AngelPage.assertMasterPasswordIs(master);

        TestHelper.sleep(1);

    }

    @Test
    public void test3() {
        String master = "master";
        String SiteName = "goole.com";

        AngelPage.setMasterPassword(master);

        AngelPage.setSiteName(SiteName);

        AngelPage.clickingButtonGenerate();

        AngelPage.assertSiteNameIs(SiteName);

        TestHelper.sleep(1);
    }

        @Test
    public void test4() {

        // 1. master: hello
        AngelPage.setMasterPassword("hello");
        // 2. site: google.com
        AngelPage.setSiteName("google.com");
        // 3. click "Generate"
        AngelPage.clickingButtonGenerate();
        // 4. print value from the third field
        System.out.println(AngelPage.getGeneratedPassword());

        TestHelper.sleep(1);
    }

    @Test
    public void test5() {

        AngelPage.setMasterPassword("qwe123");
        AngelPage.setSiteName("gmail.com");
        AngelPage.ClickingENTER();
        // 4. Check generated password mKJAakDvwbhi6@1a
        AngelPage.AssertGeneratedPassword("mKJAakDvwbhi6@1a");

        TestHelper.sleep(1);
    }

    @Test
    public void test6() {


        AngelPage.setMasterPassword("qwe123");
        AngelPage.setSiteName("gmail.com");
        AngelPage.clickingButtonGenerate();
        AngelPage.AssertGeneratedPassword("mKJAakDvwbhi6@1a");

        TestHelper.sleep(1);

    }

    @Test
    public void test7() {

        AngelPage.setMasterPassword("");
        AngelPage.setSiteName("");
        AngelPage.clickingButtonGenerate();
        AngelPage.AssertGeneratedPassword("BaefBs8/Z/cm2@1a");
        TestHelper.sleep(1);
    }

    @Test
    public void test8() {

        AngelPage.setMasterPassword("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        AngelPage.setSiteName("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        AngelPage.clickingButtonGenerate();
        int f = 16;
        AngelPage.AssertIfPasswordCorrect(f, "value");
        TestHelper.sleep(1);
    }

    @Test
    public void test9() {

        AngelPage.setMasterPassword("");
        AngelPage.setSiteName("");
        AngelPage.ClickingENTER();
        AngelPage.AssertGeneratedPassword("BaefBs8/Z/cm2@1a");
        TestHelper.sleep(1);
    }

    @Test
    public void test10() {

        AngelPage.setMasterPassword("333");
        AngelPage.setSiteName("111");
        AngelPage.clickingButtonGenerate();
        AngelPage.AssertGeneratedPassword("CD/iUTsNwzV4v@1a");
        TestHelper.sleep(1);
    }

    @Test
    public void test11() {

        AngelPage.setMasterPassword("111");
        AngelPage.setSiteName("333");
        AngelPage.clickingButtonGenerate();
        AngelPage.AssertGeneratedPassword("A61tAOVfX4wCm@1a");
        TestHelper.sleep(1);
    }

    @Test
    public void test12() {

        AngelPage.setMasterPassword("~!@#$%^&*()_+{}|:?></");
        AngelPage.setSiteName("~!@#$%^&*()_+{}|:?></");
        AngelPage.clickingButtonGenerate();
        AngelPage.AssertGeneratedPassword("a6TqQvX2FDE6v@1a");
        TestHelper.sleep(1);
    }

    @Test
    public void test13() {

        AngelPage.setMasterPassword("qwe123");
        AngelPage.setSiteName("asd");
        AngelPage.clickingButtonGenerate();
        AngelPage.AssertGeneratedPassword("agdjoTB4cjI5E@1a");
        TestHelper.sleep(1);
    }

    @Test
    public void test14() {

        AngelPage.setMasterPassword("qwe123");
        AngelPage.setSiteName("ASD");
        AngelPage.clickingButtonGenerate();
        AngelPage.AssertGeneratedPassword("FkfaCm2ddwvDg@1a");
        TestHelper.sleep(1);
    }

    @Test
    public void test15() {

        AngelPage.AssertNameOfFieldMasterPas("Your master password");
    }

    @Test
    public void Test16() {

        AngelPage.AssertNameOfFieldSiteName("Site name");
    }

    @Test
    public void test17() {
        AngelPage.AssertNamesOfFieldGeneratedPassword("Generated password");
    }

    @After
    public void QUIT() {
        TestHelper.quit();
    }

}


