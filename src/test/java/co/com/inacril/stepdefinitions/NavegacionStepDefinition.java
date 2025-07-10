package co.com.inacril.stepdefinitions;

import co.com.inacril.tasks.AbrirPagina;
import co.com.inacril.tasks.NavegarPorPagina;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static co.com.inacril.userinterface.Navegacion.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NavegacionStepDefinition {
    @Dado("^que el usuario está en la pagina principal de Inacril$")
    public void queElUsuarioEstáEnLaPaginaPrincipalDeInacril() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.lapagina());

    }


    @Cuando("^navega por la pagina en busca de informacion sobre nuestros productos o nosotros$")
    public void navegaPorLaPaginaEnBuscaDeInformacionSobreNuestrosProductosONosotros() {
        theActorInTheSpotlight().attemptsTo(NavegarPorPagina.navegar());

    }

    @Entonces("^la pagina debe ser responsiva y mostrar todo lo que el usuario quiera ver$")
    public void laPaginaDebeSerResponsivaYMostrarTodoLoQueElUsuarioQuieraVer() {


    }
}