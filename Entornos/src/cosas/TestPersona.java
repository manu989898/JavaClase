package cosas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPersona {
	
	String nombre = "manu";
	Persona persona1 = new Persona(17,"manu", 1998);
	Persona persona2 = new Persona(18,"manu", 1998);
	
	@Test
	void testSetEdad() {
		int edad = 17;
		persona1.setEdad(edad);
		assertEquals(17,edad);
	}
	
	@Test
	void testSetAnyoNacimiento() {
		int anio = 1998;
		persona1.setAnyoNacimiento(anio);
		assertEquals(1998,anio);
	}
	@Test
	void testGetEdad() {
		assertEquals(17,persona1.getEdad());
	}
	@Test
	void testGetAnyoNacimiento() {
		assertEquals(1998,persona1.getAnyoNacimiento());
	}
}
