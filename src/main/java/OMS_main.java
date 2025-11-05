import java.util.Scanner;

public class OMS_main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select an option: ");

        System.out.println("1.) Add Order");
        System.out.println("2.) Update Order");
        System.out.println("3.) List Order");
        System.out.println("4.) Exit");
        int option = sc.nextInt();

        if(option == 4){

            System.out.println("Exited from program. ");
        }



        sc.close();
    }

}
