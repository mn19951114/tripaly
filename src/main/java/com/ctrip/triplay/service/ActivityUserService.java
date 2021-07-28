package com.ctrip.triplay.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ctrip.triplay.common.utils.PageUtils;
import com.ctrip.triplay.entity.po.ActivityUserEntity;

import java.util.Map;

/**
 * @author renwenpeng
 * @email wp.ren@trip.com
 * @date 2021-07-28 19:49:02
 */
public interface ActivityUserService extends IService<ActivityUserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

