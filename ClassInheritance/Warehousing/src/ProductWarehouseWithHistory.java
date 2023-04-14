public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory changeHistory = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory.add(initialBalance);
    }

    public String history(){
        return this.changeHistory.toString();
    }

    public void addToWarehouse(double amount){
//        double balance = super.getBalance();
//        if(amount < 0){
//            System.out.println("No change");
//            return;
//        }
//        if(amount <= howMuchSpaceLeft()){
//             balance =  balance + amount;
//        }else{
//            balance = super.getCapacity();
//        }
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount){
//        double balance = super.getBalance();
//        if(amount < 0){
//            return 0;
//        }
//        if(amount > balance){
//            double returnValue = balance;
//            balance = 0;
//            this.changeHistory.add(balance);
//            return returnValue;
//        }
//        balance = balance - amount;
//        this.changeHistory.add(balance);
//        super.takeFromWarehouse(amount);
//        return amount;
        super.takeFromWarehouse(amount);
        this.changeHistory.add(super.getBalance());
        return amount;
    }

    public void printAnalysis(){
        System.out.println("Product:"+this.getName());
        System.out.println("History:"+this.history());
        System.out.println("Largest amount of products:"+this.changeHistory.maxValue());
        System.out.println("Smallest amount of products:"+this.changeHistory.minValue());
        System.out.println("Average:"+this.changeHistory.average());
    }
}
