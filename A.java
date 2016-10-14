// Class A extends class B, which extends class C. Also all the three classes implement the method test(). How can a method in a class A invoke the test() // // method defined in class C (without creating a new instance of class C).

class C {	 
	public void test(){
		System.out.println("class C");
	}	
}
// class B extending C
class B extends C {
	 @Override
	public void test(){
		System.out.println("class B Extends C");	
	}	
}
// class A extending B
class A extends B{
	
	@Override
	public void test(){
	System.out.println("class A Extends B");		
	}
		
	public static void main(String[] args){	
	// for calling C Class test Method from Class "A" without any instance of class a we need to call 'super.super.test()',and unfortunately its not possible in java.
	
	}	
}

/**all the three classes implement the method test()." so all classes made their own implementation of test() method. To be more precise subclasses override this method. To invoke method from superclass you could call super.test() but you can't do super.super.test() in Java
  	 	
So you can only call methods from superclass, and superclass can invoke method from its superclass, but directly calling method from super-superclass is impossible. */
