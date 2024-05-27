package com.fallabela.utils.constants;

public enum errosMessage {
	IMPOSIBLE_INSTANCIAR("No es posible instanciar esta clase");
	
	private String mensaje;

	errosMessage(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}
	
	

}
