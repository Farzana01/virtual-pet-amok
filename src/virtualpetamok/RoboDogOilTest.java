package virtualpetamok;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoboDogOilTest {

	@Test
	public void test() {
		RoboticPet tommy = new RoboDog("RoboDick", "A robotic dog");
		int output = tommy.getOilLevel(); // Constructor creates pet with oil level 50
		tommy.oilPet(); // This method adds 20 to the oil level
		
		output = output + 20; //after performing the oilPet method, it should have a level of 70
		
		assertEquals(70,output);
	}

}

