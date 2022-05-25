package dayday01;



public class day15 {

	public static void main(String[] args) {
		/*String str1 ="990118-1853927";
		String str2 =str1.substring(0,6)+' '+str1.substring(7);
		
		
		System.out.println(str2);*/
		
		/*StringBuffer str=new StringBuffer("990118-1853927");
		str.replace(6, 7, " ");
		System.out.println(str);*/
		
		
		/*StringBuffer std=new StringBuffer("12");
		std.append("34");
		System.out.println(std.tostring());
		System.out.println(std);
		
		
		Box box=new Box("cdsdww");
		Box.box("cdsdww");
		System.out.println(box);
		System.out.println(box.tostring());*/
		
		
		
	}

}
class Box{
	private String conts;
	
	Box(String cont){
		this.conts=cont;
	}
	public String tostring() {
		return conts;
	}
	
}