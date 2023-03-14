public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity){
        this.capacity = capacity;
        this.balance = 0;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double howMuchSpaceLeft(){
        return capacity - balance;
    }

    public void addToWarehouse(double amount){
        if(amount < 0){
            System.out.println("No change");
            return;
        }
        if(amount <= howMuchSpaceLeft()){
            this.balance += amount;
        }else{
            this.balance = this.capacity;
        }
    }

    public double takeFromWarehouse(double amount){
        if(amount < 0){
            return 0;
        }
        if(amount > this.balance){
            double returnValue = this.balance;
            this.balance = 0;
            return returnValue;
        }
        this.balance -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return "balance = "+this.balance+", space left "+this.howMuchSpaceLeft();
    }
}
