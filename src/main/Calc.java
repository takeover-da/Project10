package main;

// 계산기 인터페이스
public interface Calc {

	int ERROR = -999; //계산하다가 에러나면 사용할 에러코드
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
}