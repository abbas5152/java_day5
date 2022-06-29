//Q3) Create a class Shapes that has following overloading methods:
//public void area(Circle circle);
//public void area(Rectangle rectangle);
//public void area(Square square);
//        Class Circle has following fields :
//        int radius;
//        Class Rectangle has following fields :
//        int length;
//        int breadth;
//        Class Square has following fields :
//        int side;
//        Create the Main class with the main method and inside the main method do the
//        following things:
//        Make the single object of the Shape class and call all 3 area methods based on the argument.
//        With the help of this explain static polymorphism.




public class area {
    static class  Circle{
        int radius;
    }
    public static class  Rectangle{
        int length;
        int breath;
    }
    public static class  Square{
        int side;
    }

    public void area(Circle circle){
        System.out.println("area is of circle is"+ 3.14*circle.radius* circle.radius);

    }
public void area(Rectangle rectangle){
    System.out.println("area of rectangle is "+ rectangle.length* rectangle.breath);

}
public void area(Square square){
    System.out.println("area of square is "+ square.side*square.side);

}

    public static void main(String[] args) {
        area a1=new area();

        Circle c1= new Circle();
        Rectangle r1=new Rectangle();
        Square s1=new Square();
        c1.radius=5;
        r1.length=5;
        r1.breath=5;
        s1.side=6;
        a1.area(c1);
        a1.area(r1);
        a1.area(s1);


    }


}
