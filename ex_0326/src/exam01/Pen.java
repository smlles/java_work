package exam01;

public class Pen {
	
	class pen {
		 private int amount; //남은 량
		 
		 public pen(int amount) {
			
		 }
	}
class SharpPencil{ //샤프펜
    private int width; //펜의 굵기
    //private int amount; //남은 량
    //public int getAmount(){return amount;}
    //public void setAmount(int amount){this.amount = amount;}
}

class Ballpen{ //볼펜
   // private int amount; //남은 량
    private String color; //볼펜의 색
   // public int getAmount(){return amount;}
    //public void setAmount(int amount){this.amount = amount;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
}

class FountainPen{
    private int amount; //만년필
    private String color; //볼펜의 색
    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    public void refill(int n){setAmount(n);}
}
}
