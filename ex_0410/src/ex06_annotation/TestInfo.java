package ex06_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//선언 키워드는 @interface
//타겟지정
@Target(ElementType.TYPE)
//시간지정
@Retention(RetentionPolicy.RUNTIME)
public @interface TestInfo {
	//어노테이션의 속성은 메스더 형태로 정의한다.
	
	
	//어노테이션 속성의 반환형은 제한적
	//기본 , String , Class , Enum, 다른 어노테이션
	
	//예외 던지기 불가능
	//String value() throw Exception;
	
	//속성은 매개변수를 가지지 않는다.
	String name(String input);
	
	//속성에 기본값을 지정 할 수 있다.
	String value() default "홍길동";//추상메서드로 선언해야함
}
