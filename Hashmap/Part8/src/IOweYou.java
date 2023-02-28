import java.util.HashMap;

public class IOweYou {
    public static void main(String[] args) {
//        IOU mattsIOU = new IOU();
//        mattsIOU.setSum("Arthur", 51.5);
//        mattsIOU.setSum("Michael", 30);
//
//        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
//        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }
}

class IOU{
    private HashMap<String,Double> owes;
    public IOU(){
        this.owes = new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        this.owes.put(toWhom,amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        double amount = owes.getOrDefault(toWhom,0.0);
        return amount;
    }
}


