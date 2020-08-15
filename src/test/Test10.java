package test;

public class Test10 {
	
	public String hello() throws MyException {
		boolean flag = true;
		if (flag) {
			throw new MyException("true");
		}
		return "myException";
	}

}
