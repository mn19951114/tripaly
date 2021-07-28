package com.ctrip.triplay.controller;

import com.ctrip.triplay.dao.MemberDao;
import com.ctrip.triplay.entity.po.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("member")
public class MemberController {
    @Resource
    private MemberDao memberDao;
    @GetMapping("/get")
    public Member get(){
        return this.memberDao.selectById(1);
    }
}
