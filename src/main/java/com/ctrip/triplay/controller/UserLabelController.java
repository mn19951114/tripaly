package com.ctrip.triplay.controller;

import com.ctrip.triplay.common.utils.PageUtils;
import com.ctrip.triplay.common.utils.R;
import com.ctrip.triplay.entity.po.UserLabelEntity;
import com.ctrip.triplay.service.UserLabelService;
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
@RequestMapping("userlabel")
public class UserLabelController {
    @Autowired
    private UserLabelService userLabelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = userLabelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userLabelId}")
    public R info(@PathVariable("userLabelId") Integer userLabelId) {
        UserLabelEntity userLabel = userLabelService.getById(userLabelId);

        return R.ok().put("userLabel", userLabel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UserLabelEntity userLabel) {
        userLabelService.save(userLabel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UserLabelEntity userLabel) {
        userLabelService.updateById(userLabel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] userLabelIds) {
        userLabelService.removeByIds(Arrays.asList(userLabelIds));

        return R.ok();
    }

}
