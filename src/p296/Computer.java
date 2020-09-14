package p296;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer °´Ã¼ÀÇ areaCicle() ½ÇÇà");
		return Math.PI * r * r;
	}
}
