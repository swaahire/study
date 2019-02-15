package BasicProgram;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	 
	/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
	public class ArrayListTest {
	    public static void main(String args[]) {
	           List<String> arrayList = new ArrayList<String>();
	 
	           arrayList.add("a");
	           arrayList.add("b");
	 
	           Iterator<String> iterator = arrayList.iterator();
	           while (iterator.hasNext()) {
	                  System.out.println(iterator.next());
	                  arrayList.add("c");
	           }
	    }
	}

