# Java_assignment_4.3
Java_assignment_4.3

#Q- Class A extends class B, which extends class C. Also all the three classes implement the method test(). How can a method in a class A invoke the test() // // method defined in class C (without creating a new instance of class C)

#Explanation- all the three classes implement the method test()." so all classes made their own implementation of test() method. To be more precise subclasses override this method. To invoke method from superclass you could call super.test() but you can't do super.super.test() in Java
  	 	
So you can only call methods from superclass, and superclass can invoke method from its superclass, but directly calling method from super-superclass is impossible.

#ans-f. It is not possible to invoke test() method defined in C from a method in A.
