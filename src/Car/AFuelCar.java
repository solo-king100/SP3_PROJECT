package Car;

import Car.ACar;

//
//Car.AFuelCar nedarver fra Car.ACar ved at bruge extends.
public abstract class AFuelCar extends ACar {
    private int kmPrLitre;

    //Ved at skrive super, kan der kaldes konstruktoren for Car.ACar abstrakt klassen.
    public AFuelCar(String registrationNumber,String make,String model,int numberOfDoors,int kmPrLitre) {
        super(registrationNumber,make,model,numberOfDoors);
        this.kmPrLitre=kmPrLitre;
    }
    public abstract String getFuelType();

    public int getKmPrLitre() {
        return kmPrLitre;
    }
@Override
    public String toString(){
    return super.toString()+ ", KmPrLitre: "+getKmPrLitre();

}
}
