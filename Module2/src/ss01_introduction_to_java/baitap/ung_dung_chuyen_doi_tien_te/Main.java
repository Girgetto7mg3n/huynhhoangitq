package ss01_introduction_to_java.baitap.ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        boolean check;
        check = Boolean.TRUE;

        while(check){
           Scanner sc = new Scanner(System.in);
           System.out.println("Nhập số 1 để chuyển từ vnd sang usd \n Nhập Số 2 để chuyển từ usd sang vnd: ");
           int number = sc.nextInt();

           float VND;
           float USD;
           switch (number) {
               case 1:
                   System.out.println("hãy nhập gía tiền bạn muốn quy đổi : ");
                   Scanner vnd = new Scanner(System.in);
                   VND = vnd.nextFloat();
                   USD = VND / 23;
                   System.out.println("Số Tiền Đô La MỸ: " + USD);
                   check = false;
                   break;
               case 2:
                   System.out.println("hãy nhập gíá tiền bạn muốn quy đổi : ");
                   Scanner usd = new Scanner(System.in);
                   USD = usd.nextFloat();
                   VND = USD * 23;
                   System.out.println("Số Tiền Việt Nam Đồng:  " + VND);
                    check = false ;
                   break;
               default:
                   break;
           }
       }
    }
}
