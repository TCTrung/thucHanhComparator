package src;


import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[3];
        rectangle[0] = new Rectangle(2,52);
        rectangle[1] = new Rectangle(13,4);
        rectangle[2] = new Rectangle(5,6);

        System.out.println("Pre-sorted:");
        for (Rectangle rectangles : rectangle) {
            System.out.println(rectangles);
        }

        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangle, rectangleComparator);

        System.out.println("After-sorted:");
        for (Rectangle rectangles : rectangle) {
            System.out.println(rectangles);
        }

    }
}
