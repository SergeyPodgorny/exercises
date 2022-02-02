package scratch;

import java.util.Arrays;

public class HeatGenerationFieldTest {
	
	
	
private double kQ; 
	
	private double [][] returnableArray = new double [15][15];
	
	
	public HeatGenerationFieldTest(double kQ) {
		this.kQ = kQ;
	}
	
		
	public void heatGenerationField(){
		
		for (int i = 0; i < 15; i++ ) {
			for (int j = 0; j < 15; j++) {
				returnableArray[i][j] = kQ * 10 * Math.cos(0.17346 * j - 1.5612) * Math.cos(0.20279 * i - 1.8251);
			}
		}
		
		matrixPrinter(returnableArray);
		
	}

	
	public void matrixPrinter(double [][] someArray) {
		
		
		System.out.println(Arrays.deepToString(someArray).replace("], ", "]\n"));
		
//		for(double [] iter: someArray) {
//			System.out.println(iter);
//		}
//		
		for (int i = 0; i < 15; i++ ) {
			for (int j = 0; j < 15; j++) {
				System.out.println(returnableArray[i][j] + "/t");
			}
		}
		
		
	}
	

	public double getkQ() {
		return kQ;
	}

	

}
