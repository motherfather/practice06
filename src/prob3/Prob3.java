package prob3;

public class Prob3 {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발 될 수 있습니다.";

		/* 코드를 작성합니다 */
		int num = str.indexOf("자바");
		if(num > -1) {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			String str2 = str.replaceAll("자바", "Java");
			System.out.println("->" + str2);
		} else {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
			System.out.println("->" + str);
		}
		
		
	}
}
