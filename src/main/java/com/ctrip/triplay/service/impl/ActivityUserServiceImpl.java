package com.ctrip.triplay.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctrip.triplay.common.utils.PageUtils;
import com.ctrip.triplay.common.utils.Query;
import com.ctrip.triplay.dao.ActivityUserDao;
import com.ctrip.triplay.entity.po.ActivityUserEntity;
import com.ctrip.triplay.service.ActivityUserService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("activityUserService")
public class ActivityUserServiceImpl extends ServiceImpl<ActivityUserDao, ActivityUserEntity> implements ActivityUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ActivityUserEntity> page = this.page(
                new Query<ActivityUserEntity>().getPage(params),
                new QueryWrapper<ActivityUserEntity>()
        );

        return new PageUtils(page);
    }

}