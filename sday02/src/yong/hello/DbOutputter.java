package yong.hello;

public class DbOutputter implements Outputter {
	
	@Override
	public void output(String msg) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("==DB연동 가능!==");
		System.out.println("저장완료!");
		System.out.println("저장된 데이터 : " + msg);
		System.out.println("==DB연동 종료!==");
	}

}
