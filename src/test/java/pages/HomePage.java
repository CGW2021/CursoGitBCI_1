package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilidades.ClaseBase;

public class HomePage extends ClaseBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Identificar localizadores
	//Cambio 3: Agrega comentario al By locator
    By locatorBtnHazteCliente = By.partialLinkText("Hazte clien");


    //acciones del page
    public void irAHazteCliente(){
        //un click con espera
        click(esperarPorElementoAClickear(locatorBtnHazteCliente));
        //con el webElement
    }
}
