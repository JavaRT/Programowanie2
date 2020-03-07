package Robot;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Robot robot = new Robot("AAA");
        Scanner scanner = new Scanner(System.in);
        String komenda;
        do {
            System.out.println("podaj komende");
            System.out.println("ruch KROK_LEWA, KROK_PRAWA, RUCH_REKA_LEWA, RUCH_REKA_PRAWA, SKOK");
            System.out.println("naladuj");
            System.out.println("wlacz");
            System.out.println("wylacz");
            komenda = scanner.nextLine();
            if (komenda.equalsIgnoreCase("wlacz")) {
                robot.wlacz();
            } else if (komenda.equalsIgnoreCase("wylacz")) {
                robot.wylacz();
            } else if (komenda.equalsIgnoreCase("naladuj")) {
                robot.naladuj();
            }else if (komenda.startsWith("ruch")){
                String [] slowa = komenda.split(" ");
                String rodzajRuchu = slowa[1];
                RuchRobota ruch = RuchRobota.valueOf(rodzajRuchu.toUpperCase());
                robot.poruszRobotem(ruch);
                }
            }while (!komenda.equalsIgnoreCase("quit")) ;
    }
}
