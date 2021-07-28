package com.ctrip.triplay.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("member")
public class Member implements Serializable {
    @TableId
    private Integer id;
    private String name;
}
