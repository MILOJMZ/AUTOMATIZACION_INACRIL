package co.com.inacril.utills.hooks;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
public class PreparacionEscenario {
    @Before
    public  void sepUp(){
        setTheStage(new OnlineCast());
        theActorCalled("usuario");
    }
}
