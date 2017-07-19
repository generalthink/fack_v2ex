package com.generalthink.v2ex.data.dao;

import com.generalthink.v2ex.data.entity.Admin;
import com.generalthink.v2ex.data.entity.AdminExample;
import java.util.List;

public interface AdminMapper {
    int countByExample(AdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}