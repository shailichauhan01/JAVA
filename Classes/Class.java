 //Program For Class And Object Concept
 class Class{
    int length, width; // Declaration of variables with private access modifier

    void getData(int x, int y) { // Definition of method 
        length = x;
        width = y;
    }

    int rectArea() { // Definition of another method
        int area = length * width;
        return area;
    }

    public static void main(String args[]) {
        int area1, area2; 
        Class rect1 = new Class(); // Creating Objects
        Class rect2 = new Class();
        
        // Accessing Variables and Methods using getData method
        rect1.length=15;
        rect1.width=10;
        area1=rect1.length*rect1.width;

        rect2.getData(20, 12);
        area2 = rect2.rectArea();

        System.out.println("Area1= " + area1);
        System.out.println("Area2= " + area2);    
    }
}
