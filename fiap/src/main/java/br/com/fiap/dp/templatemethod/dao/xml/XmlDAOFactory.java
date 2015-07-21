package br.com.fiap.dp.templatemethod.dao.xml;

import br.com.fiap.dp.templatemethod.dao.CityDAO;
import br.com.fiap.dp.templatemethod.dao.CountryDAO;
import br.com.fiap.dp.templatemethod.dao.StateDAO;

public class XmlDAOFactory implements br.com.fiap.dp.templatemethod.dao.DAOFactory {

    public CountryDAO createCountryDAO() {
        return new XmlCountryDAO();
    }

    public StateDAO createStateDAO() {
        return new XmlStateDAO();
    }

    public CityDAO createCityDAO() {
        return new XmlCityDAO();
    }
}
