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

    public static final Target HOGAR = Target.the("Entrar al apartado de hogar del Header ")
            .located(By.xpath("//*[@id=\"menu-1-17bfe60\"]/li[4]/a"));

    public static final Target LAMINAS = Target.the("Entrar al apartado de laminas del Header")
            .located(By.xpath("//*[@id=\"menu-1-17bfe60\"]/li[5]/a"));

    public static final Target SERVICIOS = Target.the("Entrar al apartado de servicios del Header ")
            .located(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div/nav[1]/ul/li[6]/a"));

    public static final Target ASESORIA = Target.the("Entrar al apartado de asesoria del Header ")
            .located(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div/nav[1]/ul/li[6]/ul/li[1]/a"));

    public static final Target HOME = Target.the("Logo Inacril")
            .located(By.xpath("//a[@href='https://inacril.com']"));
    public static final Target NOSOTROS = Target.the("Entrar al apartado de nosotros del Header ")
            .located(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[2]/div/div/a"));

    public static final Target OFICINAS = Target.the("Botón oficinas")
            .locatedBy("/html/body/div[1]/div[3]/div[2]/div[2]/div[3]/div/div/a");



}
