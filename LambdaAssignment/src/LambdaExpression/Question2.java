package LambdaExpression;
import java.util.*;
public class Question2 {
	int price;
	String status;
	
	public Question2(int price, String status) {
		super();
		this.price = price;
		this.status = status;
	}

	public int getPrice() {
		return price;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Question2 [price=" + price + ", status=" + status + "]";
	}
	
}
