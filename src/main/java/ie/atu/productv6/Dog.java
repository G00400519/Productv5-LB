package ie.atu.productv6;

public class Dog extends Product{

    private String vaccination;
    private String shedding;
    private String neutered;

    public Dog() {
        super();
        vaccination = "";
        shedding = "";
        neutered = "";
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public String getShedding() {
        return shedding;
    }

    public void setShedding(String shedding) {
        this.shedding = shedding;
    }

    public String getNeutered() {
        return neutered;
    }

    public void setNeutered(String neutered) {
        this.neutered = neutered;
    }
}
