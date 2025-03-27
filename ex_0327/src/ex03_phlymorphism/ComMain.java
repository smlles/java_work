package ex03_phlymorphism;

public class ComMain {

	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		System.out.println(cr.com1);
		//Computer com1 = new Samsung();
		cr.com1= new Samsung();
		//Computer com2 = new LZ();
		//cr.com2= new LZ();
		cr.com2=new Apple();
		cr.allPowerOn();
		cr.allPowerOff();
		
		
	}

}
