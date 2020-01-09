package inheritance;

public class Based {

	private int num; // 자신의 클래스 내부에 있는 메소드 안에서만 사용 가능
	private String num2;//

	String title; // 접근 지정자를 설정하지 않은 것을 default 또는 package라고 부름
	// 클래스 내부의 메소드에서 사용 가능
	// 동일한 패키지 내에 있으면 public처럼 상속받은 클래스 그리고 인스턴스 사용 가능

	protected String content;
	// default에 다른 패키지에서도 상속받은 클래스에서는 사용 가능

	public int readcnt; // 자신의 클래스 그리고 상속받은 클래스와 인스턴스 사용 가능

	public void print() {
		System.out.println("I'm 상위클래스의 print");
	}
	
	// 정수 1개를 가지고 인스턴스를 생성하는 생성자.
	// 이런 생성자를 만들어버리면 public Based()는 소멸해버림
	public Based(int x) {
		num = x;
	}

}
