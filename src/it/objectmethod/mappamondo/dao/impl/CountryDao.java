package it.objectmethod.mappamondo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import it.objectmethod.mappamondo.config.ConnectionConfig;
import it.objectmethod.mappamondo.dao.ICountryDao;
import it.objectmethod.mappamondo.model.Country;

public class CountryDao implements ICountryDao {

	@Override
	public List<Country> getCountry(String nameCont) {
		Country country = null;
		Connection connTwo = null;
		PreparedStatement stmtTwo = null;
		ResultSet rs = null;
		List<Country> listCountry = new ArrayList<>();

		try {
			connTwo = ConnectionConfig.getConnection();
			String sqlQuery = "SELECT Name, Code FROM country where Continent = ?";
			stmtTwo = connTwo.prepareStatement(sqlQuery);
			stmtTwo.setString(1, nameCont);
			rs = stmtTwo.executeQuery();
			while (rs.next()) {
				country = new Country();
				country.setCode(rs.getString("Code"));
				country.setName(rs.getString("Name"));
				listCountry.add(country);
			}

			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmtTwo != null) {
					stmtTwo.close();
				}
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (connTwo != null) {
					connTwo.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

		return listCountry;
	}

	@Override
	public List<String> getContinent() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<String> listContinent = new ArrayList<>();
		try {
			conn = ConnectionConfig.getConnection();
			String sql = "SELECT DISTINCT Continent FROM country;";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {
				listContinent.add(rs.getString("Continent"));
			}

			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

		return listContinent;
	}

}
