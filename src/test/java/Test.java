import static org.junit.Assert.*;

import org.mockito.Mockito;


public class Test {
	SimpleProgram sim = new SimpleProgram();
	SimpleProgram simMockito = Mockito.mock(SimpleProgram.class);

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
	
	public void SumTestMockito(){
		int i = 23;
		int j = 2;

		Mockito.when(simMockito.multiply(i, j)).thenReturn(i*j);
	}
	
	public void mulTestMockito(){
		int i = 23;
		int j = 2;

		Mockito.when(simMockito.sum(i, j)).thenReturn(i+j);
	}

}
