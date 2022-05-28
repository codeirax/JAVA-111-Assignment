package com.prob4;



class Dog extends Animal{
	
	@Override
	public void makeNoise(){
		
		System.out.println("Barking...");
		
		}
	
	@Override
	public void eat(){
		System.out.println("Dog is eating");
		}
		@Override
		public void walk(){
		System.out.println("Dog is walking");
		}
	
}

class Cat extends Animal{
	@Override
  public void makeNoise(){
		
	System.out.println("Meaw...");
		
		}
	
	@Override
	public void eat(){
		System.out.println("Cat is eating");
		}
		
	   @Override
		public void walk(){
		System.out.println("Cat is walking");
		}
	
}

class Tiger extends Animal{
	@Override
	 public void makeNoise(){
			
		 System.out.println("Raoring...");
				
		}
	@Override
	public void eat(){
		System.out.println("Tiger is eating");
		}
		
	  @Override
		public void walk(){
		System.out.println("Tiger is walking");
		}
	
}

public class Main{
	public static void main(String[] args) {
		

	Animal[] animalArr = new Animal[3];
	
	animalArr[0] = new Dog();
	animalArr[1] = new Cat();
	animalArr[2] = new Tiger();
	
	for(Animal i : animalArr) {
//		System.out.println(i);
		i.makeNoise();
		i.eat();
		i.walk();
       System.out.println("**********************");
	}
  
		
	}

	
}


