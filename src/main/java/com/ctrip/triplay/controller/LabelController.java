package com.ctrip.triplay.controller;

import com.ctrip.triplay.common.utils.PageUtils;
import com.ctrip.triplay.common.utils.R;
import com.ctrip.triplay.entity.po.LabelEntity;
import com.ctrip.triplay.service.LabelService;
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
@RequestMapping("label")
public class LabelController {
    @Autowired
    private LabelService labelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = labelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{lableId}")
    public R info(@PathVariable("lableId") Integer lableId) {
        LabelEntity label = labelService.getById(lableId);

        return R.ok().put("label", label);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LabelEntity label) {
        labelService.save(label);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LabelEntity label) {
        labelService.updateById(label);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] lableIds) {
        labelService.removeByIds(Arrays.asList(lableIds));

        return R.ok();
    }

}
