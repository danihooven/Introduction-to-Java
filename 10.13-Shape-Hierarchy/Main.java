// 10.13 (Project: Shape Hierarchy) Implement the Shape hierarchy shown in Fig. 9.3. Each TwoDimensionalShape should contain method getArea to calculate the area of the two-dimensional shape. Each ThreeDimensionalShape should have methods getArea and getVolume to calculate the surface area and volume, respectively, of the three-dimensional shape. Create a program that uses an array of Shape references to objects of each concrete class in the hierarchy. The program should print a text description of the object to which each array element refers. Also, in the loop that processes all the shapes in the array, determine whether each shape is a TwoDimensionalShape or a ThreeDimensionalShape. If it’s a TwoDimensionalShape, display its area. If it’s a ThreeDimensionalShape, display its area and volume.

class Main {
  public static void main(String[] args) {

    Circle cir = new Circle(5);
    Square sqr = new Square(5);
    Triangle tri = new Triangle(5, 5);
    Sphere sphr = new Sphere(5);
    Cube cube = new Cube(5);
    Tetrahedron tetra = new Tetrahedron(5);
    Shape[] shapes = {cir, sqr, tri, sphr, cube, tetra};

    for(Shape x:shapes){
      System.out.print(x.getClass().getName() + ": ");
      if(x instanceof TwoDimensional){
        TwoDimensional twodimensional = (TwoDimensional)x;
        System.out.println("area = " + twodimensional.getArea());
      }        
      else if(x instanceof ThreeDimensional){
        ThreeDimensional threedimensional = (ThreeDimensional)x;
        System.out.println(
          "surface area = " + threedimensional.getArea() + 
          ", volume is " + threedimensional.getVolume());
      }
    }
  }
}

// ******** SHAPE **********
abstract class Shape{
  public abstract double getArea();
}

// ******** 2 DIMENSIONAL **********
abstract class TwoDimensional extends Shape{

}

// ******** CIRCLE **********
class Circle extends TwoDimensional{
  double radius;
  public Circle (double radius){
    this.radius = radius;
  }
  @Override
  public double getArea(){
    return Math.PI * Math.pow(radius, 2);
  }
}

// ******** SQUARE **********
class Square extends TwoDimensional{
  double side;
  public Square (double side){
    this.side = side;
  }
  @Override
  public double getArea(){
    return Math.pow(side, 2);
  }
}

// ******** TRIANGLE **********
class Triangle extends TwoDimensional{
  double base;
  double height;
  public Triangle (double base, double height){
    this.base = base;
    this.height = height;
  }
  @Override
  public double getArea(){
    return (base*height)/(double)2;
  }
}

// ******** 3 DIMENSIONAL **********
abstract class ThreeDimensional extends Shape{
  public abstract double getVolume();
}

// ******** SPHERE **********
class Sphere extends ThreeDimensional{
  double radius;
  public Sphere(double radius){
    this.radius = radius;
  }
  @Override
  public double getArea(){
    return (4*Math.PI)*(Math.pow(radius,2));
  }
  public double getVolume(){
    return (4/(double)3)*Math.PI*(Math.pow(radius, 3));
  }
}

// ******** CUBE **********
class Cube extends ThreeDimensional{
  double edge;
  public Cube(double edge){
    this.edge = edge;
  }
  @Override
  public double getArea(){
    return 6*(Math.pow(edge, 2));
  }
  @Override
  public double getVolume(){
    return Math.pow(edge, 3);
  }
}

// ******** TETRAHEDRON **********
class Tetrahedron extends ThreeDimensional{
  double edge;
  public Tetrahedron(double edge){
    this.edge = edge;
  }
  @Override
  public double getArea(){
    return (Math.sqrt(3))*(Math.pow(edge, 2));
  }
  @Override
  public double getVolume(){
    return (Math.pow(edge, 3))/(double)(6*(Math.sqrt(2)));
  }
}
