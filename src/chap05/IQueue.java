/**
Queue 형태로 데이터를 삽입하고 추출하는 인터페이스
**/
package chap05;
public interface IQueue{
	void enQueue(String video);
	String deQueue();
}

