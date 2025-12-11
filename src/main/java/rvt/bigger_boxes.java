package rvt;

public class bigger_boxes {
    
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

        public Box( Box oldBox ) 
        {
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
        
        public static Box biggerBox( Box oldBox )
        {
            return new Box(
                1.25 * oldBox.width(), 
                1.25 * oldBox.height(), 
                1.25 * oldBox.length() 
            );
        }

        public static Box smallerBox( Box oldBox )
        {
            return new Box(
                0.75 * oldBox.width(), 
                0.75 * oldBox.height(), 
                0.75 * oldBox.length() 
            );
        }
    }
    
    public static void main(String[] args) {
        
        Box originalBox = new Box( 2.5, 5.0, 6.0 ) ;

        System.out.println( "width " + originalBox.width() + " height " + originalBox.height() + " length " + originalBox.length() );
        
        Box bigBox = Box.biggerBox( originalBox );
        System.out.println( "width " + bigBox.width() + ", volume " + bigBox.volume() );

        Box smallBox = Box.smallerBox( originalBox );
        
        System.out.println( "width " + smallBox.width() + ", volume " + smallBox.volume() );
    }
}