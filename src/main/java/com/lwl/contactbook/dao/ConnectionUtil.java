package com.lwl.contactbook.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionUtil {

	private static ConnectionUtil obj = null;

	Properties properties;

	private ConnectionUtil() {
		properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ConnectionUtil getInstance() {
		if (obj == null) {
			obj = new ConnectionUtil();
		}
		return obj;
	}

	public Connection getConnection() {
		Connection con = null;

		try {
			con = DriverManager.getConnection(properties.getProperty("db.url"), properties);
		} catch (Exception e) {
			System.out.println("While connecting with db: " + e);
		}
		return con;
	}

	public void close(Statement st, Connection con) {
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			System.out.println("While closing resources :" + e);
		}
	}

	public void close(ResultSet rs, Statement st, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			System.out.println("While closing resources :" + e);
		}
	}

}
