package com.ctrip.triplay.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ctrip.triplay.entity.po.UserLabelEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author renwenpeng
 * @email wp.ren@trip.com
 * @date 2021-07-28 19:42:00
 */
@Mapper
public interface UserLabelDao extends BaseMapper<UserLabelEntity> {

}
