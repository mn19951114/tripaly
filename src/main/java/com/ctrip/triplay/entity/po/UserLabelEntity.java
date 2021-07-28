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
@TableName("user_label")
public class UserLabelEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户与其标签关系对的id
     */
    @TableId
    private Integer userLabelId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 标签编号，所对应内容写在配置或者枚举中
     */
    private Integer labelId;
}
