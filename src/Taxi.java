import java.util.*;
public class Taxi {
    static int taxiCount;
    int id;
    boolean booked;
    char currLocation;
    int freeTime;
    int totalEarnings;
    List<String> trips;
    public Taxi(){
        taxiCount++;
        this.id = taxiCount;
        currLocation = 'A';
        freeTime = 6;
        totalEarnings = 0;
        trips = new ArrayList<>();
        booked = false;
    }
    public void printDetails()
    {
        System.out.println("TaxiID    BookingID    CustomerID    From    To    PickupTime    DropTime    Amount");
        for(String trip : trips)
        {
            System.out.println(id + "          " + trip);
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();
    }

    public void printTaxiDetails()
    {
        System.out.println("Taxi - "+ this.id + " Total Earnings - " + this.totalEarnings + " Current spot - " + this.currLocation +" Free Time - " + this.freeTime);
    }

    public void setDetails(int taxiId,boolean booked,char currLocation,int freeTime,int totalEarnings,String trips){
        this.id = taxiId;
        this.booked = booked;
        this.currLocation = currLocation;
        this.freeTime = freeTime;
        this.totalEarnings = totalEarnings;
        this.trips.add(trips);
    }
}
