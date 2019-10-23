public class Motorcycle {
    private int id;
    private String vin;
    private String make;
    private String model;
    private String year;
    private String color;
    private int weight;
    private int cc;
    private int topSpeed;

    public Motorcycle(int id, String vin, String make, String model, String year, String color, int weight, int cc, int topSpeed) {
        this.id = id;
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.weight = weight;
        this.cc = cc;
        this.topSpeed = topSpeed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() { return weight; }

    public void setWeight(int weight) { this.weight = weight; }

    public int getCc() { return cc; }

    public void setCc(int weight) { this.cc = cc; }

    public int getTopSpeed() { return topSpeed; }

    public void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }
}
