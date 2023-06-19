public class Truck extends Vehicle {
    private int seats;
    private double trunkSpace;

    public Truck() {
    }

    public Truck(String color, int numberOfDoors, boolean gasPowered) {
        super(color, numberOfDoors, gasPowered);
    }

    public Truck(String color, int numberOfDoors, boolean gasPowered, int seats, double trunkSpace) {
        super(color, numberOfDoors, gasPowered);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    public Truck(Vehicle vehicle, int seats) {
        super(vehicle.getColor(), vehicle.getNumberOfDoors(), vehicle.isGasPowered());
        this.seats = seats;
    }

    public Truck(Vehicle vehicle, double trunkSpace) {
        super(vehicle.getColor(), vehicle.getNumberOfDoors(), vehicle.isGasPowered());
        this.trunkSpace = trunkSpace;
    }

    public Truck(Vehicle vehicle, int seats, double trunkSpace) {
        super(vehicle.getColor(), vehicle.getNumberOfDoors(), vehicle.isGasPowered());
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getTrunkSpace() {
        return trunkSpace;
    }

    public void setTrunkSpace(double trunkSpace) {
        this.trunkSpace = trunkSpace;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", numberOfDoors=" + getNumberOfDoors() +
                ", gasPowered=" + isGasPowered() +
                ", seats=" + seats +
                ", trunkSpace=" + trunkSpace +
                '}';
    }

    @Override
    public boolean isEcoFriendly() {
        return super.isEcoFriendly() && seats <= 2 && trunkSpace == 0.0;
    }
}