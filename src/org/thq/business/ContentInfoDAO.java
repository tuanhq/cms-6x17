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
public class ContentInfoDAO {
	private static final Logger logger = Logger.getLogger(ContentInfoDAO.class);
	public ArrayList<ContentInfo> getList()throws ClassNotFoundException, SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		String strSQL = null;
		ResultSet rs =null;
		ArrayList<ContentInfo> list = new ArrayList<ContentInfo>();
		ContentInfo dto =null;
		try {
			strSQL = "select * from content_info where 1=1"; 
			conn = ConnectionPool.getConnection();
			stmt = conn.prepareStatement(strSQL);
			rs = stmt.executeQuery();
			while ((rs != null) && rs.next()) {
				dto = new ContentInfo();
				dto.setId(rs.getInt("id"));
				dto.setMo(rs.getString("mo"));
				dto.setMt(rs.getString("mt"));
				dto.setActive(rs.getString("status"));
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
	
	public ContentInfo getDtoById(int id) throws ClassNotFoundException, SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		String strSQL = null;
		ResultSet rs =null;		
		ContentInfo dto =null;
		try {
			strSQL = "select * from content_info where 1=1 and id =?"; 
			conn = ConnectionPool.getConnection();
			stmt = conn.prepareStatement(strSQL);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if ((rs != null) && rs.next()) {
				dto = new ContentInfo();
				dto.setMo(rs.getString("mo"));
				dto.setMt(rs.getString("mt"));
				dto.setActive(rs.getString("status"));
				
			}
		}catch (Exception e) {
			logger.error("insert: Errior executing " + strSQL + " >>> " + e.toString());
			e.printStackTrace();
		}finally {
			ConnectionPool.putConnection(conn);
			stmt.close();
			rs.close();
		}
		return dto;
			
		
	}

	public int editContentInfo(ContentInfo dto)throws ClassNotFoundException, SQLException {

		int result = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		String strSQL = null;
		try {
			if (dto.getId() == 0) {//insert
				strSQL = "INSERT INTO content_Info" + "(mo, mt) " + " values(?,?)";
			}else{
				strSQL = "update  content_Info set mo= ?, mt =? where id =?";
			}
			

			conn = ConnectionPool.getConnection();
			stmt = conn.prepareStatement(strSQL);
			stmt.setString(1, dto.getMo());
			stmt.setString(2, dto.getMt());
			if (dto.getId() != 0) {//insert
			stmt.setInt(3, dto.getId());
			}
			stmt.execute();
		} catch (Exception e) {
			logger.error("insert: Errior executing " + strSQL + " >>> " + e.toString());
			e.printStackTrace();

		} finally {
			ConnectionPool.putConnection(conn);
			stmt.close();
		}
		return result;
	
	}
	public boolean deleteDtoById(int id) throws ClassNotFoundException, SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		String strSQL = null;
		boolean result =false;	
	
		
		try {
			strSQL = "delete from content_info where 1=1 and id =?"; 
			conn = ConnectionPool.getConnection();
			stmt = conn.prepareStatement(strSQL);
			stmt.setInt(1, id);
			result = stmt.executeUpdate() >0;
			
		}catch (Exception e) {
			logger.error("insert: Errior executing " + strSQL + " >>> " + e.toString());
			e.printStackTrace();
		}finally {
			ConnectionPool.putConnection(conn);
			stmt.close();
			
		}
		return result;
			
		
	}
	
	
	public static void main(String[] args) {
		try {
			ArrayList<ContentInfo> list = new ContentInfoDAO().getList();
			for (ContentInfo contentInfo : list) {
				System.out.println(contentInfo.getMt());
			}
			
			ContentInfo dto = new ContentInfo();
			dto.setId(4);
			dto.setMo("KEP2");
			dto.setMt("Vay day la kep 2");
			new ContentInfoDAO().editContentInfo(dto);
			
		  new ContentInfoDAO().deleteDtoById(1);
		 System.out.println(dto.getMo() + "MT:" + dto.getMt());	
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}
}
