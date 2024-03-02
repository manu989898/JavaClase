import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class puntoTest {

	public punto p1;
	public punto p2;

	@BeforeEach
	public void nuevoPunto() {
		p1 = new punto(1, 1);
		p2 = new punto(1, 2);
	}

	@Test
	public void testEqualsPunto() {
		assertFalse(p1.equals(p2));

	}

	@Test
	public void testDistancia() {
		double distancia = p1.distancia(p2);
		assertEquals(1, distancia);
	}
	
	
	}
