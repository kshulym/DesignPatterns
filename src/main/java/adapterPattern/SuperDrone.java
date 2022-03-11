package adapterPattern;

public class SuperDrone implements Drone {
    @Override
    public void beep() {
        System.out.println("Beep Beep Beep");
    }

    @Override
    public void spin_rotors() {
        System.out.println("Spin Spin Spin");
    }

    @Override
    public void take_off() {
        System.out.println("Taking off");
    }
}
