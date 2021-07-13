package generator;

import generator.Commodity;

public interface CommodityDao {
    int deleteByPrimaryKey(Integer coId);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Integer coId);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}