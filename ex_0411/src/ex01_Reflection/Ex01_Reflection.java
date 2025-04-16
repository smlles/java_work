package ex01_Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Ex01_Reflection {

	public static void main(String[] args) {
		// User 클래스에 대한 정보가 clazz에 담김
		// 필드 목록, 메서드 목록 등
		Class<?> clazz = User.class;
		Field[] fields = clazz.getDeclaredFields();

		System.out.println("필드의 개수 : " + fields.length);
		// 필드 목록 출력
		// getName() : 필드 이름 출력
		// getType() : 필드 타입 출력
		for (Field f : fields) {
			System.out.println("- " + f.getType() + " " + f.getName());
		}
		// 메서드 목록 가져오기
		Method[] methods = clazz.getDeclaredMethods();
		for (Method m : methods) {
			String name = m.getName();
			Class<?> returnType = m.getReturnType();
			Parameter[] parameters = m.getParameters();

			System.out.print("- " + returnType.getSimpleName() + " " + name + "(");

			for (Parameter parameter : parameters) {
				System.out.print(parameter.getName());
				System.out.print(",");
			}
			System.out.println(")");
		}
	}

}
