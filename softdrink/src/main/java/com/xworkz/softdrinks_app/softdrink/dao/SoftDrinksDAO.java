package com.xworkz.softdrinks_app.softdrink.dao;

import java.util.List;

import com.xworkz.softdrinks_app.softdrink.dto.SoftDrinksDTO;

public interface SoftDrinksDAO {

	public void save(SoftDrinksDTO cDTO);

	public List<SoftDrinksDTO> getAllDetails();

	public void updateColorByName(String name, int id, String color);

	public void deleteColorByName(String name, int id);

	public String getSoftdrinkColorBySoftdrinkName(String name);

	public SoftDrinksDTO getDetailsBySoftdrinkName(String name);

	public Object[] getSoftdrinkManufactureYearAndPricesBySoftdrinkName(String name);

}
