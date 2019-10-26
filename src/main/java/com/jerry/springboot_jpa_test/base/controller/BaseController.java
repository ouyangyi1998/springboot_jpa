package com.jerry.springboot_jpa_test.base.controller;

import com.jerry.springboot_jpa_test.base.utils.StateParameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;

import java.util.UUID;

public class BaseController {
    protected final String success= StateParameter.SUCCESS;
    protected final String fail=StateParameter.FAULT;

    protected final Logger logger= LoggerFactory.getLogger(this.getClass());

    public ModelMap getModelMap(String status,Object data,String msg)
    {
        ModelMap modelMap=new ModelMap();
        modelMap.put("status",status);
        modelMap.put("data",data);
        modelMap.put("msg",msg);
        return modelMap;
    }
    public String getUuid()
    {
        String uuid= UUID.randomUUID().toString();
        uuid=uuid.replace("-","");
        return uuid;
    }


}
