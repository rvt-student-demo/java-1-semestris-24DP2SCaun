package rvt;

public class box_constructor_and_access_methods {
    
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
        public Box(Box oldBox) {

            this.width = oldBox.width;
            this.height = oldBox.height;
            this.length = oldBox.length;
        }
        
        public double length()
        {
            return length;
        }
        
        public double height()
        {
            return height;
        }
        
        public double width()
        {
            return width;
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

    
    public static void main(String[] args) {

        Box box = new Box( 2.5, 5.0, 6.0 ) ;

        System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );

        Box cube = new Box( 3.0 );
        System.out.println( "\nKuba (3.0 x 3.0 x 3.0) tilpums: " + cube.volume() );

        Box copiedBox = new Box( box );
        System.out.println( "\nKopētā kaste: Platums = " + copiedBox.width() + ", Garums = " + copiedBox.length() );
    }
}