class Person{
    public String name;
    public int age;
    public String gender;
     
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
 
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", "
                + "gender=" + gender + "]";
    }   
     
}
 
public class ToString {
 
    public static void main(String[] args) {
        Person p1=new Person("Amit", 27, "Male");
        Person p2=new Person("Riya", 23, "Female");
        System.out.println(p1);//compiler writes here p1.toString()
        System.out.println(p2);//compiler writes here p1.toString()
    }
}