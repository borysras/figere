class Triangle implements Figure {

    private final double sideB;
    private final double angleAB;
    private final double sideA;

    Triangle(double sideA, double sideB, double angleAB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleAB = angleAB;
    }



    public double getArea() {
        return this.sideA * this.sideB * Math.sin(this.angleAB * Math.PI / 180) /2;
    }

    public double getPerimeter() {
        double sideC = Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2) - 2
                * this.sideA * this.sideB * Math.cos(this.angleAB * Math.PI / 180));
        return this.sideA + this.sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideB=" + sideB +
                ", angleAB=" + angleAB +
                ", sideA=" + sideA +
                '}';
    }
}
