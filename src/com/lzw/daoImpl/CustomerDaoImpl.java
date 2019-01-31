package com.lzw.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lzw.dao.CustomerDao;
import com.lzw.db.DBUtil;
import com.lzw.entity.Customer;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public int addCustomer(Customer c) {
		String sql = "insert into customer(cId,cName,cContacts,cAdress,cPhone,cEmal,cMoney,cBackCard)"
				+ "values(?,?,?,?,?,?,?,?)";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c.getcId());
			pstmt.setString(2, c.getcName());
			pstmt.setString(3, c.getcContacts());
			pstmt.setString(4, c.getcAdress());
			pstmt.setString(5, c.getcPhone());
			pstmt.setString(6, c.getcEmal());
			pstmt.setInt(7, c.getcMoney());			
			pstmt.setString(8, c.getcBackCard());
			pstmt.executeUpdate();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return 0;
	}

	@Override
	public int removeCustomer(Customer c) {
		int id = c.getcId();
		String sql = "delete from customer where cId="+id;
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return 0;
	}

	@Override
	public int updateCustomer(Customer c) {
		int id = c.getcId();
		String sql = "update customer set cId=?,cName=?,cContacts=?,cAdress=?,cPhone=?,cEmal=?,cMoney=?,cBackCard=? where cId='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c.getcId());
			pstmt.setString(2, c.getcName());
			pstmt.setString(3, c.getcContacts());
			pstmt.setString(4, c.getcAdress());
			pstmt.setString(5, c.getcPhone());
			pstmt.setString(6, c.getcEmal());
			pstmt.setInt(7, c.getcMoney());			
			pstmt.setString(8, c.getcBackCard());
			pstmt.executeUpdate();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return 0;
	}

	@Override
	public Customer findCustomerById(int id) {
		String sql = "select * from customer where cId='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			Customer c=null;
			if(re.next()){
				c = new Customer(id,re.getString("cName"),re.getString("cContacts"),
						re.getString("cAdress"),re.getString("cPhone"),re.getString("cEmal"),
						re.getInt("cMoney"),re.getString("cBackCard"));
			}
			return c;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}

	@Override
	public List<Customer> findQianzhang() {
		String sql = "select * from customer where cMoney>'0'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<Customer> list = new ArrayList<Customer>();
			while(re.next()){
				Customer c=null;
				c = new Customer(re.getInt("cId"),re.getString("cName"),re.getString("cContacts"),
						re.getString("cAdress"),re.getString("cPhone"),re.getString("cEmal"),
						re.getInt("cMoney"),re.getString("cBackCard"));
				list.add(c);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}

	@Override
	public List<Customer> findAll() {
		String sql = "select * from customer";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<Customer> list = new ArrayList<Customer>();
			while(re.next()){
				Customer c=null;
				c = new Customer(re.getInt("cId"),re.getString("cName"),re.getString("cContacts"),
						re.getString("cAdress"),re.getString("cPhone"),re.getString("cEmal"),
						re.getInt("cMoney"),re.getString("cBackCard"));
				list.add(c);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}
        public Customer findCustomerByName(String name) {
		String sql = "select * from customer where cName='"+name+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			Customer c=null;
			if(re.next()){
				c = new Customer(re.getInt("cID"),re.getString("cName"),re.getString("cContacts"),
						re.getString("cAdress"),re.getString("cPhone"),re.getString("cEmal"),
						re.getInt("cMoney"),re.getString("cBackCard"));
			}
			return c;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}

}
