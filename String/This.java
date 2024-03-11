// Using the concept of class and objects design a class Student that contain the following attributes:name,age,dept,rollno.
// With the help of student class object access these attributes provided methods are getInfo() and showInfo().
// Such that the accessibility of these method is public in nature.You can Consider the data members.

class This{
    private String name;
    private int age;
    private String dept;
    private int rollno;

    public void getInfo(String name,int age,String dept,int rollno){
        this.name=name;
        this.age=age;
        this.dept=dept;
        this.rollno=rollno;
    }

    public void showInfo(){
        System.out.println("Name is:"+name);
         System.out.println("Age is:"+age);
          System.out.println("Dept is:"+dept);
           System.out.println("RollNo is:"+rollno);
    }

    public static void main(String[] args){
        This ob=new This();
        ob.getInfo("Shaili",20,"CSE",101);
        ob.showInfo();
    }
}