package section03;

/*
 * 4. 논리 연산자
 *  && : And 조건, 교집합 개념, 두 항 모두 true 일 때 true
 *  || : Or 조건, 합집합 개념, 두 항중 하나 이상 true 일 때 true
 *  !  : Not 조건, 여집합 개념, 논리(boolean) 값 반전 시킨다.
 * 
 * 
 */
public class Operator04 {
	public static void main(String[] args) {
		boolean result = true && false;

		System.out.println("result: " + result);
		System.out.println("result: " + !result); // 결과 반전 시켜줌

		int age = 28;
		String gender = "Male";
		if (age >= 19 && gender == "Male") {
			System.out.println("성인 남성입니다.");
		} else {
			System.out.println("성인 남성이 아닙니다.");
		}

		boolean result3 = true || false; // 앞에 이미 true이면 뒤에 상관없이 true이므로 false에 노란줄 그렁져 있음
		System.out.println("result3: " + result3);

		String brand = "LG전자";
		if (brand == "LG전자" || brand == "LG생활건강" || brand == "LGU+") {
			System.out.println("LG우승세일 29% 할인 행사 중입니다.");
		} else {
			System.out.println("할인 미적용 브랜드 입니다.");
		}
		boolean result4 = true && true && true || false;
		// boolean result4 = ((true && true) && true) || false; 이런식으로 연산하면 된다.
		System.out.println("result4: "+result4);
		

	}
}
