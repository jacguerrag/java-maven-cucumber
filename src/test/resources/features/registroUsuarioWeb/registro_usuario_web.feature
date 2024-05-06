Feature: Registro de usuarios en un sitio web
	Como un visitante del sitio web
	Quiero poder registrame para acceder a funcionalidades adicionales
	Para poder interactuar con la plataforma de manera personalizada
	
	Scenario: Registro exitoso de un nuevo usuario
		Given que estoy en la pagina de registro del sitio web
		When ingreso mis datos personales
		And selecciono un nombre de usuario y password
		And acepto los terminos y condiciones
		And hago click en el boton de registrarme
		Then deberia ver un mensaje de confirmacion de registro
		And deberia recibir un correo electronico de confirmacion
		
		
