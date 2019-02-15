package collection;
public class Person implements Comparable<Person>{
double height,weight;
String name;
public void Person(String name,double weight,double height){
	this.name=name;
	this.weight=weight;
	this.height=height;
	
}
	@Override
	public int compareTo(Person p1) {
		if(weight>p1.weight){
		return 1;
		}else if(weight==p1.weight){
			return 1;
		}else if(weight<p1.weight){
			return -1;
		}else{
			return 0;
			
		}
		
	}
	
}
