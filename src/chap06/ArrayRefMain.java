/*
배열의 참조값 할당을 테스트하는 예
*/
package chap06;

public class ArrayRefMain {

	public static void main(String[] args) {
		int[] aref = new int[] {0,1,2,3};
		int[] bref = aref;
		int[] cref = bref;
		
		
		//참조값 출력
		System.out.println("aref="+ aref);
		System.out.println("bref="+ bref);
		System.out.println("cref="+ cref);
		
		
				
		aref[0] = 10;//aref[0]에 10을 할당한 후 aref, bref, cref 출력하기
		for( int i=0; i<aref.length; i++ ){
			System.out.println("aref["+i+"]=" + aref[i]+ "\t");
			System.out.println("bref["+i+"]=" + bref[i]+ "\t");
			System.out.println("cref["+i+"]=" + cref[i]);			
		}
		
		
		aref[1] = 11;//aref[1]에 11을 할당한 후 aref, bref, cref 출력하기
		for( int i=0; i<aref.length; i++ ){
			System.out.println("aref["+i+"]=" + aref[i]+ "\t");
			System.out.println("bref["+i+"]=" + bref[i]+ "\t");
			System.out.println("cref["+i+"]=" + cref[i]);			
		}		
		
		
		aref[2] = 12;//aref[2]에 12을 할당한 후 aref, bref, cref 출력하기
		for( int i=0; i<aref.length; i++ ){
			System.out.println("aref["+i+"]=" + aref[i]+ "\t");
			System.out.println("bref["+i+"]=" + bref[i]+ "\t");
			System.out.println("cref["+i+"]=" + cref[i]);			
		}			
				
	}

}
/*
 aref=[I@266474c2
bref=[I@266474c2
cref=[I@266474c2
aref[0]=10	
bref[0]=10	
cref[0]=10
aref[1]=1	
bref[1]=1	
cref[1]=1
aref[2]=2	
bref[2]=2	
cref[2]=2
aref[3]=3	
bref[3]=3	
cref[3]=3
aref[0]=10	
bref[0]=10	
cref[0]=10
aref[1]=11	
bref[1]=11	
cref[1]=11
aref[2]=2	
bref[2]=2	
cref[2]=2
aref[3]=3	
bref[3]=3	
cref[3]=3
aref[0]=10	
bref[0]=10	
cref[0]=10
aref[1]=11	
bref[1]=11	
cref[1]=11
aref[2]=12	
bref[2]=12	
cref[2]=12
aref[3]=3	
bref[3]=3	
cref[3]=3
 
 */
