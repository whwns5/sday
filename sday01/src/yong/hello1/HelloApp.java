package yong.hello1;

public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 타이트커플링 방식
		// HelloApp클래스는 MessageBean 클래스에 의존하고 있기 때문..
		// 의존성이 높은 코드 방식
		MessageBean bean = new MessageBean();
		bean.sayHello("java");
	}

}
