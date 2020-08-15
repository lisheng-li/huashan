package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class SC13900Action {
	
	private String focusId = null;
	
	private int num;
	
	private BigDecimal price;
	
	public void test(int focusId) {
		Method method = null;
		try {
			method = SC13900Action.class.getMethod("setFocusId", int.class);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		try {
			if (null != method) {
				method.invoke(this, new Object[] {focusId});
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public String getFocusId() {
		return focusId;
	}

	public void setFocusId(String focusId) {
		this.focusId = focusId;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setFocusId(int focusId) {
		this.num = focusId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
