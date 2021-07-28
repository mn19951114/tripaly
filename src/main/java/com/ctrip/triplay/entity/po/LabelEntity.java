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
@TableName("label")
public class LabelEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 标签ID
     */
    @TableId
    private Integer lableId;
    /**
     * 标签名称
     */
    private String labelName;
    /**
     * 标签大类
     */
    private Integer labelType;
}
