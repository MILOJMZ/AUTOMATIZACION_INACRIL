package co.com.inacril.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static java.lang.Thread.sleep;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Esperar implements Task {

    private final int segundos;

    public Esperar(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            sleep(segundos * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static Esperar por(int segundos) {
        return instrumented(Esperar.class, segundos);
    }
}
