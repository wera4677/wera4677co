package dayday01;

public class day001 {

	public static void main(String[] args) {
		num1(10,5);
		num2(10, 5);
		num3(10, 5);
		num4(10, 5);
		
		
	}
	public static int num1(int a,int b) {
		
		int sum = a/b;
		System.out.println("³ª´°¼À:"+sum);
		return sum ;
	}
public static int num2(int a,int b) {
		int n1 = a + b;
		System.out.println("µ¡¼À:"+n1 );
	
		return  n1 ;
	}
public static int num3(int a,int b) {
	int n2 = a - b;
	System.out.println("»¬¼À:"+n2);

	return  n2;
}
public static int num4(int a,int b) {
	int n3 = a % b;
	System.out.println("³ª¸ÓÁö:"+n3);

	return  n3;
}
}


