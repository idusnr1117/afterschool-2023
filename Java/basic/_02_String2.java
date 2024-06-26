package chap_03;

public class _02_String2 {
	public static void main(String[] args) {
		String s = "I like Java and Python and C.";
		
		// 문자열 변환
		System.out.println(s.replace("and", ",")); // and를 ,로 변환
		System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작(이전 내용은 삭제)
		System.out.println(s.substring(7, 11)); //인덱스 기준 7부터 11미만의 문자열을 출력
		System.out.println(s.substring(s.indexOf("Java"))); //
		System.out.println(s.substring(7,22)); // Java and Python을 출력
		System.out.println(s.substring(s.indexOf("Java"), s.indexOf(" and C"))); // Java and Python을 출력
		// ㄴ 위에 내용 중요하니 참조


		// 공백제거 - true
		s = "                  I love Java.";
		System.out.println(s);
		System.out.println(s.trim()); // 앞 뒤 공백제거, 단어 사이에 공백은 제거하지 않음
		
		//문자열 결합 - + 기호 사용, concat()
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 + ", "+ s2);
		System.out.println(s1.concat(", ").concat(s2));
	}
}
