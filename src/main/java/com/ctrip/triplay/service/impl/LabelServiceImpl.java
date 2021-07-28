package com.ctrip.triplay.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctrip.triplay.common.utils.PageUtils;
import com.ctrip.triplay.common.utils.Query;
import com.ctrip.triplay.dao.LabelDao;
import com.ctrip.triplay.entity.po.LabelEntity;
import com.ctrip.triplay.service.LabelService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("labelService")
public class LabelServiceImpl extends ServiceImpl<LabelDao, LabelEntity> implements LabelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LabelEntity> page = this.page(
                new Query<LabelEntity>().getPage(params),
                new QueryWrapper<LabelEntity>()
        );

        return new PageUtils(page);
    }

}