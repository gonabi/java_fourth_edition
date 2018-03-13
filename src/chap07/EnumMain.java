//자바 enum의 사용
package chap07;

enum SingnFlag {black,yellow,green,blue,red};

public class EnumMain {

	public static void main(String[] args) {
		for(SingnFlag f : SingnFlag.values()) {
			System.out.println(f+":");
			System.out.println(f.name()+":");
			System.out.println(f.ordinal());
			System.out.println();
		}
		
	}// end main()

}
/*
black:
black:
0

yellow:
yellow:
1

green:
green:
2

blue:
blue:
3

red:
red:
4
*/

