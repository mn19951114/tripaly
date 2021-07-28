package com.ctrip.triplay.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ctrip.triplay.entity.po.ActivityUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author renwenpeng
 * @email wp.ren@trip.com
 * @date 2021-07-28 19:42:00
 */
@Mapper
public interface ActivityUserDao extends BaseMapper<ActivityUserEntity> {

}
