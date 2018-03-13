/**
저장소 역할을 하는 클래스
**/
package chap05;
import java.util.Vector;

public class Shop{
	//protected Vector store = new Vector();
	
	protected Vector store = new Vector();
	
	public int getCount(){
		return store.size();
	}
}