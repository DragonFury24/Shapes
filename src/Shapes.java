import java.util.Arrays;

public class Shapes {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[(int) (Math.random() * 31 + 20)];

        for (int i = 0; i < shapes.length; i++) {
            switch ((int) (Math.random() * 3)) {
                case 0: //Circle
                    shapes[i] = new Circle(Math.random() * 90 + 10);
                    break;
                case 1: //Rectangle
                    shapes[i] = new Rectangle(Math.random() * 90 + 10, Math.random() * 90 + 10);
                    break;
                case 2: //Square
                    shapes[i] = new Square(Math.random() * 90 + 10);
                    break;
                case 3: //RightTriangle
                    shapes[i] = new RightTriangle(Math.random() * 90 + 10, Math.random() * 90 + 10);
                    break;
                default:
                    break;
            }
        }

        Arrays.stream(shapes)
              .forEach(System.out::println);
    }
}
