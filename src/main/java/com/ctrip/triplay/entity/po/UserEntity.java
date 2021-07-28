package com.ctrip.triplay.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author renwenpeng
 * @email wp.ren@trip.com
 * @date 2021-07-28 19:49:02
 */
@Data
@TableName("user")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId
    private Integer userId;
    /**
     * 工号
     */
    private String workNo;
    /**
     * 姓名
     */
    private String name;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 密码
     */
    private String pwd;
}
