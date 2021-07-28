package com.ctrip.triplay.controller;

import com.ctrip.triplay.common.utils.PageUtils;
import com.ctrip.triplay.common.utils.R;
import com.ctrip.triplay.entity.po.ActivityUserEntity;
import com.ctrip.triplay.service.ActivityUserService;
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
@RequestMapping("activityuser")
public class ActivityUserController {
    @Autowired
    private ActivityUserService activityUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = activityUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{activityUserId}")
    public R info(@PathVariable("activityUserId") Integer activityUserId) {
        ActivityUserEntity activityUser = activityUserService.getById(activityUserId);

        return R.ok().put("activityUser", activityUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ActivityUserEntity activityUser) {
        activityUserService.save(activityUser);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ActivityUserEntity activityUser) {
        activityUserService.updateById(activityUser);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] activityUserIds) {
        activityUserService.removeByIds(Arrays.asList(activityUserIds));

        return R.ok();
    }

}
