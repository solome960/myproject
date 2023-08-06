public class triangle extends shape {
    private double base;
    private double height;
    private double hypotenuse;
    
    public triangle(double base ,double height,double hypotenuse,String colore ){
        super(colore);
        this.base=base;
        this.height=height;
        this.hypotenuse=hypotenuse;
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    public double getHypotenuse(){
        return hypotenuse;
    }
   
    public double calculateArea(){
        double area=0.5*getBase()*getHeight();
        return area;
    }
    public double calculateperimeter(){
        double perimeter=getBase()+getHeight()+getHypotenuse();
        return perimeter;
    }
    public void displayColor(){
        System.out.println("the color is"+color);
    }
    }

