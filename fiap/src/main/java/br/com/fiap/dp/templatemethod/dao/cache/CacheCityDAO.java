package br.com.fiap.dp.templatemethod.dao.cache;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import br.com.fiap.dp.templatemethod.dao.CityDAO;
import br.com.fiap.dp.templatemethod.domain.City;

public class CacheCityDAO implements CityDAO {

    private CityDAO realDao;
    private Map cache = null;

    public CacheCityDAO(CityDAO dao) {
        super();
        realDao = dao;
    }

    public Set getCities() {
        if (cache == null) {
            loadCache();
        }
        return new HashSet(cache.values());
    }

    public City getCity(String name) {
        if (cache == null) {
            loadCache();
        }
        return (City) cache.get(name);
    }

    private void loadCache() {
        cache = new HashMap();
        Set cities = realDao.getCities();
        for (Iterator iter = cities.iterator(); iter.hasNext(); ) {
            City city = (City) iter.next();
            cache.put(city.getName(), city);
        }
    }
}
