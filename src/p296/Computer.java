package p296;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCicle() ����");
		return Math.PI * r * r;
	}
}
