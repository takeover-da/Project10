package main;

public class Quiz1 {

	public static void main(String[] args) {

		Calc calc = new Calculator();
		
		// calc 변수가 가리키는 객체의 타입이 Calculator 라면...
		if (calc instanceof Calculator) {
			
			// Calculator형으로 다운 캐스팅한다!
			Calculator calculator = (Calculator) calc;
			calculator.showInfo();
		}

	}

}
