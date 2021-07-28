package com.ctrip.triplay.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author renwenpeng
 * @email wp.ren@trip.com
 * @date 2021-07-28 19:49:02
 */
@Data
@TableName("activity_user")
public class ActivityUserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 活动用户关系对的id
     */
    @TableId
    private Integer activityUserId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 活动id
     */
    private Integer activityId;
    /**
     * 用户被邀请的时间
     */
    private Date invitedTime;
    /**
     * 用户加入的时间
     */
    private Date joinTime;
    /**
     * 当前这条记录的状态(被邀请中、待进行、进行中、已结束)
     */
    private Integer status;
}
