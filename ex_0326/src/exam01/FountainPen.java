package exam01;

public class FountainPen extends Pen{
	
	//private int amount; //만년필
    private String color; //볼펜의 색
    //public int getAmount(){return amount;}
    //public void setAmount(int amount){this.amount = amount;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    public void refill(int n){setAmount(n);}
	
	
}
