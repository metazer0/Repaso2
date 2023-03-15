import java.util.ArrayList;

public class ChangeHistory {

    ArrayList<Double> history;
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }

    public void add(double status){
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    public double maxValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        double max = this.history.get(0);
        for (Double x : this.history) {
            if(x > max){
                max = x;
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
}
