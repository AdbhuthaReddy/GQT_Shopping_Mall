import java.util.Scanner;

public class Clothing {
    void clothing() {
        System.out.println("Welcome to the world of Apparel");
        System.out.println("Currently available clothes are:");
        System.out.println("1.Jumpers" + '\n' + "2.Jeans" + '\n' + "3.Shirts" + '\n' + "4.Trousers");
        System.out.print("Choose the Option that you wanna buy: ");
        Product p = new Product();
        Payment pay = new Payment();
        Scanner sc = new Scanner(System.in);
        int choice2 = sc.nextInt();

        if (choice2 == 1) {
            p.ProductName = "Jumpers";
            p.Colour="Pink";
            p.Material ="cotton";
            p.Price = 500;
            System.out.println(p.ProductName+'\n'+p.Colour+'\n'+p.Material+'\n'+p.Price);

            pay.payment();
        }

        if (choice2 == 2) {
            p.ProductName = "Jeans";
            p.Colour="blue";
            p.Material ="cotton";
            p.Price = 900;
            System.out.println(p.ProductName+'\n'+p.Colour+'\n'+p.Material+'\n'+p.Price);

            pay.payment();
        }

        if (choice2 == 3) {
            p.ProductName = "Shirts";
            p.Colour="White";
            p.Material ="Silk";
            p.Price = 1000;
            System.out.println(p.ProductName+'\n'+p.Colour+'\n'+p.Material+'\n'+p.Price);

            pay.payment();
        }

        if (choice2 == 4) {
            p.ProductName = "Trousers";
            p.Colour="Grey";
            p.Material ="cotton blend";
            p.Price = 750;
            System.out.println(p.ProductName+'\n'+p.Colour+'\n'+p.Material+'\n'+p.Price);

            pay.payment();
        }
    }
}
