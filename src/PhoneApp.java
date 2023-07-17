import java.util.Scanner;
import java.util.InputMismatchException;

public class PhoneApp {
    public static class ShowPhone {
        SmartPhone[] phones;
        Scanner input = new Scanner(System.in);
        public ShowPhone() {
            phones = new SmartPhone[5];
            phones[0] = new SmartPhone(1, "Iphone 11", 25000, "0000", "128GB", "4GB", "12 MP");
            phones[1] = new SmartPhone(2, "Iphone 12", 345000, "1111", "64GB", "4GB", "12 MP");
            phones[2] = new SmartPhone(3, "Iphone 13", 37400, "2222", "64GB", "4GB", "12 MP");
            phones[3] = new SmartPhone(4, "Iphone 14", 47000, "3333", "256GB", "6GB", "12 MP");
            phones[4] = new SmartPhone(5, "Samsung Galaxy A54", 14650, "4444", "256GB", "8GB", "50 MP");
        }

        public int calculateTotalPrice() {
            int totalPrice = 0;
            for (SmartPhone phone : phones) {
                totalPrice += phone.getPrice();
            }
            return totalPrice;
        }

        private void printPhone() {
            System.out.println("____________________________________________________\n"
                    + "\tWhich phone you want to be? \n"
                    + "\t1-Iphone 11 \n"
                    + "\t2-Iphone 12 \n"
                    + "\t3-Iphone 13 \n"
                    + "\t4-Iphone 14 \n"
                    + "\t5-Samsung Galaxy A54\n"
                    + "\t6-Total Price \n"
                    + "____________________________________________________");
        }

        public void selectUserPhone(){

            printPhone();

            while(true){

                System.out.print("Enter the phone name ( Exp: 1/2/3/4/5/6 ) : ");

                try {
                    int inputUser = input.nextInt();


                    if (inputUser == 6) {
                        int totalPrice = calculateTotalPrice();
                        System.out.println("Total price: " + totalPrice + " TL");
                        break;
                    }
                    if (inputUser >= 1 && inputUser <= 5) {
                        SmartPhone selectedPhone = phones[inputUser - 1];
                        System.out.println("Phone Name: " + selectedPhone.getName());
                        System.out.println("Phone Storage: " + selectedPhone.getStorage());
                        System.out.println("Phone RAM: " + selectedPhone.getRam());
                        System.out.println("Phone Camera: " + selectedPhone.getCamera());
                        System.out.println("Phone Price: " + selectedPhone.getPrice());
                    } else {
                        System.out.println("Invalid input! Please enter a valid phone number.");
                    }

                    System.out.print("Do you want to select another phone? (y/n): ");
                    String choice = input.next();
                    if (choice.equalsIgnoreCase("y")) {
                        printPhone();
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter an integer.");
                    break;
                }
            }

        }

    }
}
