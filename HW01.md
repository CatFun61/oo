
```csharp
abstract class CShape
{
  protected String color;
  public void setColor(String str)
  {
    color=str;
  }
  public abstract void show();
}

class CTriangle extends CShape
{
  private double a,b,c;
  public CTriangle(double a,double b,double c)
  {
    this.a=a;
    this.b=b;
    this.c=c;
  }
  public void show()
  {
    System.out.print("color="+color+", ");
    System.out.println("area="+0.5*a*b);
  }
}
public class Main
{
  public static void main(String args[])
  {
    CTriangle tri=new CTriangle(3,4,5);
    tri.setColor("Red");
    tri.show();
  }
}
``` 
