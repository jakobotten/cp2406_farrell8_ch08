public class Salesperson {

    private int IDNum;
    private double salesAmount;

    Salesperson (int IDNum, double salesAmount){
        this.IDNum = IDNum;
        this.salesAmount = salesAmount;
    }

    public int getIDNum(){
        return this.IDNum;
    }

    public double getSalesAmount(){
        return this.salesAmount;
    }

    public void setIDNum(int IDNum){
        this.IDNum = IDNum;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
}
