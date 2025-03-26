package ex04_overloading;

public class ConverterMain {

	public static void main(String[] args) {
		Converter c = new Converter();
		
		System.out.println("cm->m "+ c.convert(5));
		System.out.println("m->cm "+ c.convert(5,"m"));
		System.out.println("inch->cm "+ c.convert(5,"inch"));
	}

}
