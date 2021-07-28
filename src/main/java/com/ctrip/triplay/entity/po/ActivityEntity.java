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
@TableName("activity")
public class ActivityEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 活动id
     */
    @TableId
    private Integer activityId;
    /**
     * 创建用户的id
     */
    private Integer creatorId;
    /**
     * 活动类型
     */
    private Integer type;
    /**
     * 活动名称
     */
    private String name;
    /**
     * 活动简介
     */
    private String summary;
    /**
     * 活动地点
     */
    private String location;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date endTime;
    /**
     * 释放受邀锁定时间
     */
    private Date expireTime;
    /**
     * 活动状态
     */
    private Integer status;
    /**
     * 人数上限
     */
    private Integer participantNumber;
    /**
     * 当前人数
     */
    private Integer currentNumber;
}
