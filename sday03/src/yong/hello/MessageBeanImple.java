package yong.hello;

public class MessageBeanImple implements MessageBean {

	private String name;
	private String greeting;
	
	public MessageBeanImple() {
		super();
	}

	public MessageBeanImple(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg = greeting +", " + name + "!";
		System.out.println(msg);
	}

}
