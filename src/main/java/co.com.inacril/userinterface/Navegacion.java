package co.com.inacril.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Navegacion {
    public static final Target FACHADA = Target.the("Entrar al apartado fachada")
            .located(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div/nav[1]/ul/li[2]/a"));
    public static final Target FACHADAUNO = Target.the("Entrar a panel fenolico")
            .located(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div/nav[1]/ul/li[2]/ul/li[1]/a"));
    public static final Target ALUMINIO = Target.the("Entrar aL apartado aluminio")
            .located(By.xpath("/html/body/main/div/div/div[2]/div/div[2]/div/div/ul/li[2]"));

    public static final Target PUERTAFUEGO = Target.the("Entrar al apartado de puerta corta fuego")
            .located(By.xpath("/html/body/main/div/div/div[2]/div/div[2]/div/div/ul/li[3]"));

    public static final Target ACCESORIOS = Target.the("Entrar al apartado de accesorios")
            .located(By.xpath("//*[@id=\"uc_content_tabs_elementor_0c65f94_item3\"]/div/div/div/div/div[2]/div/div[2]/div/div/a"));

    public static final Target INDEX = Target.the("regresar a la pagina principal")
            .located(By.xpath("/html/body/div[1]/header/div/div[1]/div/a/img"));

    public static final Target CUBIERTAS = Target.the("Entrar al apartado de cubiertas")
            .located(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div/nav[1]/ul/li[3]/a"));

    public static final Target DOMOS = Target.the("Entrar al apartado de domos y cupulas")
            .located(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div/nav[1]/ul/li[3]/ul/li[1]/a"));


    public static final Target SCROLLD = Target.the("bajar al footer de domos y cupulas ")
            .located(By.xpath("/html/body/div[1]/header/div/div[1]/div/a/img"));


}
