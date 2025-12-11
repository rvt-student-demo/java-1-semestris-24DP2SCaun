package rvt;

public class nesting_boxes {

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
        
        public boolean nests( Box outsideBox )
        {
            boolean widthFits = this.width() < outsideBox.width(); 
            boolean heightFits = this.height() < outsideBox.height(); 
            boolean lengthFits = this.length() < outsideBox.length(); 
            
            return widthFits && heightFits && lengthFits;
        }
    } 
    public static void main(String[] args) {
        
        Box innerBox = new Box( 2.0, 4.0, 5.0 ); 
        Box outsideBox = new Box( 3.0, 5.0, 6.0 ); 
        Box tooSmallBox = new Box( 1.0, 5.0, 6.0 ); 

        System.out.println( "Iekšējā kaste der ārējā kastē " + innerBox.nests( outsideBox ) ); 
        System.out.println( "Iekšējā kaste der mazajā kastē " + innerBox.nests( tooSmallBox ) ); 
    }
}