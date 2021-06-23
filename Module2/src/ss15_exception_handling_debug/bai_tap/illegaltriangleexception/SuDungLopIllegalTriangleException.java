package ss15_exception_handling_debug.bai_tap.illegaltriangleexception;

public class SuDungLopIllegalTriangleException {
    static class RightTriangle {
        public RightTriangle(int side1, int side2, int side3) throws IllegalRightTriangleException {
            boolean checkSide1 = side1 < 0 || side1 >= side2 + side3;
            boolean checkSide2 = side2 < 0 || side2 >= side1 + side3;
            boolean checkSide3 = side3 < 0 || side3 >= side1 + side2;
            if (checkSide1 || checkSide2 || checkSide3)
                throw new IllegalRightTriangleException("Not a triangle");
            else {

                System.out.println("A triangle with 3 side: " +
                        " side 1 = " + side1 +
                        ", side 2 = " + side2 +
                        ", side 3 = " + side3 +
                        " is a right triangle ");

            }
        }
    }

    static class IllegalRightTriangleException extends Exception {
        String errorMessage;

        public IllegalRightTriangleException(String inErrorMessage) {
            errorMessage = inErrorMessage;
        }

        public String getString() {
            return "One of the three sides is a negative number or the sum of two sides is less than the other side!! ";
        }
    }

}
