package JavaDay2;

public class Singleton {
	private static Singleton single_instance=null;
	public static String s;
	private Singleton()
	{
		s="Hello Everyone";
	}
	private static Singleton getInstance()
	{
		if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
	}
	public static void main(String[] args) {
		
		Singleton obj=Singleton.getInstance();
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		
		System.out.println("String:"+obj.s);
		System.out.println("Hashcode:"+obj.hashCode());
		System.out.println("String:"+obj1.s);
		System.out.println("Hashcode:"+obj1.hashCode());
		System.out.println("String:"+obj2.s);
		System.out.println("Hashcode:"+obj2.hashCode());
	}

		
}

