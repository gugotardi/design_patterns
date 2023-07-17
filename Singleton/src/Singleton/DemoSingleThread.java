package Singleton;

public class DemoSingleThread {
	public static void main (String[] args) {
		System.out.println("Teste");
		
		Singleton singleton = Singleton.getInstance("Gus"); 
		Singleton anotherSingleton = Singleton.getInstance("Teste");
		System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
	
	}

}
