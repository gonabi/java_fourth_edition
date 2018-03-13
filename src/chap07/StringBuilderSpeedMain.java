/*
 * 
 *StringBuffer과 StringBuilder의 속도
 */
package chap07;

public class StringBuilderSpeedMain {

	public static void main(String[] args) {
		long startTime = 0L;
		long endTime = 0L;
		
		//1. 동기화가 지원되는 StringBuffer의 속도측정
		StringBuffer sb = new StringBuffer();
		startTime = System.currentTimeMillis();
		for(int i=0; i<500000; i++) {
			sb.append("H");//문자추가
		}
		endTime=System.currentTimeMillis()-startTime;
		System.out.println("StringBuffer 문자열만들기:"+ endTime);
		
		
		//2. 동기화가 지원되지 않는 StringBuilder의 속도측정
		StringBuilder sbr = new StringBuilder();
		startTime = System.currentTimeMillis();
		for(int i=0; i<500000; i++) {
			sbr.append("H");//문자추가
		}
		endTime=System.currentTimeMillis()-startTime;
		System.out.println("StringBuilder 문자열만들기:"+ endTime);
		
	}// end main()

}

/*
StringBuffer 문자열만들기:18
StringBuilder 문자열만들기:9
*/
