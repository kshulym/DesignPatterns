package adapterPattern;

public class MainForAdapter {
    public static void main(String[] args) {
        Drone drone = new SuperDrone();
        DroneAdapter droneAdapter = new DroneAdapter(drone);
        droneAdapter.quack();
        droneAdapter.fly();
    }
}
