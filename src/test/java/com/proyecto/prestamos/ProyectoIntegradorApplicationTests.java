package com.proyecto.prestamos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class ProyectoIntegradorApplicationTests {
	
	@Autowired
	private BCryptPasswordEncoder encriptar;

	@Test
	void contextLoads() {
		//System.out.println("Clave: " +  encriptar.encode("mar") ); //Marco
		System.out.println("Clave: " +  encriptar.encode("robert") ); // Roberto
	}

}
