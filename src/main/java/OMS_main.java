import org.example.Order;

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

        Order firstCustomer = new Order("00","Kevin","Laptop",1, 200,200 );
        Order secondCustomer = new Order("01","Aleysha","Phone",3, 3000,3000 );
        Order thirdCustomer = new Order("02","Steve","GamingLaptop",1, 890,890 );



        if(option == 4){

            System.out.println("Exited from program. ");
        }



        sc.close();
    }

}
