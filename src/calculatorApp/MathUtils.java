package calculatorApp;

public class MathUtils {
	float sum(float a, float b) {
		return a+b;
	}
	float substract(float a, float b) {
		return a-b;
	}
	float divide(float a, float b) {
		return a/b;
	}
	float multiply(float a, float b) {
		return a*b;
	}
	float modulus(float a, float b) {
		return a%b;
	}
	float power(float a, float b) {
		float t=1;
		for(int i=0;i<b;i++) {
			t=t*a;
		}
		return t;
	}
	
}
