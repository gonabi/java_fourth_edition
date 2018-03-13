/**
main() 메서드의 매개변수를 테스트하는 예
**/
public class ParamMain{
	//이 프로그램을 실행할 때 명령줄에 매개변수를 넣어주지 않으면 에러가 발생합니다.
	public static void main(String[] args){
		
		if(args.length<2){
			System.out.println("첫 번째 매개변수:"+args[0]);
			
		}else{
			System.out.println("첫 번째 매개변수:"+args[0]);
			System.out.println("두 번째 매개변수:"+args[1]);
			
		}
	}
}