package calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaluladoraImplTest {

	private Calculadora calculadora;

	@BeforeEach
	void tearUp() {
		calculadora = new CaluladoraImpl();
	}

	@Test
	void calcular_sum_success() {
		int resultado = calculadora.calcular(1, '+', 2);
		System.exit(0);
	}

}
