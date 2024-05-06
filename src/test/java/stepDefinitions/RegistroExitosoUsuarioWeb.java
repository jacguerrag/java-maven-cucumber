package stepDefinitions;

import io.cucumber.java.en.*;

public class RegistroExitosoUsuarioWeb {
	
	@Given("que estoy en la pagina de registro del sitio web")
	public void abrirNavegador() {
		System.out.println("Abrimos Navegador Chrome");
	}
	@When("ingreso mis datos personales")
	public void ingresar_datos_personales() {
		System.out.println("Ingresar datos personales");
	}
	@And("selecciono un nombre de usuario y password")
	public void seleccionar_nombre_password() {
		System.out.println("selecciono un nombre de usuario y password");
	}
	@And("acepto los terminos y condiciones")
	public void aceptar_terminos_condiciones() {
		System.out.println("acepto los terminos y condiciones");
	}
	@And("hago click en el boton de registrarme")
	public void hacer_click_boton_registrarme() {
		System.out.println("hago click en el boton de registrarme");
	}
	@Then("deberia ver un mensaje de confirmacion de registro")
	public void validar_mensaje_confirmacion_registro() {
		System.out.println("deberia ver un mensaje de confirmacion de registro");
	}
	@And("deberia recibir un correo electronico de confirmacion")
	public void validar_correo_electronico_confirmacion() {
		System.out.println("deberia recibir un correo electronico de confirmacion");
	}
			

}
