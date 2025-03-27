package exam01;

public class Ballpen extends Pen{
	private String color;
	public Ballpen(int amount,String color){
		super(amount);
		 this.color = color;
	}
	public void setColor(String color){
		 this.color = color;
		 }
	 public String getColor(){
		 return color;
		 }
	 
}