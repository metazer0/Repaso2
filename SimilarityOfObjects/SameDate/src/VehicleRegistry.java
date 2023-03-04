import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));

        // if the hasCode-method hasn't been overwritten, the owners won't be found
    }
}

class LicensePlate {

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object object){

        if(this == object){
            return true;
        }

        if(!(object instanceof LicensePlate)){
            return false;
        }

        LicensePlate comparedLicense = (LicensePlate) object;

        if(comparedLicense.liNumber == this.liNumber && comparedLicense.country == this.country){
            return true;
        }

        return false;
    }

    public int hashCode(){
        int hash = 5;
        hash *= 17 + this.country.hashCode();
        hash *= 17 + this.liNumber.hashCode();
        return hash;
    }
}

class VehicleRegister{

    HashMap<LicensePlate,String> carRegister;
    public VehicleRegister(){
        this.carRegister = new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner){

        for(LicensePlate l : carRegister.keySet()){
            if(l != licensePlate){
                carRegister.put(licensePlate,owner);
                return true;
            }
        }
        return false;
    }
    public String get(LicensePlate licensePlate){
        return carRegister.getOrDefault(licensePlate,null);
    }

    public boolean remove(LicensePlate licensePlate){
       String value = carRegister.remove(licensePlate);

       if(value != null){
           return true;
       }else{
           return false;
       }
    }

    public void printLicensePlates(){
        for(LicensePlate l:carRegister.keySet()){
            System.out.println(l);
        }
    }

    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for(String owner: carRegister.values()){
            if(!(owners.contains(owner))){
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }
}