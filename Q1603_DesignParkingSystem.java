public class Q1603_DesignParkingSystem {

    public int big = 0, medium = 0, small = 0;

    // Input: Integers big, medium, small, representing number of these types of slots.
//    public ParkingSystem(int big, int medium, int small) {
//        this.big = big;
//        this.medium = medium;
//        this.small = small;
//    }

    // Input: Integer carType, representing the type of car, big, medium, small, based on the value
    // Output: Whether there will be enough room to park carType car.
    public boolean addCar(int carType) {
        if (carType == 1) {
            big--;
            return big >= 0;
        }
        if (carType == 2) {
            medium--;
            return medium >= 0;
        }
        if (carType == 3) {
            small--;
            return small >= 0;
        }
        return false;
    }

}
