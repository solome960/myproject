public class circle extends shape {
    double pi=3.14;
    private double radius;
    public circle(double radius ,String color){
    this.radius=radius;
    this.color=color;
}
public double getRadius(){
    return radius;
}

    public double calculateArea(){
        double area=2*pi*getRadius()*getRadius();
        return area;
    }
    public double calculateperimeter(){
        double perimeter=2*pi*getRadius();
        return perimeter;
    }
    public void display(){
        System.out.println("color of circle"+getColor());
        super.display();
    }
}