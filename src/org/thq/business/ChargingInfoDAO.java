/**
 * 
 */
package org.thq.business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.thq.database.ConnectionPool;


/**
 * @author tuanhq
 *
 */
public class ChargingInfoDAO {
	private static final Logger logger = Logger.getLogger(ChargingInfoDAO.class);

	public boolean insertChargingInfor(ChargingInfo chargingInfo) throws ClassNotFoundException, SQLException {

		boolean result = false;
		Connection conn = null;
		PreparedStatement stmt = null;
		String strSQL = null;
		try {
			strSQL = "INSERT INTO charging_info" + "(user_id, service_id, command_code, timestamp1, timestamp2, Proc_result, mts) " + " values(?,?,?,?,?,?,?)";

			conn = ConnectionPool.getConnection();
			stmt = conn.prepareStatement(strSQL);
			stmt.setString(1, chargingInfo.getUserId());
			stmt.setString(2, chargingInfo.getServiceId());
			stmt.setString(3, chargingInfo.getCommandCode());
			stmt.setString(4, chargingInfo.getTimeStamp1());
			stmt.setString(5, chargingInfo.getTimeStamp2());
			stmt.setString(6, chargingInfo.getProResult());
			stmt.setString(7, chargingInfo.getMts());
			result = stmt.executeUpdate() >= 0;
		} catch (Exception e) {
			logger.error("insert: Errior executing " + strSQL + " >>> " + e.toString());
			e.printStackTrace();

		} finally {
			ConnectionPool.putConnection(conn);
			stmt.close();
		}
		return result;

	}
	public ArrayList<ChargingInfo> getLists() throws ClassNotFoundException, SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		String strSQL = null;
		ResultSet rs =null;
		ArrayList<ChargingInfo> list = new ArrayList<ChargingInfo>();
		ChargingInfo dto =null;
		try {
			strSQL = "select * from charging_info where 1=1"; 
			conn = ConnectionPool.getConnection();
			stmt = conn.prepareStatement(strSQL);
			rs = stmt.executeQuery();
			while ((rs != null) && rs.next()) {
				dto = new ChargingInfo();
				dto.setUserId(rs.getString("user_id"));
				dto.setServiceId(rs.getString("service_id"));
				dto.setCommandCode(rs.getString("command_code"));
				dto.setTimeStamp1(rs.getString("timestamp1"));
				dto.setTimeStamp2(rs.getString("timestamp2"));
				dto.setProResult(rs.getString("Proc_result"));
				dto.setMts(rs.getString("mts"));
				list.add(dto);
			}
		}catch (Exception e) {
			logger.error("insert: Errior executing " + strSQL + " >>> " + e.toString());
			e.printStackTrace();
		}finally {
			ConnectionPool.putConnection(conn);
			stmt.close();
			rs.close();
		}
		return list;
			
		
	}
	public int getListsSize() throws ClassNotFoundException, SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		String strSQL = null;
		ResultSet rs =null;
		int total =0;
		
		try {
			strSQL = "select count(*) from charging_info where 1=1"; 
			conn = ConnectionPool.getConnection();
			stmt = conn.prepareStatement(strSQL);
			rs = stmt.executeQuery();
			while ((rs != null) && rs.next()) {
				total = rs.getInt(1);
			}
		}catch (Exception e) {
			logger.error("insert: Errior executing " + strSQL + " >>> " + e.toString());
			e.printStackTrace();
		}finally {
			ConnectionPool.putConnection(conn);
			stmt.close();
			rs.close();
		}
		return total;
			
		
	}
	public ArrayList<ChargingInfo> getLists(String fromDate, String toDate, String commandCode) throws ClassNotFoundException, SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		String strSQL = null;
		ResultSet rs =null;
		ArrayList<ChargingInfo> list = new ArrayList<ChargingInfo>();
		ChargingInfo dto =null;
		try {
			strSQL = "select * from charging_info where 1=1 ";
			if(fromDate!=null){
				strSQL = strSQL + " and timestamp1 >='"+ fromDate + "'";
			}
			if(toDate!=null){
				strSQL = strSQL  + " and timestamp1 <='"+ fromDate + "'"; 
			}
			if(commandCode != null) {
				strSQL = strSQL  +" upper(command_code)='" + commandCode.toUpperCase() + "'";
			}
			 
			conn = ConnectionPool.getConnection();
			stmt = conn.prepareStatement(strSQL);
			rs = stmt.executeQuery();
			while ((rs != null) && rs.next()) {
				dto = new ChargingInfo();
				dto.setUserId(rs.getString("user_id"));
				dto.setServiceId(rs.getString("service_id"));
				dto.setCommandCode(rs.getString("command_code"));
				dto.setTimeStamp1(rs.getString("timestamp1"));
				dto.setTimeStamp2(rs.getString("timestamp2"));
				dto.setProResult(rs.getString("Proc_result"));
				dto.setMts(rs.getString("mts"));
				list.add(dto);
			}
		}catch (Exception e) {
			logger.error("insert: Errior executing " + strSQL + " >>> " + e.toString());
			e.printStackTrace();
		}finally {
			ConnectionPool.putConnection(conn);
			stmt.close();
			rs.close();
		}
		return list;
			
		
	}
	public int getListsSize(String fromDate, String toDate, String commandCode) throws ClassNotFoundException, SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		String strSQL = null;
		ResultSet rs =null;
		int total =0;
		try {
			strSQL = "select count(*) from charging_info where 1=1 ";
			if(fromDate!=null){
				strSQL = strSQL + " and timestamp1 >='"+ fromDate + "'";
			}
			if(toDate!=null){
				strSQL = strSQL  + " and timestamp1 <='"+ fromDate + "'"; 
			}
			if(commandCode != null) {
				strSQL = strSQL  +" upper(command_code)='" + commandCode.toUpperCase() + "'";
			}
			 
			conn = ConnectionPool.getConnection();
			stmt = conn.prepareStatement(strSQL);
			rs = stmt.executeQuery();
			while ((rs != null) && rs.next()) {
				total =rs.getInt(1);
			}
		}catch (Exception e) {
			logger.error("insert: Errior executing " + strSQL + " >>> " + e.toString());
			e.printStackTrace();
		}finally {
			ConnectionPool.putConnection(conn);
			stmt.close();
			rs.close();
		}
		return total;
			
		
	}

	public static void main(String[] args) {
		ChargingInfo chargingInfo =new ChargingInfo("01245", "6x71", "Kep","123456" , "123234455", "1", "1");
		try {
			new ChargingInfoDAO().insertChargingInfor(chargingInfo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
