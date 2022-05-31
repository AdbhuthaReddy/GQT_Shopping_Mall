import java.util.Scanner;

public class MyClass {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("welcome to GQT Shopping mall");
        System.out.println("Available product categories are :");
        System.out.println("1.Automobile Accessories    2.Electronic Gadgets    3.Clothing    4.Household items");
        System.out.print("Enter your choice: ");

        int Choice1 = sc.nextInt();

        if (Choice1 == 1) {
            Automobile a = new Automobile();
            a.automobile();
        }
        if (Choice1 == 2) {
            ElectronicGadgets e = new ElectronicGadgets();
            e.electronicgadgets();
        }
        if (Choice1 == 3) {
            Clothing c = new Clothing();
            c.clothing();
        }
        if (Choice1 == 4) {
            HouseholdItems h = new HouseholdItems();
            h.householditems();
        }
    }
}


class Product{
        String ProductName ;
        String Colour ;
        String TopSpeed ;
        String Transmission;
        String Type;
        String processor;
        String Material;
        String Capacity;
        int Price;
}
class Payment {
    void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Pay & Press Enter to pay");
        String empty = sc.next();
            if (empty.equalsIgnoreCase("pay")) {
                System.out.println("Item Purchased");
            }
    }
}



