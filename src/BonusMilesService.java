public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int milesPerRub = 20;
        int miles = ticketPrice / milesPerRub;
        return miles;
    }
}
