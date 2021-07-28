package com.ctrip.triplay.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ctrip.triplay.entity.po.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberDao extends BaseMapper<Member> {
}
