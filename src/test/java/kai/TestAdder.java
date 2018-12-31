package kai;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdder {

	@Test
	public void test1() {
		assertEquals(new Adder().add(2,3),5);
	}

	@Test
	public void test2() {
		assertEquals(new Adder().add(4,3),7);
	}

}
