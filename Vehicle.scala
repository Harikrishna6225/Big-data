class Vehicle(val manufacturer: String, 
              val modelName: String, 
              val modelYear: Int = -1, 
              var licensePlate: String = "") {

  // Constructor with manufacturer and modelName only
  def this(manufacturer: String, modelName: String) = {
    this(manufacturer, modelName, -1, "")
  }

  // Constructor with manufacturer, modelName, and modelYear
  def this(manufacturer: String, modelName: String, modelYear: Int) = {
    this(manufacturer, modelName, modelYear, "")
  }

  // Constructor with manufacturer, modelName, and licensePlate
  def this(manufacturer: String, modelName: String, licensePlate: String) = {
    this(manufacturer, modelName, -1, licensePlate)
  }

  override def toString: String = {
    s"Manufacturer: $manufacturer, Model: $modelName, Year: $modelYear, License Plate: $licensePlate"
  }
}

// Example usage
object VehicleTest extends App {
  val vehicle1 = new Vehicle("Toyota", "Corolla")
  val vehicle2 = new Vehicle("Honda", "Civic", 2020)
  val vehicle3 = new Vehicle("Ford", "Mustang", "ABC123")
  val vehicle4 = new Vehicle("Chevrolet", "Camaro", 2021, "XYZ789")

  println(vehicle1)
  println(vehicle2)
  println(vehicle3)
  println(vehicle4)
}
