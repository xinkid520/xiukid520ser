package com.liume.xiukid520.Controller;

import com.alibaba.fastjson.JSONObject;
import com.liume.xiukid520.Entity.ImageSource;
import com.liume.xiukid520.Service.ImgSrc.ImgSrcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ImgController {
    @Autowired
    public ImgSrcService imgSrcService;


    @PostMapping(path = "/getImgs")
    @ResponseBody
    public String insertuser(@RequestBody String imgIndex) {
        JSONObject img = JSONObject.parseObject(imgIndex);

        List<ImageSource> imgs = imgSrcService.getAllDate(String.valueOf(img.get("imgIndex")));
        System.out.println(imgs.toString());


//        log.info(user.toString());
//        log.info(IpUtil.getIpAddr(ip));

        return JSONObject.toJSONString(imgs);
    }
}
