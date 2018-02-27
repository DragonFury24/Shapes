public class RightTriangle extends Shape {
    private double baseLength;
    private double height;

    public RightTriangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    double getArea() {
        return (baseLength * height) / 2;
    }

    double getPerimeter() {
        return baseLength + height + Math.sqrt(Math.pow(baseLength, 2) + Math.pow(height, 2));
    }
}
