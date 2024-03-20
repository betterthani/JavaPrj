package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)// runtime까지 유지 해줘
@Target(ElementType.METHOD)// 메서드 위에 달게 해줄거야
public @interface MyAnnotation {
	// 어노테이션이 가져야할 속성 default가 없다면 어노테이션 지정시 속성 지정해줘야함 String은 리턴타입이 아니라 속성의 타입
	String value() default ""; // 어노테이션 요소
}
