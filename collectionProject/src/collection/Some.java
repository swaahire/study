package collection;

public class Some {
	int i;
public Some(int i) {
	super();
	this.i=i;
}
public static void main(String[] args) {
	Some s1=new Some(10);
	Some s2=new Some(10);
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
}
}