/**
배열의 생성과 벼열의 접근을 테스트하는 예제	
**/

public class ArrayMain{
	
	
	public static void main(String[] args){
		int[] ap = new int[]{0,1,2,3,4,5,6,7,8,9}; //초기화 방법 1
		int[] aw = {0,1,2,3,4,5,6,7,8,9}; //초기화 방법 1
		int[] ad = new int[10];//선언과 할당의 분리
		ad[0] = 20;	
		ad[1] = 21;	
		ad[2] = 22;	
		ad[3] = 23;	
		ad[4] = 24;	
		ad[5] = 25;	
		ad[6] = 26;	
		ad[7] = 27;	
		ad[8] = 28;	
		ad[9] = 29;	
		
		//1. int[] ap 출력
		for( int i=0; i<ap.length; i++ ){
			System.out.println(ap[i]+"\t");
		}
		
		
		//2. int[] aw 출력
		for( int i=0; i<aw.length; i++ ){
			System.out.println(aw[i]+"\t");
		}
		
		
		//3. int[] ad 출력
		for( int i=0; i<ad.length; i++ ){
			System.out.println(ad[i]+"\t");
		}
		
		
		
		
		
	}
	
	
}
/*
0	
1	
2	
3	
4	
5	
6	
7	
8	
9	
0	
1	
2	
3	
4	
5	
6	
7	
8	
9	
20	
21	
22	
23	
24	
25	
26	
27	
28	
29
*/