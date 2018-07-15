package com.jzm.controller;

import com.jzm.dao.MerchandiseMapper;
import com.jzm.model.Merchandise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping("/api")
public class ShopController {

    @Resource
    private MerchandiseMapper merchandiseMapper = null;

    @RequestMapping("/mer")
    public String getMerchandise() {
        return "OK";
    }

}
