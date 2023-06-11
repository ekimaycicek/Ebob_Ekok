import java.util.Scanner;

public class EbobEkokUygulama {

    static void ebob(){

        int ebob = 0;
        Scanner input =new Scanner(System.in);
        System.out.println("1.sayiyi girin: ");
        int sayi1 = input.nextInt();
        System.out.println("2.sayiyi girin: ");
        int sayi2 = input.nextInt();

        for (int i = 1; i < sayi1; i++) {

            if (sayi1 % i ==0 && sayi2 % i ==0){
                ebob = i;
            }
        }
        System.out.println("ebob = " + ebob);
    }

    static void ekok(){

        int ekok = 0;
        int max;
        Scanner input = new Scanner(System.in);
        System.out.println("1.sayiyi girin: ");
        int sayi1 = input.nextInt();
        System.out.println("2.sayiyi girin: ");
        int sayi2 = input.nextInt();
        max = sayi1*sayi2;
        for (int i = max; i >0 ; i--) {

            if (i%sayi1 == 0 && i%sayi2==0){
                ekok = i;
            }
        }
        System.out.println("ekok = " + ekok);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*****Hoşgeldiniz*****");
        System.out.println("Bir işlem seçiniz ==> \n" + "1- Ebob\n" + "2- Ekok");
        System.out.println("\t==>");
        int secim = input.nextInt();

        if (secim < 1 || secim>2 ){

        }else{
            switch (secim){
                case 1:

                    System.out.println("Ebob İslemini Sectiniz.");
                    ebob();
                    break;
                case 2:
                    System.out.println("Ekok İslemini Sectiniz.");
                    ekok();
                    break;
            }
        }

    }
}
