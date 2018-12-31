package kai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Adder {
	
	Logger logger = LoggerFactory.getLogger(Adder.class);
	
	public int add(int a, int b)
	{
		int res = a + b;
		logger.info("Adding " + a + " and " + b + " getting " + res);
		return res;
	}

}
