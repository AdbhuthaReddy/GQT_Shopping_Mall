import java.util.Scanner;

class Automobile {
    void automobile() {
        System.out.println("Welcome to the world of Automobiles");
        System.out.println("Currently available automobiles are:");
        System.out.println("1.volvo XC90" + '\n' + "2.Lamborghini Urus" + '\n' + "3.Dodge Demon" + '\n' + "4.Ford Endeavour" + '\n' + "5.Mahindra Thar");
        System.out.print("Choose the Option that you wanna buy: ");
        Product p = new Product();
        Payment pay = new Payment();
        Scanner sc = new Scanner(System.in);
        int choice2 = sc.nextInt();

        if (choice2 == 1) {
            p.ProductName = "Volvo XC90";
            p.Colour="Black";
            p.TopSpeed="200KM/h";
            p.Transmission="Automatic";
            p.Type="Estate";
            p.Price = 15000000;
            System.out.println(p.ProductName+'\n'+p.Colour+'\n'+p.TopSpeed+'\n'+p.Transmission+'\n'+p.Type+'\n'+p.Price);

            pay.payment();
        }

        if (choice2 == 2) {
            p.ProductName = "Lamborghini Urus";
            p.Colour="White";
            p.TopSpeed="300KM/h";
            p.Transmission="Automatic";
            p.Type="SUV";
            p.Price = 35000000;
            System.out.println(p.ProductName+'\n'+p.Colour+'\n'+p.TopSpeed+'\n'+p.Transmission+'\n'+p.Type+'\n'+p.Price);

            pay.payment();
        }

        if (choice2 == 3) {
            p.ProductName = "Dodge Demon";
            p.Colour="Black";
            p.TopSpeed="250KM/h";
            p.Transmission="Automatic";
            p.Type="Muscle Car";
            p.Price = 10000000;
            System.out.println(p.ProductName+'\n'+p.Colour+'\n'+p.TopSpeed+'\n'+p.Transmission+'\n'+p.Type+'\n'+p.Price);

            pay.payment();
        }

        if (choice2 == 4) {
            p.ProductName = "Ford Endeavour";
            p.Colour="Black";
            p.TopSpeed="200KM/h";
            p.Transmission="Automatic";
            p.Type="SUV";
            p.Price = 5000000;
            System.out.println(p.ProductName+'\n'+p.Colour+'\n'+p.TopSpeed+'\n'+p.Transmission+'\n'+p.Type+'\n'+p.Price);

            pay.payment();
        }

        if (choice2 == 5) {
            p.ProductName = "Mahindra Thar";
            p.Colour="Black";
            p.TopSpeed="180KM/h";
            p.Transmission="Automatic";
            p.Type="Off Roader";
            p.Price = 1500000;
            System.out.println(p.ProductName+'\n'+p.Colour+'\n'+p.TopSpeed+'\n'+p.Transmission+'\n'+p.Type+'\n'+p.Price);

            pay.payment();
        }
    }
}