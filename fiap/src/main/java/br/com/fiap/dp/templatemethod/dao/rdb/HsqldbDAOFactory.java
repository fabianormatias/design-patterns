package br.com.fiap.dp.templatemethod.dao.rdb;

import br.com.fiap.dp.templatemethod.dao.CityDAO;
import br.com.fiap.dp.templatemethod.dao.CountryDAO;
import br.com.fiap.dp.templatemethod.dao.StateDAO;

public class HsqldbDAOFactory implements br.com.fiap.dp.templatemethod.dao.DAOFactory {

    public CountryDAO createCountryDAO() {
        return new HsqldbCountryDAO();
    }

    public StateDAO createStateDAO() {
        return new HsqldbStateDAO();
    }

    public CityDAO createCityDAO() {
        return new HsqldbCityDAO();
    }
}
