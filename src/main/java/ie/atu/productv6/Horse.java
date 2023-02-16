package ie.atu.productv6;

public class Horse extends Product{
    private String dam;
    private String sire;
    private String height;

    public Horse() {
        super();
        dam = "";
        sire = "";
        height = "";
    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
