import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("sayıyı giriniz");
        int a= klavye.nextInt();
        boolean kontrol=true;
        while(true){
            if(a!=0){
            for (int i = 0; i < a; i++) {
                
                System.out.print("*");
                System.out.print(" ");
        }
                System.out.println();


            a--;
            }else{
                kontrol=false;
            }


        }

    }
}
