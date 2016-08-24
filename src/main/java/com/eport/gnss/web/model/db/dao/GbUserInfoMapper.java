package com.eport.gnss.web.model.db.dao;

import com.eport.gnss.web.model.db.po.GbUserInfo;
import com.eport.gnss.web.model.db.po.GbUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GbUserInfoMapper {
    int countByExample(GbUserInfoExample example);

    int deleteByExample(GbUserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GbUserInfo record);

    int insertSelective(GbUserInfo record);

    List<GbUserInfo> selectByExample(GbUserInfoExample example);

    GbUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GbUserInfo record, @Param("example") GbUserInfoExample example);

    int updateByExample(@Param("record") GbUserInfo record, @Param("example") GbUserInfoExample example);

    int updateByPrimaryKeySelective(GbUserInfo record);

    int updateByPrimaryKey(GbUserInfo record);
}