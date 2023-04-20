package Car;

public class DieselCar extends AFuelCar {
    boolean particleFilter;

    public DieselCar(String registrationNumber,String make,String model,int numberOfDoors,int kmPrLitre,boolean particleFilter){
        super(registrationNumber,make,model,numberOfDoors,kmPrLitre);
        this.particleFilter=particleFilter;
    }
    public boolean hasParticleFilter(){
        return true;
    }

    public String getFuelType() {
        return "Diesel";
    }

    public int getRegistrationFee() {
        int pU=0;

        if(hasParticleFilter()==false){
            pU=1000;
        }
        int kmPrLitre=getKmPrLitre();
        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            return 330 + 130 +pU;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            return 1050 + 1390+pU;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            return 2340 + 1850+pU;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            return 5500;
        } else{
            return 10470 + 15260+pU;
        }


    }

    @Override
    public String toString(){
        return super.toString() + ", Fuel Type: " + getFuelType() + ", Kilometers per Liter: " + getKmPrLitre() + ", Has particle filtre: " + hasParticleFilter();

    }
}
