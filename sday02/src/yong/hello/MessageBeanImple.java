package yong.hello;

public class MessageBeanImple implements MessageBean {

	private String name; // 이름
	private String greeting; // 인사말
	private Outputter output;
	
	public MessageBeanImple() {
		super();
	}

	public MessageBeanImple(String name) {
		super();
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public Outputter getOutput() {
		return output;
	}

	public void setOutput(Outputter output) {
		this.output = output;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		String msg = this.greeting + ", " + this.name;
		System.out.println(msg);
		
		try {
			output.output(msg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
