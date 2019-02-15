package BasicProgram;

public class Try {
	public int show(){
		try{ 
			int i = 0;
			return i ;
		}
		finally{
			System.out.println("Finally block");
		}
	
	}
public static void main(String[] args) {
	Try obj=new Try();
	obj.show();
}
	
}