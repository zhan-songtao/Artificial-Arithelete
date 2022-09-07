package com.zhan.Dao;

import com.zhan.domain.Building;
import com.zhan.domain.Community;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface BuildingMapper extends Mapper<Building> {
}
