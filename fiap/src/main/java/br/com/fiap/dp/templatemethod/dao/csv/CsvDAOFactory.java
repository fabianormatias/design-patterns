package br.com.fiap.dp.templatemethod.dao.csv;

import br.com.fiap.dp.templatemethod.dao.CityDAO;
import br.com.fiap.dp.templatemethod.dao.CountryDAO;
import br.com.fiap.dp.templatemethod.dao.StateDAO;

public class CsvDAOFactory implements br.com.fiap.dp.templatemethod.dao.DAOFactory {

    public CountryDAO createCountryDAO() {
        return new CsvCountryDAO();
    }

    public StateDAO createStateDAO() {
        return new CsvStateDAO();
    }

    public CityDAO createCityDAO() {
        return new CsvCityDAO();
    }
}
