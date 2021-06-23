package ss15_exception_handling_debug.bai_tap.illegaltriangleexception;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size 1 of triangle:");
        int side1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter size 2 of triangle:");
        int side2 = Integer.parseInt(input.nextLine());
        System.out.println("Enter size 3 of triangle:");
        int side3 = Integer.parseInt(input.nextLine());

        try {
            SuDungLopIllegalTriangleException.RightTriangle r = new SuDungLopIllegalTriangleException.RightTriangle(side1, side2, side3);
            System.out.println();
        } catch (SuDungLopIllegalTriangleException.IllegalRightTriangleException e) {
            System.err.println(e.getString());
        }

    }
}


