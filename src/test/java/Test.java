import static org.junit.Assert.*;


public class Test {
	SimpleProgram sim = new SimpleProgram();
	@org.junit.Test
	public void test() {
		fail("Not yet implemented");
	}

	public void SumTest(){
		int i = 23;
		int j = 2;
		assertEquals(sim.sum(i, j), i+j);
	}
	
	public void mulTest(){
		int i = 23;
		int j = 2;
		assertEquals(sim.multiply(i, j),i*j);
	}

}
