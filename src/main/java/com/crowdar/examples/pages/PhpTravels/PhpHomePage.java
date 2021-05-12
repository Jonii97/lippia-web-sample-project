package com.crowdar.examples.pages.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpHomePage extends PhpBasePage{
    public PhpHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url="";
    }

    private final String BUTTON_CSS = "body > div.body-inner > div.main-wrapper.scrollspy-action > div:nth-child(6) > div > div.row.equal-height.cols-2.cols-md-2.cols-lg-4.gap-10.gap-md-20.gap-xl-30 > div:nth-child(7) > figure > a";

    public void go(){navigateToCompleteURL();}
    public void clickBoton(){
        clickElement(By.cssSelector(BUTTON_CSS));
    }

}
