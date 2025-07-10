package co.com.inacril.tasks;

import co.com.inacril.userinterface.InicioInacril;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    InicioInacril inicioInacril;

    public static AbrirPagina lapagina(){ return Tasks.instrumented(AbrirPagina.class);}
    @Override
    public <T extends Actor> void performAs(T actor){actor.attemptsTo(Open.browserOn(inicioInacril));}
}