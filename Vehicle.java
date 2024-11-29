public class Vehicle {
    private final String manufacturer;
    private final String modelName;
    private final int modelYear;
    private String licensePlate;

    // Primary constructor
    public Vehicle(String manufacturer, String modelName, int modelYear, String licensePlate) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.licensePlate = licensePlate;
    }

    // Constructor with manufacturer and modelName only
    public Vehicle(String manufacturer, String modelName) {
        this(manufacturer, modelName, -1, "");
    }

    // Constructor with manufacturer, modelName, and modelYear
    public Vehicle(String manufacturer, String modelName, int modelYear) {
        this(manufacturer, modelName, modelYear, "");
    }

    // Constructor with manufacturer, modelName, and licensePlate
    public Vehicle(String manufacturer, String modelName, String licensePlate) {
        this(manufacturer, modelName, -1, licensePlate);
    }

    // Getter for manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    // Getter for modelName
    public String getModelName() {
        return modelName;
    }

    // Getter for modelYear
    public int getModelYear() {
        return modelYear;
    }

    // Getter and setter for licensePlate
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer +
               ", Model: " + modelName +
               ", Year: " + modelYear +
               ", License Plate: " + licensePlate;
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla");
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2020);
        Vehicle vehicle3 = new Vehicle("Ford", "Mustang", "ABC123");
        Vehicle vehicle4 = new Vehicle("Chevrolet", "Camaro", 2021, "XYZ789");

        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle3);
        System.out.println(vehicle4);
    }
}
