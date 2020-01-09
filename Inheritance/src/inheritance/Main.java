package inheritance;

public class Main {

	public static void main(String[] args) {
		// main 메소드를 만들어서 Derived의 print 두 개를 비교해보자
		
		
		// derived 클래스의 method()를 호출해보자
		// 1.생성자를 까보자. method() 녹색이니까 쓸 수 있네?
		// 2. Static이 아니니까 인스턴스가 필요하겠네?
		// 3. 매개변수는 따로 필요없군!
		Derived derived = new Derived();
		derived.method();
	}

}
