package com.discovering.redis.filasemails;

public class MainArmazenaItensNaFila {

	public static void main(String[] args) {
		ArmazenaItemNaFila fila = new ArmazenaItemNaFila();
		fila.agentarAutorizacaoDeUsuario("Daenerys Targaryen", "daenerys@targaryen.com");
		fila.agentarAutorizacaoDeUsuario("Jon Snow", "jon@snow.com");
		fila.agentarAutorizacaoDeUsuario("Tyrion Lannister", "tyrion@lannister.com");
	}

}
