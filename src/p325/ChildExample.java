package p325;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "data2";
		//parent.method3();
		
		Child child = (Child) parent;
		child.field2 = "uuu";
		child.method3();
		
	}

}
