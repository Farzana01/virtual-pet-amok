package virtualpetamok;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrgDogFeedTest {

	@Test
	public void test() {
		OrgDog benny = new OrgDog("Benny","Cutest dog in the world");
		int output = benny.hunger; // Constructor creates hunger level at 50
		
		benny.feed(); // This method adds 20 to the oil level
		output = output -20; //after performing the feed method, it should have a level of 30
		
		assertEquals(30,output);
		
	}

}
