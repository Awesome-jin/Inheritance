package inheritance;

//Based 클래스를 상속받은 Derived 클래스
public class Derived extends Based {

	// 상위 클래스에 Default constructor가 없다면 생성자를 만들자
	// 그리고 super를 이용해서 상위 클래스의 생성자를 호출해야 한다.
	// Framework를 사용하면 우리가 상위 클래스 수정을 할 수 없기 때문에 하위 클래스에서 해결 해야 함
	
	public Derived() {
		super(10); // = new Based(10)과 같은 코드다!
	}

	
	// 메소드 만들어보자
	public void dips() {
		//num = 10; 
		title = "제목";
		content = "내용";
		readcnt = 0;
	}
	
	//상위 클래스에 이미 print()가 있는데 하위 클래스에서 다시 똑같은 print()를 만드는걸 method overriding이라고 한다.
	public void print() {
		System.out.println("I'm 하위클래스의 print");
	}
	
	public void method() {
		print(); // 이렇게 하면 앞에 아무것도 안붙었으니까 자기 클래스부터 찾아감!!
		super.print(); // 이렇게 하면 상위클래스에서 print()를 찾아감
	}
}
