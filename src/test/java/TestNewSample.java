
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.apache.commons.math3.stat.regression.SimpleRegression;

class TestNewSample {
	
	

	@Test
	void test() {
		sampleNew s=new sampleNew();
		
		SimpleRegression simpleRegression = new SimpleRegression(true);
		int[] xValues = {95, 85, 80, 70, 60};
		int[] yValues = {85, 95, 70, 65, 70};
		
		double[][] testValues = new double[xValues.length][yValues.length];
		
		for(int i=0;i<xValues.length;i++) {
			
				testValues[i][0]=xValues[i];
				testValues[i][1]=yValues[i];
			
		}
		
		 simpleRegression.addData(testValues);

     // querying for model parameters
     double inBuiltSlope = simpleRegression.getSlope();
     double testMethodSlope = s.meanCalc();
     System.out.println(inBuiltSlope+" "+testMethodSlope);
	assertEquals(inBuiltSlope, testMethodSlope,0.001);
	}

}
