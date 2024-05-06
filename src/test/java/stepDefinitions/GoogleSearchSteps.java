package stepDefinitions;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

    @Given("que estoy en la página de inicio de Google")
    public void abrirNavegador() {
    	System.out.println("Abrimos Navegador Chrome");
    }

    @When("ingreso {string} en el campo de búsqueda")
    public void ingresarTextoBusqueda(String texto) {
    	System.out.println("Ingresando Texto de busqueda : CUCUMBER");
    }

    @And("presiono Enter")
    public void presionarEnter() {
        System.out.println("Presionar tecla Enter");
    }

    @Then("veo resultados relacionados con {string}")
    public void verificarResultados(String resultadoEsperado) {
        System.out.println("Validar resultado de busqueda.");
    }

}
