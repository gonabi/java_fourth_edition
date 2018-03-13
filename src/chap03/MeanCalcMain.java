/**
MeanCalc를 테스트하는 예
**/
public class MeanCalcMain{
	public static void main(String[] args){
		MeanCalc m = new MeanCalc(); //객체 생성
		m.setValue(3,5,120,40,4); //가공해서 private 멤버에 값할당
		int s = m.getMean(); //private 멤버의 가공된 값 얻기
		System.out.println("평균="+s);//데이터 출력
	}
	
}