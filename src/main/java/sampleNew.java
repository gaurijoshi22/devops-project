package devops_lab;


public class sampleNew {
	public double meanCalc() {

		// create an array
		int[] xValues = {95, 85, 80, 70, 60};
		int[] yValues = {85, 95, 70, 65, 70};
		double slp=0;

		// getting array length
		int lengthX = xValues.length; 
		int lengthY = yValues.length;
		
		if (lengthX == lengthY) {

			// default sum value.
			int sumX = 0, sumY = 0;
			double[] diffX = new double[lengthX], diffY = new double[lengthY], prodXY = new double[lengthX], sqX = new double[lengthX];
			double sumProd = 0, sumSq = 0;

			// sum of all values in array using for loop
			for (int i = 0; i < lengthX; i++) {
				sumX += xValues[i];
				sumY += yValues[i];
			}

			double averageX = sumX / lengthX;
			double averageY = sumY / lengthY;
		
			for (int i = 0; i < lengthX; i++) {
				/*diffX[i] = xValues[i]-averageX;
				diffY[i] = yValues[i]-averageY;
				prodXY[i] = xValues[i]*yValues[i];
				sqX[i]= xValues[i]*xValues[i];	
				sumProd += sumProd+prodXY[i];
				sumSq += sumSq+sqX[i]*/
				
				diffX[i] = xValues[i]-averageX;
				diffY[i] = yValues[i]-averageY;
				prodXY[i] = diffX[i]*diffY[i];
				sqX[i]= diffX[i]*diffX[i];	
				sumProd += prodXY[i];
				sumSq += sqX[i];
			}
			slp = sumProd/sumSq;
						
		}
		return(slp);
		
	}
	/*public static void main(String[] args) {
		System.out.println(meanCalc());	
	}*/
}
