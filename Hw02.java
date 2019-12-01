interface shape{

abstract double getArea();

}

class Rectangle implements shape{

  double length, width;
  public Rectangle(double l,double w){
    length=l;
    width=w;
  }

  public double getArea(){
    return(length*width);
  }
  public String toString(){
    return "Area: "+getArea();
  }
  
}

class Triangle implements shape{

  double base, height;

  public Triangle(double b,double h){
    base=b;
    height=h;
  }

  public double getArea(){

    return(base*height/2);

  }
  public String toString(){
    return "Area: "+getArea();
  }

}

public class Main{
  public static void main(String args[]){

    Rectangle Rec= new Rectangle(5,10);
    Triangle Tri= new Triangle(3,4);
    System.out.println(Rec);
    System.out.println(Tri);
  }

}
