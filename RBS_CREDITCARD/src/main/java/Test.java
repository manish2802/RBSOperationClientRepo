
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.asthvinayak.QueryConstant.QueryConstant;
import com.asthvinayak.bean.AccStatementDTO;
import com.asthvinayak.util.DBUtil;

public class Test {
	
	public static void main(String args[]) throws SQLException
	{
		AccStatementDTO accStatementDTO = new AccStatementDTO();
		
		accStatementDTO.setDate(new Date());
		accStatementDTO.setRef_number("123241242");
		accStatementDTO.setTransaction_details("sai s");
		accStatementDTO.setReward_point(1);
		accStatementDTO.setCurrency("inr");
		accStatementDTO.setInternational_amount(1234);
		accStatementDTO.setAmount(1234);
		
		Connection con = DBUtil.getConnection();
	String sql ="INSERT INTO 123_Statement "+QueryConstant.STATE_TABLE_ENTRY;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "12/12/12");
		ps.setString(2, "1232131");
		ps.setString(3, "asdasda");
		ps.setInt(4, 1);
		ps.setString(5, "inr");
		ps.setDouble(6, 123);
		ps.setDouble(7, 2342);
		int i = ps.executeUpdate();
		System.out.println(i);
		con.close();
	}
	

}
