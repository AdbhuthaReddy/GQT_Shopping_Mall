import java.util.Scanner;

public class HouseholdItems {
    void householditems() {

        System.out.println("Welcome to the world of Household Items");
        System.out.println("Currently available household items are:");
        System.out.println("1.Air Conditioner" + '\n' + "2.Refrigerator" + '\n' + "3.Washing Machine" + '\n' + "4.Geyser");
        System.out.print("Choose the Option that you wanna buy: ");
        Product p = new Product();
        Payment pay = new Payment();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            p.ProductName = "Air Conditioner";
            p.Colour = "White";
            p.Capacity = "2 Ton";
            p.Type = "Split";
            p.Price = 50000;
            System.out.println(p.ProductName + '\n' + p.Colour + '\n' + p.Capacity + '\n' + p.Type + '\n' + p.Price);

            pay.payment();
        }

        if (choice == 2) {
            p.ProductName = "Refrigerator";
            p.Colour = "Grey";
            p.Capacity = "415 litres";
            p.Type = "Double Door";
            p.Price = 60000;
            System.out.println(p.ProductName + '\n' + p.Colour + '\n' + p.Capacity + '\n' + p.Type + '\n' + p.Price);

            pay.payment();
        }

        if (choice == 3) {
            p.ProductName = "Washing Machine";
            p.Colour = "Black";
            p.Capacity = "10 KG";
            p.Type = "Front Load";
            p.Price = 40000;
            System.out.println(p.ProductName + '\n' + p.Colour + '\n' + p.Capacity + '\n' + p.Type + '\n' + p.Price);

            pay.payment();
        }

        if (choice == 4) {
            p.ProductName = "Geyser";
            p.Colour = "White";
            p.Capacity = "25 litres";
            p.Type = "Electric";
            p.Price = 15000;
            System.out.println(p.ProductName + '\n' + p.Colour + '\n' + p.Capacity + '\n' + p.Type + '\n' + p.Price);

            pay.payment();
        }
    }
}
