package it.objectmethod.mappamondo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.objectmethod.mappamondo.config.ConnectionConfig;
import it.objectmethod.mappamondo.dao.ICityDao;
import it.objectmethod.mappamondo.model.City;

public class CityDao implements ICityDao {

	@Override
	public List<City> getCities(String contryCode) {

		City city = null;
		Connection connCity = null;
		PreparedStatement stmtCity = null;
		ResultSet rs = null;
		List<City> listCity = new ArrayList<>();
		try {
			connCity = ConnectionConfig.getConnection();
			String sqlQueryCity = "SELECT Name, CountryCode, Population FROM city WHERE CountryCode=?";
			stmtCity = connCity.prepareStatement(sqlQueryCity);
			stmtCity.setString(1, contryCode);
			rs = stmtCity.executeQuery();
			while (rs.next()) {
				city = new City();

				city.setName(rs.getString("Name"));
				city.setCountryCode(rs.getString("CountryCode"));
				city.setPopulation(rs.getLong("Population"));

				listCity.add(city);

			}

			System.out.println("city" + listCity);

			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmtCity != null) {
					stmtCity.close();
				}
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (connCity != null) {
					connCity.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

		return listCity;
	}

}
