package com.crowdar.examples.steps.PhpTravels;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.PhpTravels.PhpHomePage;
import com.crowdar.examples.pages.PhpTravels.PhpTravelsHotel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PhpSteps extends PageSteps {

    @Given("El usuario esta en la home Page")
    public void elUsuarioEstaEnLaHomePage() {
        Injector._page(PhpHomePage.class).go();
    }

    @When("Selecciono un Tour")
    public void seleccionoUnTour() {
        Injector._page(PhpTravelsHotel.class).selectTour();
    }

    @And("Ingresa una fecha")
    public void ingresaUnaFecha() {
        Injector._page(PhpTravelsHotel.class).datePicker();
    }


    @Then("Click Book")
    public void clickBook() {
        Injector._page(PhpTravelsHotel.class).clickBook();
    }
}
