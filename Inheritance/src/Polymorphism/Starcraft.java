package Polymorphism;

//상위 클래스를 만들었으면 상속할 클래스에 extends Star를 선언한다
public abstract class Starcraft {
	
	//abstract가 붙으면 추상 메소드가 됨 
	// 내용이 없다는 거니까 이 전에 있던 공허한 {  }이 필요 없어짐.
	// 단 abstract를 붙일거면 반드시 하위 클래스에서 이 메소드를 재정의해야 함
	public abstract void attack();

}
