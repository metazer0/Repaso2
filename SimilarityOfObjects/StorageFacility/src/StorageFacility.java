import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String,ArrayList<String>> storage;

    public StorageFacility(){
        this.storage = new HashMap<>();
    }
    public void add(String unit, String item){
        this.storage.putIfAbsent(unit,new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        if(this.storage.get(storageUnit).isEmpty() || !(this.storage.containsKey(storageUnit))){
            return new ArrayList<>();
        }else{
            ArrayList<String> items = this.storage.get(storageUnit);
            return items;
        }
    }

    public void remove (String storageUnit, String item){

       this.storage.get(storageUnit).remove(item);

       if(this.storage.get(storageUnit).isEmpty()){
           this.storage.remove(storageUnit);
       }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for (String s : this.storage.keySet()) {
            units.add(s);
        }
        return units;
    }
}
