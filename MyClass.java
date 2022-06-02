import java.util.Scanner;

public class MyClass {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Choice c = new Choice();
        System.out.println("welcome to GQT Shopping mall");
        c.choice();

        while (true) {
            System.out.print("Continue Shopping?  y/n: ");
            String sh = sc.next();

            if (sh.equalsIgnoreCase("y")) {
                c.choice();
            } else if (sh.equalsIgnoreCase("n")) {
                System.out.println("Thank you for shopping at GQT");
                break;
            } else {
                System.out.println("Choose the right option.");
            }
        }
    }
}

class Choice {
    void choice() {
        System.out.println("Available product categories are :");
        System.out.println("1.Automobile Accessories    2.Electronic Gadgets    3.Clothing    4.Household items");
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);

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
        String ProductName = "Product Name: ";
        String Colour = "Colour: ";
        String TopSpeed = "Top Speed: ";
        String Transmission = "Transmission: ";
        String Type = "Type: ";
        String processor = "Processor: ";
        String Material = "Material: ";
        String Capacity = "Capacity: ";
        String Price = "₹";
        String Brand = "Brand: ";
}
class Payment {
    void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Pay & Press Enter to pay");
        String empty = sc.next();
            if (empty.equalsIgnoreCase("pay")) {
                System.out.println("Item Purchased");
            }
            else{
                System.out.println("Payment cancelled !!!");
            }

    }
}



