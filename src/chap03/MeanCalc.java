/**
은폐화(Encapsulation)를 테스트하는 클래스
캡슐화
**/
public class MeanCalc{
	private int sum; //합을 저장하기 위한 private 멤버
	private int num; //값의 개수를 저장하기 위한 private 멤버
	
	//외부로 부터 들어온 값을 가공하는 public 멤버 메서드
	public void setValue(int w, int x, int y, int z, int n){
		sum = w+x+y+z;
		num=n;
	}
	
	//내부의 값을 가공해서 내보내는 public 멤버 메서드
	public int getMean(){
		return sum/num;
	}
}

