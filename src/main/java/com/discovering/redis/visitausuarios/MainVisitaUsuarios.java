package com.discovering.redis.visitausuarios;

import java.util.Random;

public class MainVisitaUsuarios {

	public static void main(String[] args) {
		int quantidadeUsuarios = 500;
		int quantidadeAcessos = 1000;
		int quantidadeDias = 30;
		
		Random random = new Random();
		ArmazenaAcessosDeUsuariosComBitmap acesso = new ArmazenaAcessosDeUsuariosComBitmap();
		
		for (int i = 1; i <= quantidadeAcessos; i++) {
			long usuario = random.nextInt(quantidadeUsuarios) + 1;
			String data = String.format("%02d/11/2013", random.nextInt(quantidadeDias) + 1);
			acesso.armazenar(usuario, data);
		}
	}

}
