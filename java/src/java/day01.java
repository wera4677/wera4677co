package java;

public class day01 {
	public static void main(String[] args) {
		  Parent pa = new Parent();

	        pa.display();

	        Child ch = new Child();

	        ch.display();

	        Parent pc = new Child();

	        pc.display(); // Child cp = new Parent();

	}
		
		
	}
	
		
		
	

class aaa{
	protected int num;
 

	public class child extends aaa{
		public void init(int n) {
			num=n;
		}
	}
	
 }

 class Parent {

	    void display() { System.out.println("�θ� Ŭ������ display() �޼ҵ��Դϴ�."); }
	}

	class Child extends Parent {

	    void display() { System.out.println("�ڽ� Ŭ������ display() �޼ҵ��Դϴ�."); }
	}


	