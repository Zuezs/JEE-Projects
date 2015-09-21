import java.util.ArrayList;
import java.util.List;

class FancyCollection<T> extends Animal{
	
	T thing;
	
	public T getThing(){
		return this.thing;
	}
	
}

class Animal{}
class Dog extends Animal{}

public class CollectionsTest2 {

	//Playing with Generics
	public static void main(String[] args) {
		
		FancyCollection<Dog> foo = new FancyCollection<>();
		
		//If Fancy is a string
		//foo.thing = "Hello World!" 
		foo.thing = new Dog();
		
		
		System.out.println(foo.getThing());
	}
	
	
}
