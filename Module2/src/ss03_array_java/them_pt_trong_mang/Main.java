package ss03_array_java.them_pt_trong_mang;

//import java.util.Arrays;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner input  = new Scanner(System.in);
          System.out.println("Nhập vào số phần tử của mảng: "); // hiển thì cho người dùng nhập
          int n = Integer.parseInt(input.nextLine());  // n là số phần tử được nhập vào
          int k = n+1;
          int[] array = new int[n];  // khai báo độ dài của mảng

           for(int i = 0 ; i < n ; i++){
                System.out.println("Nhập Vào Phần Tử Thứ : "+i+" Của Mảng !");
                array[k] = Integer.parseInt(input.nextLine());

           }
          System.out.print("Mảng Có Cách Phần Tử Là :");
          for(int i = 0 ; i < n ; i++){
               System.out.print(array[i]);
          }

     }
}
