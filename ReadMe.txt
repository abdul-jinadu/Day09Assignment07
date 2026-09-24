// The JetBrains article taught me that polymorphism enables the same function to act differently depending on the object that uses it. 
 //Because a subclass can offer its own version of a method inherited from a superclass, the article made it clearer to me how crucial method overriding is to this. 


// The change is creating the new interface Studyable.
// The interface contains a study() method which means that any class implements the interface must have a study() method.
// In the Student class, you can changeed the declaration to Student Extends Person implements Studyable.
// Meaning that it still inherits attributes and methods from Person
// But also agrees to implement study() method from the Studyable interface.
// The existing study() method in Student class increases student gpa by .1 so we don't need to touch that.
// I added @Override above the method to show that the Student class is providing the implementation needed by the interface.
// the change demonstrates hw interfaces and inheritance works togethe in Java.


// One challenge was trying to understand the differene between trying to override and overload.
// Since both involve using the same method name it made it difficult to understand at first.
// Making sure the overload methods also had different parameters so Java could understand which method I used yielded difficult at first.

