package Polymorphism;

public class Main {

	// 메인 메소드를 소유한 실행 클래스를 만들고 3개 클래스의 attack을 호출해보자
	/*
	 * public static void main(String[] args) {
	 * 
	 * Protoss p = new Protoss(); p.attack();
	 * 
	 * Terran t = new Terran(); t.attack();
	 * 
	 * Zerg z = new Zerg(); z.attack();
	 * 
	 * System.out.println("=========================================="); }
	 */

	// 이렇게만 해도 프로그램은 구현 가능하다. C가 그러니까.
	// 이렇게 해버리면 3개의 종족의 attack 코드는 다 달라야 한다.
	// 따라서 하나의 명령어로 3개 메소드를 호출하기 위해 동일한 코드가 3개의 메소드를 호출하도록 다형성을 이용해보자.

	// 상속할 상위 클래스를 생성하고 >> 메소드를 오버라이딩 할 수 있도록 attack을 구현

	public static void main(String[] args) {

		Star star = new Protoss();
		star.attack();

		star = new Terran();
		star.attack();

		star = new Zerg();
		star.attack();

		//키보드로 a를 누르면 star.attack()이 호출되도록 연결 이런 작업이 가능해짐
	}

}
