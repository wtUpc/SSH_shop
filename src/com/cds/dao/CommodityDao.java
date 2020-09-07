package com.cds.dao;

import java.util.List;

import com.cds.po.Commodity;
import com.cds.po.CommodityClass;

public interface CommodityDao {
	public void save(Commodity commodity);
	public void delete(Commodity commodity);
	public Commodity findCommodityById(int id);
	public List<Commodity> findAllCommoditys();
	public void update(Commodity commodity);
	public List<Commodity> findCommodityByName(String Name);
	public List<Commodity> findCommodityByClass(CommodityClass commodityclass);
	public List<Commodity> findCommodityBName(String name);
}
