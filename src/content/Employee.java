package content;

public class Employee {
    private int hours = 40;
    private double rate = 20;
    private double pay = 800;
    
    public void setHours(int hours){
        this.hours = hours;
    }
    public void setRate(double rate){
        this.rate = rate;
    }
    public double getPay(){
        calculatePay();
        return this.pay;
    }
    
    private void calculatePay(){
        this.pay = this.hours * this.rate;
    }
}
