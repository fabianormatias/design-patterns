package br.com.fiap.dp.templatemethod.dao.cache;

import br.com.fiap.dp.templatemethod.dao.CityDAO;
import br.com.fiap.dp.templatemethod.dao.CountryDAO;
import br.com.fiap.dp.templatemethod.dao.DAOFactory;
import br.com.fiap.dp.templatemethod.dao.StateDAO;

public class CacheDAOFactory implements DAOFactory {

    private DAOFactory realFactory;

    public CacheDAOFactory(DAOFactory factory) {
        super();
        realFactory = factory;
    }

    public CountryDAO createCountryDAO() {
        return new CacheCountryDAO(realFactory.createCountryDAO());
    }

    public StateDAO createStateDAO() {
        return new CacheStateDAO(realFactory.createStateDAO());
    }

    public CityDAO createCityDAO() {
        return new CacheCityDAO(realFactory.createCityDAO());
    }

}
