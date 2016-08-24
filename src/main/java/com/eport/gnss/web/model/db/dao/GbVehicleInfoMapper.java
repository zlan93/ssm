package com.eport.gnss.web.model.db.dao;

import com.eport.gnss.web.model.db.po.GbVehicleInfo;
import com.eport.gnss.web.model.db.po.GbVehicleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GbVehicleInfoMapper {
    int countByExample(GbVehicleInfoExample example);

    int deleteByExample(GbVehicleInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(GbVehicleInfo record);

    int insertSelective(GbVehicleInfo record);

    List<GbVehicleInfo> selectByExample(GbVehicleInfoExample example);

    GbVehicleInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GbVehicleInfo record, @Param("example") GbVehicleInfoExample example);

    int updateByExample(@Param("record") GbVehicleInfo record, @Param("example") GbVehicleInfoExample example);

    int updateByPrimaryKeySelective(GbVehicleInfo record);

    int updateByPrimaryKey(GbVehicleInfo record);
}