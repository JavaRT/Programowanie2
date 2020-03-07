package Robot;

public class Robot {
    private int poziomBaterii;
    private String nazwaRobota;
    private boolean wlaczony = false;


    public Robot(String nazwaRobota) {
        this.nazwaRobota = nazwaRobota;
    }

    public void poruszRobotem(RuchRobota ruch) {
        if (!wlaczony) {
            System.out.println("robot wlaczony");
            return;

        }
        if (poziomBaterii >= ruch.getZuzycieBaterii()) {
            System.out.println("wykonuje ruch" + ruch);
            poziomBaterii -= ruch.getZuzycieBaterii();
        } else {
            System.out.println("malo energii");
        }
    }

    public void naladuj() {
        if (wlaczony) {
            System.out.println("niemozna ladowac");
        } else {
            poziomBaterii = 100;
            System.out.println("robot naladowany");

        }
    }

    public void wlacz() {
        if (wlaczony) {
            System.err.println("Robot jest juz wlaczony");
        } else {
            wlaczony = true;
            System.out.println("Wlaczam robota");
        }
    }

    public void wylacz() {
        if (!wlaczony) {
            System.err.println("Robot jest juz wylaczony");
        } else {
            wlaczony = false;
            System.out.println("Wylaczam robota");
        }
    }
}