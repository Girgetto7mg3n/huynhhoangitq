package ss01_introduction_to_java.baitap.hien_thi_loi_chao;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("nhập Tên Của bạn: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello : " + name);
    }
}
