package Car;

//Den samme process for nedarving som lavet i Car.AFuelCar gentages her
public class ElectricCar extends ACar {
private int batteryCapacityKWh;
private int maxRangeKm;

private int WhPrkm;

public ElectricCar(String registrationNumber,String make,String model,int numberOfDoors, int batteryCapacityKWh,int maxRangeKm,int WhPrkm){
    super(registrationNumber,make,model,numberOfDoors);
    this.batteryCapacityKWh=batteryCapacityKWh;
    this.maxRangeKm=maxRangeKm;
    this.WhPrkm=WhPrkm;
}
  public int getBatteryCapacityKWh(){
      return batteryCapacityKWh;

  }
  public int getMaxRangeKm(){
      return maxRangeKm;

  }
  public int getWhPrKm(){
    return WhPrkm;

  }
    public int getRegistrationFee(){

    double kmPrLitre = (100 / (WhPrkm / 91.25));

        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            return 330;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            return 1050;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            return 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            return 5500;
        } else{
            return 10470;
        }

    }
    @Override
     public String toString(){
        return super.toString() + ", Battery capacity (kWh): " + batteryCapacityKWh + ", Max range in km: " + maxRangeKm + ", (Wh/km): " + WhPrkm;

    }
}
