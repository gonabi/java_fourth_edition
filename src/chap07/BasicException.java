/*
사용자가 필요하다고 생각해서 에러처리 구문을 사용하는 경우
*/
package chap07;

public class BasicException {

	public static void main(String[] args) {
		try {
			int[] ar = new int[] {0, 100,200, 300};
			
			//고의로 에러유발 : 배열의 범위를 벗어나도록 한다.
			for(int i=0; i<=ar.length; i++) {
				System.out.println("ar["+i+"]="+ar[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("e.getMessage():"+e.getMessage());
			System.out.println("e.toString():"+e.toString());
			e.printStackTrace();
			
			return;
		}finally {
			System.out.println("finally:결국 이리로 오는군요");
		}

	}//end main()

}

/*
ar[0]=0
ar[1]=100
ar[2]=200
ar[3]=300
e.getMessage():4
e.toString():java.lang.ArrayIndexOutOfBoundsException: 4
finally:결국 이리로 오는군요
java.lang.ArrayIndexOutOfBoundsException: 4
	at chap07.BasicException.main(BasicException.java:14)
	

	
*/