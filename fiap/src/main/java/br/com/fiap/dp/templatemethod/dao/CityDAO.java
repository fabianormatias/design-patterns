package br.com.fiap.dp.templatemethod.dao;

import java.util.Set;

import br.com.fiap.dp.templatemethod.domain.City;

public interface CityDAO {

	Set getCities();

	City getCity(String name);

}
