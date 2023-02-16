package ie.atu.productv6;

public class TV extends Product {

    private String manufacturer;
    private String screen_size;

    public TV() {
        super();
        manufacturer = "";
        screen_size = "";
        count++;
    }

    public String getManufacturer() {return manufacturer;}

    public void setManufacturer(String manufacturer) {this.manufacturer = manufacturer;}

    public String getScreen_size() {return screen_size;}

    public void setScreen_size(String screen_size) {this.screen_size = screen_size;}

    @Override

    public String toString() {
        return super.toString() + " manufacturer " + manufacturer + "size" + screen_size + "inches";
    }

}
