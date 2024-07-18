package main;

public class Ex2 {

	public static void main(String[] args) {

		// 인터페이스로 형변환..
		// 부모타입 변수 선언 = 자식 타입 객체 생성
		Calc calc = new Calculator();
	
		calc.add(2, 3);
		
		// 형변환된 변수로는 자식클래스에서 추가한 속성을 사용할 수 없음!
		
	}

}
