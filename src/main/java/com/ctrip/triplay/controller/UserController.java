package com.ctrip.triplay.controller;

import com.ctrip.triplay.common.exception.LogicException;
import com.ctrip.triplay.common.utils.PageUtils;
import com.ctrip.triplay.common.utils.R;
import com.ctrip.triplay.entity.po.UserEntity;
import com.ctrip.triplay.service.UserService;
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
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public R login(@RequestBody UserEntity userEntity){
        try{
            UserEntity userInfo = userService.login(userEntity);
            return R.ok().put("data",userInfo);
        }catch (LogicException exception){
            return R.error(exception.getCode(),exception.getMsg());
        }catch (Exception e){
            throw new RuntimeException();
        }
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = userService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    public R info(@PathVariable("userId") Integer userId) {
        UserEntity user = userService.getById(userId);

        return R.ok().put("user", user);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UserEntity user) {
        userService.save(user);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UserEntity user) {
        userService.updateById(user);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] userIds) {
        userService.removeByIds(Arrays.asList(userIds));

        return R.ok();
    }

}
