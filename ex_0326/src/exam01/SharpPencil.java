package exam01;

public class SharpPencil extends Pen{
	private int width;
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public SharpPencil(int amount, int width){
		super(amount);
		 this.width = width;
		 
	}
}
