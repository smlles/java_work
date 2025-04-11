package ex06_annotation;

import java.lang.annotation.Annotation;

@TestInfo(name="홍길동",skills= {"java","Spring"})
public class Ex02_annotation {

	public static void main(String[] args) {
		Annotation[] annotations = Ex02_annotation.class.getAnnotations();
		
		for(Annotation anno : annotations) {
			System.out.println(anno);
		}
		
		TestInfo testInfo = Ex02_annotation.class.getAnnotation(TestInfo.class);
		System.out.println(testInfo.name());
	}

}
