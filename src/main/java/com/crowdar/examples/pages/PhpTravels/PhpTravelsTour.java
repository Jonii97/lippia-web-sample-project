package com.crowdar.examples.pages.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpTravelsTour extends PhpHomePage{
    public PhpTravelsTour(RemoteWebDriver driver) {
        super(driver);
        this.url="";
    }

    private final String BUTTON_DATE_CSS = "body > div.body-inner > div > div > div.page-wrapper.page-detail.bg-light > div:nth-child(5) > div > div.col-12.col-lg-4.col-xl-3.order-lg-last > aside > div > form > div > div > div > div > div:nth-child(1) > input";
    private final String BUTTON_DAY_XPATH = "//*[@id=\"datepickers-container\"]/div[1]/div/div/div[2]/div[31]";

    private final String BUTTON_ADULTS_CSS = "#selectedAdults";
    private final String BUTTON_ADULTS_NUMBER_CSS = "#selectedAdults > option:nth-child(2)";

    private final String BUTTON_CHILD_CSS = "#selectedChild > option:nth-child(4)";
    private final String BUTTON_CHILD_NUMBER_CSS = "";

    private final String BUTTON_INFANT_CSS = "#selectedInfants > option:nth-child(3)";

    private final String BUTTON_BOOK_NOW_CSS = "body > div.body-inner > div > div > div.page-wrapper.page-detail.bg-light > div:nth-child(5) > div > div.col-12.col-lg-4.col-xl-3.order-lg-last > aside > div > form > div > form > button";

    public void selectionDia()  {
        clickElement(By.cssSelector(BUTTON_DATE_CSS));
        //*[@id=\'datepickers-container\']/div[1]
    }

    public void clickBook(){
        clickElement(By.cssSelector(BUTTON_BOOK_NOW_CSS));
    }
}
