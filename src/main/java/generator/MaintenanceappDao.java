package generator;

import generator.Maintenanceapp;

public interface MaintenanceappDao {
    int deleteByPrimaryKey(Integer maintenanceappid);

    int insert(Maintenanceapp record);

    int insertSelective(Maintenanceapp record);

    Maintenanceapp selectByPrimaryKey(Integer maintenanceappid);

    int updateByPrimaryKeySelective(Maintenanceapp record);

    int updateByPrimaryKey(Maintenanceapp record);
}