public class Square implements Figure {

    private final double side;


    Square(double side) {
    this.side = side;
}


    public double getArea() {
        return this.side * side;
    }


    public double getPerimeter() {
        return this.side * 4 ;
    }
}

