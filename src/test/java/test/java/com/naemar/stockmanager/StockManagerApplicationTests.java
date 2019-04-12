package test.java.com.naemar.stockmanager;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import main.java.com.naemar.stockmanager.StockManagerApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StockManagerApplication.class)
public class StockManagerApplicationTests {

	@Test
	public void contextLoads() {
		assertTrue("This will succeed.", true);
	}

}
