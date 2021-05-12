package com.crowdar.examples.steps.PhpTravels;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.PhpTravels.PhpHomePage;
import com.crowdar.examples.pages.PhpTravels.PhpTravelsTour;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PhpSteps extends PageSteps {

    @Given("El usuario esta en la home Page")
    public void elUsuarioEstaEnLaHomePage() {
        Injector._page(PhpHomePage.class).go();
    }

    @When("Selcciono un tour")
    public void selccionoUnTour() {
        Injector._page(PhpHomePage.class).clickBoton();
    }

    @And("Selecciono una fecha")
    public void seleccionoUnaFecha() {
        Injector._page(PhpTravelsTour.class).selectionDia();
    }

    @And("Selecciono la cantidad de adulos a viajar")
    public void seleccionoLaCantidadDeAdulosAViajar() {

    }

    @And("Selecciono la cantidad de chicos")
    public void seleccionoLaCantidadDeChicos() {

    }

    @And("Selecciono la cantidad de infantes")
    public void seleccionoLaCantidadDeInfantes() {
    }

    @Then("Reservar el tour")
    public void reservarElTour() {
        Injector._page(PhpTravelsTour.class).clickBook();
    }
}
