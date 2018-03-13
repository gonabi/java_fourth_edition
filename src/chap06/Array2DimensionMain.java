/**
2차원 배열(배열의 배열)을 테스트하는 예제
**/



public class Array2DimensionMain{
	
	public static void main(String[] args){
		
		int[][] src = new int[][]{{100,200,300},{400,500,600}};
		int[][] tar = {{ 701,702,703 },{ 704,705,706 }};
		
		//int[][] src의 정보출력
		System.out.print("src.length: "+src.length+"\t");
		System.out.print("src.length: "+src[0].length+"\t");
		System.out.println("src.length: "+src[1].length);
		
		
		//int[][] tar의 정보출력
		System.out.print("tar.length: "+tar.length+"\t");
		System.out.print("tar.length: "+tar[0].length+"\t");
		System.out.println("tar.length: "+tar[1].length);
				
		//2차원 배열의 출력
		for(int i=0; i<src.length; i++){
			for(int j=0; j<src[i].length; j++){
				System.out.println("src["+i+"]["+j+"]=" +src[i][j]+ "\t");
				System.out.println("tar["+i+"]["+j+"]=" +tar[i][j]+ "\t");
			}
			System.out.println();
		}
		
		
	}
}

/*

Gonabiui-MacBook-Pro:chap06 gonabi$ javac Array2DimensionMain.java 
Gonabiui-MacBook-Pro:chap06 gonabi$ java Array2DimensionMain
src.length: 2	src.length: 3	src.length: 3
tar.length: 2	tar.length: 3	tar.length: 3
src[0][0]=100	
tar[0][0]=701	
src[0][1]=200	
tar[0][1]=702	
src[0][2]=300	
tar[0][2]=703	

src[1][0]=400	
tar[1][0]=704	
src[1][1]=500	
tar[1][1]=705	
src[1][2]=600	
tar[1][2]=706
*/	