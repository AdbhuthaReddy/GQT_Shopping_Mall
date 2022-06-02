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
        int choice = sc.nextInt();

        if (choice == 1) {
            p.ProductName += "Jumper";
            p.Brand += "Zara";
            p.Type += "Slim Fit";
            p.Colour +="Pink";
            p.Material +="cotton";
            p.Price += "2799";
            System.out.println(p.ProductName+'\n'+p.Brand+'\n'+p.Type+'\n'+p.Colour+'\n'+p.Material+'\n'+p.Price);

            pay.payment();
        }

        if (choice == 2) {
            p.ProductName += "Jeans";
            p.Brand += "Soul Of Nomad";
            p.Type += "Slim Fit";
            p.Colour +="blue";
            p.Material +="cotton";
            p.Price += "35000";
            System.out.println(p.ProductName+'\n'+p.Brand+'\n'+p.Type+'\n'+p.Colour+'\n'+p.Material+'\n'+p.Price);
            pay.payment();
        }

        if (choice == 3) {
            p.ProductName += "Shirt";
            p.Brand += "Brook Brothers";
            p.Type += "Slim Fit";
            p.Colour +="White";
            p.Material +="Silk";
            p.Price += "15000";
            System.out.println(p.ProductName+'\n'+p.Brand+'\n'+p.Type+'\n'+p.Colour+'\n'+p.Material+'\n'+p.Price);
            pay.payment();
        }

        if (choice == 4) {
            p.ProductName += "Trouser";
            p.Brand += "Ermenegildo zegna";
            p.Type += "Flat Front";
            p.Colour +="Grey";
            p.Material +="cotton blend";
            p.Price += "75000";
            System.out.println(p.ProductName+'\n'+p.Brand+'\n'+p.Type+'\n'+p.Colour+'\n'+p.Material+'\n'+p.Price);

            pay.payment();
        }
    }
}
