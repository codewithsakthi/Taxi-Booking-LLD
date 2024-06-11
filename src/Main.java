import java.util.*;

public class Main {
    static  boolean program = true;
    public static void main(String[] args) {
        int id = 1;
        Scanner scanner = new Scanner(System.in);
        while(program){
            System.out.println("Enter 1 for Booking\nEnter 2 For Print Taxi Details\nEnter 3 For Exit");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    System.out.println("Enter PickUp Point (A,B,C,D,E,F)");
                    char pickPoint = scanner.next().charAt(0);
                    System.out.println("Enter Drop Point :");
                    char dropPoint = scanner.next().charAt(0);
                    System.out.println("Enter PickUp Time :");
                    int pickTime = scanner.nextInt();
                    if (pickPoint > 'F' || dropPoint < 'A' || pickPoint < 'A' || dropPoint > 'F') {
                        System.out.println("Invalid Pickup Or Drop Point...! Program exiting..");
                        return;
                    }
                    Booking.checkTaxi(pickPoint,dropPoint,pickTime,id);
                    id++;
                    break;
                case 2:
                    Booking.printTaxiDeatils();
                    break;
                case 3:
                    return;

                default:
                    System.out.println("Enter valid option :");
            }
        }
    }


}