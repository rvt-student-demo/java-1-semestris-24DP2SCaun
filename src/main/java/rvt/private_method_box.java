package rvt;

public class private_method_box {
    
    public static void main(String[] args) {
        Box box = new  Box( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );

     Box cube = new Box( 3.0 );
     System.out.println( "\nKuba (3.0 x 3.0 x 3.0) tilpums: " + cube.volume() );
     
    }

    public static class Box
    {
        private final double width;
        private final double height;
        private final double length;

        public Box( double width, double height, double length )
        {
            this.width = width;
            this.height = height;
            this.length = length;
        }

        public Box( double side )
        {
            this( side, side, side );
        }

        public double volume()
        {
            return width * height * length;
        }

        public double area()
        {
            return 2 * topArea() + 2 * faceArea() + 2 * sideArea();
        }

        private double faceArea()
        {
        return length * height;
        }

        private double topArea()
        {
        return length * width;
        }

        private double sideArea()
        {
        return width * height;
        }
    }
    
}