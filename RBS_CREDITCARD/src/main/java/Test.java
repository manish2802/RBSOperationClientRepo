import java.util.List;

import com.asthvinayak.bean.TransactionsDetailsDTO;
import com.asthvinayak.dao.impl.CreditCardDAOImpl;


public class Test {

	public static void main(String[] args) {
		
		CreditCardDAOImpl dao = CreditCardDAOImpl.getInstance();
		List<TransactionsDetailsDTO> list = dao.gettransactionDetails(123);
		System.out.println(list);
	}
}
