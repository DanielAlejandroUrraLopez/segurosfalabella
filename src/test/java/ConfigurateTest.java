
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import cl.segurosfalabella.segurosfalabellatest.segurosfalabellatest.SegurosfalabellatestApplication;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK, 
classes = {
		SegurosfalabellatestApplication.class
		
	}
)
public class ConfigurateTest {

	@Test
	public void context() {
		
	}
}
