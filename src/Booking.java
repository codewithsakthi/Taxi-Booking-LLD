import java.util.*;

public class Booking {
    static int noOfTaxi = 4;

    static List<Taxi> taxiList = createTaxi(noOfTaxi);

    public static List<Taxi> createTaxi(int noOfTaxi) {
        List<Taxi> taxiList = new ArrayList<>();
        for (int i = 0; i < noOfTaxi; i++) {
            Taxi t = new Taxi();
            taxiList.add(t);
        }
        return taxiList;
    }
    public static void checkTaxi(char pickPoint, char dropPoint, int pickTime,int customerId) {
        List<Taxi> freeTaxi = new ArrayList<>();
        for(Taxi t :taxiList){
            if(t.freeTime <= pickTime && (Math.abs((t.currLocation-'0')-(pickPoint-'0'))) <= pickTime-t.freeTime )
                freeTaxi.add(t);
        }
        if(freeTaxi.size()==0){
            System.out.println("No Free Taxi Available...");
            Main.program = false;
        }
        Collections.sort(freeTaxi,(a,b)->a.totalEarnings - b.totalEarnings);
        bookTaxi(customerId,pickPoint,dropPoint,pickTime,freeTaxi);
    }

    public  static void bookTaxi(int customerId,char pickPoint,char dropPoint,int pickTime,List<Taxi> freeTaxi){
        int min = Integer.MAX_VALUE;
        int earning = 0;
        int nextfreeTime = 0;
        Taxi bookedTaxi = null;
        String tripDetail = "";
        for(Taxi t : freeTaxi){
            int distanceT2C = Math.abs((t.currLocation-'0')-(pickPoint-'0'))*15;
            if(distanceT2C < min) {
                bookedTaxi = t;
                int distanceP2D = Math.abs((dropPoint - '0') - (pickPoint - '0')) * 15;
                earning = (distanceP2D-5) * 10 + 100;
                int dropTime  = pickTime + distanceP2D/15;
                nextfreeTime = dropTime;
                tripDetail = customerId + "               " + customerId + "          " + pickPoint +  "      " + dropPoint + "       " + pickTime + "          " +dropTime + "           " + earning;
                min = distanceT2C;
            }
        }
        if (bookedTaxi != null) {
            bookedTaxi.setDetails(customerId, true, dropPoint, nextfreeTime, bookedTaxi.totalEarnings + earning, tripDetail);
            System.out.println("Ticket Booked Successfully... Ticket id " + bookedTaxi.id);
        }
    }

    public static void printTaxiDeatils() {
    for(Taxi t :taxiList)
        t.printTaxiDetails();
    System.out.println();
    for (Taxi t:taxiList)
        t.printDetails();
    }

}