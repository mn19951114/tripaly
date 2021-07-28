package com.ctrip.triplay.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctrip.triplay.common.utils.PageUtils;
import com.ctrip.triplay.common.utils.Query;
import com.ctrip.triplay.dao.UserLabelDao;
import com.ctrip.triplay.entity.po.UserLabelEntity;
import com.ctrip.triplay.service.UserLabelService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("userLabelService")
public class UserLabelServiceImpl extends ServiceImpl<UserLabelDao, UserLabelEntity> implements UserLabelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserLabelEntity> page = this.page(
                new Query<UserLabelEntity>().getPage(params),
                new QueryWrapper<UserLabelEntity>()
        );

        return new PageUtils(page);
    }

}