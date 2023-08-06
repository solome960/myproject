import java.util.Scanner;

public class main {
    public static void main(String[] args){
     
     Scanner scanner =new Scanner(System.in);
    
    
     
//circle     
          
         System.out.println("FOR CIRCLE");
          System.out.println("enter the radius");
          double radius=scanner.nextDouble();
          System.out.println("enter the color");
          String color=scanner.next();
          circle c=new circle(radius,color);
         
          System.out.println("area of the circle is"+"="+ c.calculateArea());
          double perimeter=c.calculateperimeter( );
          System.out.println("perimeter of the circle is"+"="+ perimeter);
          System.out.println("the color of the circle is"+"="+ color);
          

//rectangle

     
        System.out.println("FOR RECTANGLE");
        System.out.println("enter the length");
        double length=scanner.nextDouble();
        System.out.println("enter the weidth");
        double width=scanner.nextDouble();
        System.out.println("enter the color");
        String colo=scanner.next();
        rectangle r=new rectangle(length,width,colo);
        double area=r.calculateArea( );
        System.out.println("area of the rectangle is"+"="+ area);
        double peri=r.calculatePerimeter( );
        System.out.println("perimeter of the rectangle is"+"="+ peri);
        System.out.println("the color of the circle is"+"="+ colo);
        

//triangle        

       System.out.println("FOR TRIANGLE");
       System.out.println("enter the base");
       double base=scanner.nextDouble();
       System.out.println("enter the height");
       double height=scanner.nextDouble();
       System.out.println("enter the hypotenuse");
       double hypotenuse=scanner.nextDouble();
       System.out.println("enter the color");
       String colore=scanner.next();
       triangle t=new triangle(base,height,hypotenuse,colore);
       double ar=t.calculateArea();
       System.out.println("area of the triangle is"+"="+ar);
       double perimet=t.calculateperimeter();
       System.out.println("perimeter of the triangle is"+"="+ perimet);
       System.out.println("the color of the circle is"+"="+ colore);
}




    }

