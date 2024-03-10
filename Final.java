//Final Keyword

class Final{
    int x;
    public static void main(String []args){
        System.out.println(x);
    }
}
//ComplieTimeError: non-static variable x cannot be referenced from a static context


class Final{
    final int x;
    public static void main(String []args){
        Final ob=new Final();
        System.out.println(ob.x);
    }
}
//CompileTimeError: variable x not initialized in the default constructor


class Final {
    final int x;
    Final() {
        x = 10;
    }
    {
        System.out.println(x); // Static initializer block to print x
    }
}
//CompileTimeError: variable x might not have been initialized


class Final {
    final int x;
    {
        x = 10;
    }
    static{
        Final ob=new Final(); //Create a ob instance to access the 'x' variable
        System.out.println(ob.x); // Static initializer block to print x
    }
    //The purpose of using a static initializer block here is to execute code when the class is loaded into the JVM. 
    public static void main(String[] args)
    {
       //If we cann't create class,give error Cann't find main.
    }
}
//Output: 10



//1. Creating Named Constant
public class Final{
    public static void main(String[] args) {
        final int x = 5;
        x = 10; 
        System.out.println(x);
    }
}
//CompileTimeError: cannot assign a value to final variable x



// 2. Using Final to Prevent Overriding
public class Animal {
    public final void eat() {
        System.out.println("This animal eats food.");
    }
}
 
public class Dog extends Animal {
    // This method would cause a compilation error if uncommented
    public void eat() {
       System.out.println("This dog eats biscuits.");
    }
}



// 3. Using ‘final’ to Prevent Inheritance
public final class FinalClass {
    // Class body
}
 
// This would cause a compilation error
public class AnotherClass extends FinalClass {
   // Attempt to subclass FinalClass
}