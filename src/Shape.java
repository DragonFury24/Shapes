public abstract class Shape {
    abstract double getArea();

    abstract double getPerimeter();

    public String toString() {
        return (getClass().getName() + ",\t Area: " + getArea() + ",\t Perimeter: " + getPerimeter());
    }
}
