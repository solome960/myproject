public class rectangle extends shape{
    private double length;
    private double width;

    public rectangle(double length,double width,String colo){
    super(colo);
    this.length=length;
    this.width=width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double calculateArea(){
    double area=getLength()*getWidth();
    return area;
    }

    public double calculatePerimeter(){
    double perimeter=2*getLength()*getWidth();
    return perimeter;
    }
  
    public void displayColor(){
        System.out.println("the color is"+getColor());
    }
    
}
