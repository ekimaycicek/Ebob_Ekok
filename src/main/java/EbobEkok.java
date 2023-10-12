import java.util.Scanner;

public class EbobEkok {

    static void ebob(){

        int ebob = 0;
        Scanner input =new Scanner(System.in);
        System.out.println("1.enter the number: ");

        int number = input.nextInt();
        System.out.println("2.enter the number: ");
        int number2 = input.nextInt();


        for (int i = 1; i < number; i++) {
            if (number % i ==0 && number2 % i ==0){

                ebob = i;
            }
        }
        System.out.println("ebob = " + ebob);
    }

    static void ekok(){
        int ekok = 0;

        int max;

        Scanner input = new Scanner(System.in);
        System.out.println("1.enter the number: ");
        int number = input.nextInt();
        System.out.println("2.enter the number: ");
        int number2 = input.nextInt();
        max = number*number2;

        for (int i = max; i >0 ; i--) {
            if (i%number == 0 && i%number2==0){
                ekok = i;
            }





        }
        System.out.println("ekok = " + ekok);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("*****Welcome*****");
        System.out.println("Select an action ==> \n" + "1- Ebob\n" + "2- Ekok");
        System.out.println("\t==>");
        int vote = input.nextInt();

        if (vote < 1 || vote>2 ){

        }else{
            switch (vote){

                case 1:
                    System.out.println("Ebob Choose Your Transaction.");
                    ebob();
                    break;

                case 2:
                    System.out.println("Ekok Choose Your Transaction.");
                    ekok();
                    break;
            }
        }

    }
}
