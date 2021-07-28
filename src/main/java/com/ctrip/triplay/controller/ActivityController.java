package com.ctrip.triplay.controller;

import com.ctrip.triplay.common.utils.PageUtils;
import com.ctrip.triplay.common.utils.R;
import com.ctrip.triplay.entity.po.ActivityEntity;
import com.ctrip.triplay.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * @author renwenpeng
 * @email wp.ren@trip.com
 * @date 2021-07-28 19:42:00
 */
@RestController
@RequestMapping("activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = activityService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{activityId}")
    public R info(@PathVariable("activityId") Integer activityId) {
        ActivityEntity activity = activityService.getById(activityId);
        return R.ok().put("activity", activity);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ActivityEntity activity) {
        activityService.save(activity);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ActivityEntity activity) {
        activityService.updateById(activity);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] activityIds) {
        activityService.removeByIds(Arrays.asList(activityIds));
        return R.ok();
    }

}
