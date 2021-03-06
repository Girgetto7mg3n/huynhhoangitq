package ss07_abstract_class_and_interface.bai_tap.implement_resizeable_interface_for_geometry_classes_assignment.main;

import ss07_abstract_class_and_interface.bai_tap.implement_resizeable_interface_for_geometry_classes_assignment.Shape.Circle;
import ss07_abstract_class_and_interface.bai_tap.implement_resizeable_interface_for_geometry_classes_assignment.Shape.Shape;
import ss07_abstract_class_and_interface.bai_tap.implement_resizeable_interface_for_geometry_classes_assignment.Shape.Square;
import ss07_abstract_class_and_interface.bai_tap.implement_resizeable_interface_for_geometry_classes_assignment.service.RectangleService;

import java.util.Scanner;

public class TestResizeable {
    public static Shape getRandomShape () {
        int random = (int) (Math.round(Math.random()*3));
        switch (random) {
            case 0:
                return new Circle(2.2);
            case 1:
                return new RectangleService(4.6,3.8);
            default:
                return new Square(3.5);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn tạo ra bao nhiêu hình: ");
        int size = Integer.parseInt(scanner.nextLine());
        Shape[] shapes = new Shape[size];
        for (int i = 0; i < size; i++) {
            shapes[i] = getRandomShape();
        }
        System.out.println("Trước khi thay đổi kích thước: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                System.out.println("Diện tích trước khi thay đổi kích thước là: " + ((Circle) shape).getArea());
            }
            if (shape instanceof RectangleService) {
                System.out.println("Diện tích trước khi thay đổi kích thước là: " + ((RectangleService) shape).getArea());
            }
        }

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(Math.random()*100);
            }
            if (shape instanceof RectangleService) {
                ((RectangleService) shape).resize(Math.random() * 100);
            }
            if (shape instanceof Square) {
                ((Square) shape).resize(Math.random() * 100);
            }
        }

        System.out.println();

        System.out.println("Sau khi thay đổi kích thước: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                System.out.println("Diện tích sau khi thay đổi kích thước là: " + ((Circle) shape).getArea());
            }
            if (shape instanceof RectangleService) {
                System.out.println("Diện tích sau khi thay đổi kích thước là: " + ((RectangleService) shape).getArea());
            }
        }
    }
}