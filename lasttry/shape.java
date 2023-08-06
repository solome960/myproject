/**
 * shape
 */
public class shape {
protected String color;

public shape(String color){
this.color=color;
}
public void display(){
    System.out.println("there is a shape");
}
public String getColor(){
    return color;
}
public shape(){
    color="black";
}
public void setColor(String color){
    this.color=color;
}
}