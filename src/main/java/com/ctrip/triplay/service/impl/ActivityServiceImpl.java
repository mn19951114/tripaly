package com.ctrip.triplay.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctrip.triplay.common.utils.PageUtils;
import com.ctrip.triplay.common.utils.Query;
import com.ctrip.triplay.dao.ActivityDao;
import com.ctrip.triplay.entity.po.ActivityEntity;
import com.ctrip.triplay.service.ActivityService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("activityService")
public class ActivityServiceImpl extends ServiceImpl<ActivityDao, ActivityEntity> implements ActivityService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ActivityEntity> page = this.page(
                new Query<ActivityEntity>().getPage(params),
                new QueryWrapper<ActivityEntity>()
        );

        return new PageUtils(page);
    }

}