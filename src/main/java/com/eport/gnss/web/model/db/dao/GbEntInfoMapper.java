package com.eport.gnss.web.model.db.dao;

import com.eport.gnss.web.model.db.po.GbEntInfo;
import com.eport.gnss.web.model.db.po.GbEntInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GbEntInfoMapper {
    int countByExample(GbEntInfoExample example);

    int deleteByExample(GbEntInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(GbEntInfo record);

    int insertSelective(GbEntInfo record);

    List<GbEntInfo> selectByExample(GbEntInfoExample example);

    GbEntInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GbEntInfo record, @Param("example") GbEntInfoExample example);

    int updateByExample(@Param("record") GbEntInfo record, @Param("example") GbEntInfoExample example);

    int updateByPrimaryKeySelective(GbEntInfo record);

    int updateByPrimaryKey(GbEntInfo record);
}