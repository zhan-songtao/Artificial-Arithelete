package com.zhan.Dao;

import com.zhan.domain.Community;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository//起到一个不爆红的作用  @Autowire下注入时有时会爆红
public interface CommunityMapper extends Mapper<Community> {


}
