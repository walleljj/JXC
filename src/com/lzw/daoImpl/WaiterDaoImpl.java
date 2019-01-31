package com.lzw.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lzw.dao.WaiterDao;
import com.lzw.db.DBUtil;

import com.lzw.entity.Waiter;

public class WaiterDaoImpl implements WaiterDao {

	@Override
	public int addWaiter(Waiter w) {
		String sql = "insert into waiter(wId,wName,wPass,wPhone)"
				+ "values(?,?,?,?)";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, w.getwId());
			pstmt.setString(2, w.getwName());
			pstmt.setString(3, w.getwPass());
			pstmt.setString(4, w.getwPhone());
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
	public int updeteWaiter(Waiter w) {
		int id = w.getwId();
		String sql = "update waiter set wId=?,wName=?,wPass=?,wPhone=? where wId='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, w.getwId());
			pstmt.setString(2, w.getwName());
			pstmt.setString(3, w.getwPass());
			pstmt.setString(4, w.getwPhone());
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
	public Waiter findWaiterById(int id) {
		String sql = "select * from waiter where wId='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			Waiter c=null;
			if(re.next()){
				c = new Waiter(re.getInt("wId"),re.getString("wName"),re.getString("wPass"),re.getString("wPhone"));
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
