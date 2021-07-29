package com.ctrip.triplay.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctrip.triplay.common.exception.BizCodeEnum;
import com.ctrip.triplay.common.exception.LogicException;
import com.ctrip.triplay.common.utils.PageUtils;
import com.ctrip.triplay.common.utils.Query;
import com.ctrip.triplay.dao.UserDao;
import com.ctrip.triplay.entity.po.UserEntity;
import com.ctrip.triplay.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserEntity> page = this.page(
                new Query<UserEntity>().getPage(params),
                new QueryWrapper<UserEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 用户登录
     * @param userEntity
     * @return
     */
    @Override
    public UserEntity login(UserEntity userEntity) {
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.select("user_id","work_no","name","email")
                .eq("email",userEntity.getEmail())
                .eq("pwd",userEntity.getPwd());
        UserEntity userInDB = this.getOne(wrapper);
        if(userInDB == null){
            throw new LogicException(BizCodeEnum.EMAIL_PWD_ERROR.getCode(),BizCodeEnum.EMAIL_PWD_ERROR.getMsg());
        }
        return userInDB;
    }

}