package shapes;

public class Rectangle extends Quadrilateral{
  public Rectangle (double length, double width) {
    super(length, width);
  }
  public void setLength(double length){
    this.length = length;
  }
  public void setWidth(double width){
    this.width = width;
  }
}
