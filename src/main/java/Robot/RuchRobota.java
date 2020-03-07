package Robot;

public enum RuchRobota {

    KROK_LEWA(7),
    KROK_PRAWA(7),
    RUCH_REKA_LEWA(15),
    RUCH_REKA_PRAWA(15),
    SKOK(20);

    private double zuzycieBaterii;

    RuchRobota(double zuzycieBaterii) {
        this.zuzycieBaterii = zuzycieBaterii;
    }
    public double getZuzycieBaterii() {
        return zuzycieBaterii;
    }
}
