package exam01;

public class FountainPen extends Ballpen{
	
	//private int amount; //만년필
    private String color; //볼펜의 색
    
    public FountainPen(int amount,String color){
		super(amount,color);
		 this.color = color;
	}
    public void refill(int n){
    	setAmount(n);
    }
	
	
}
