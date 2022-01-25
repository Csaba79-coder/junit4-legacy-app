package guru.springframework;

// import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

// @RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Spring5RecipeAppApplicationTests {

	// if right click on folder --> optimize import (it is a good tool)
	// changed all annotation for converting the test ... watch out the imports in case of @Test annotation
	// instead of it: import org.junit.Test; --> we need the jupiter api! --> import org.junit.jupiter.api.Test;,

	@Test
	public void contextLoads() {
	}

}
