package co.com.inacril.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.NoAlertPresentException;

import static co.com.inacril.userinterface.Navegacion.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class NavegarPorPagina implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FACHADA, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                WaitUntil.the(FACHADA, isClickable()).forNoMoreThan(15).seconds(),
                JavaScriptClick.on(FACHADA),

                WaitUntil.the(FACHADAUNO, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                JavaScriptClick.on(FACHADAUNO),

                Click.on(ALUMINIO),

                WaitUntil.the(PUERTAFUEGO, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                Click.on(PUERTAFUEGO),

                WaitUntil.the(ACCESORIOS, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                Click.on(ACCESORIOS),

                WaitUntil.the(INDEX, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                Click.on(INDEX),

                WaitUntil.the(CUBIERTAS, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                WaitUntil.the(CUBIERTAS, isClickable()).forNoMoreThan(15).seconds(),
                JavaScriptClick.on(CUBIERTAS),

                WaitUntil.the(DOMOS, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                JavaScriptClick.on(DOMOS),

                WaitUntil.the(SCROLLD, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                JavaScriptClick.on(SCROLLD),

                WaitUntil.the(HOGAR, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                WaitUntil.the(HOGAR, isClickable()).forNoMoreThan(15).seconds(),
                JavaScriptClick.on(HOGAR),

                WaitUntil.the(INDEX, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                Click.on(INDEX),

                WaitUntil.the(LAMINAS, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                WaitUntil.the(LAMINAS, isClickable()).forNoMoreThan(15).seconds(),
                JavaScriptClick.on(LAMINAS),

                WaitUntil.the(INDEX, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                Click.on(INDEX),

                WaitUntil.the(SERVICIOS, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                WaitUntil.the(SERVICIOS, isClickable()).forNoMoreThan(15).seconds(),
                JavaScriptClick.on(SERVICIOS),

                WaitUntil.the(ASESORIA, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                WaitUntil.the(ASESORIA, isClickable()).forNoMoreThan(15).seconds(),
                JavaScriptClick.on(ASESORIA),

                JavaScriptClick.on(NOSOTROS),

                WaitUntil.the(OFICINAS, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                WaitUntil.the(OFICINAS, isClickable()).forNoMoreThan(15).seconds(),
                JavaScriptClick.on(OFICINAS)



        );
    }

    public static NavegarPorPagina navegar() {
        return instrumented(NavegarPorPagina.class);
    }
}
