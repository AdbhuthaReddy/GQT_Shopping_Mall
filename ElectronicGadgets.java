import java.util.Scanner;

class ElectronicGadgets {
    void electronicgadgets() {
        System.out.println("Welcome to the world of Electronic Gadgets");
        System.out.println("Currently available electronic gadgets are:");
        System.out.println("1.MacBook Pro" + '\n' + "2.iPhone 13 Pro" + '\n' + "3.iPad Pro" + '\n' + "4.Apple Watch 7");
        System.out.print("Choose the Option that you wanna buy: ");
        Product p = new Product();
        Payment pay = new Payment();
        Scanner sc = new Scanner(System.in);
        int choice2 = sc.nextInt();

        if (choice2 == 1) {
            p.ProductName = "MacBook Pro";
            p.Colour="Silver";
            p.processor="M1 Max";
            p.Price = 200000;
            System.out.println(p.ProductName+'\n'+p.Colour+'\n'+p.processor+'\n'+p.Price);

            pay.payment();
        }

        if (choice2 == 2) {
            p.ProductName = "iPhone 13 Pro";
            p.Colour="Black";
            p.processor="A15 Bionic";
            p.Price = 100000;
            System.out.println(p.ProductName+'\n'+p.Colour+'\n'+p.processor+'\n'+p.Price);
            pay.payment();
        }

        if (choice2 == 3) {
            p.ProductName = "iPad Pro";
            p.Colour="Silver";
            p.processor="M1";
            p.Price = 80000;
            System.out.println(p.ProductName+'\n'+p.Colour+'\n'+p.processor+'\n'+p.Price);
            pay.payment();
        }

        if (choice2 == 4) {
            p.ProductName = "Apple Watch 7";
            p.Colour="Black";
            p.processor="S7";
            p.Price = 45000;
            System.out.println(p.ProductName+'\n'+p.Colour+'\n'+p.processor+'\n'+p.Price);
            pay.payment();
        }
    }
}
