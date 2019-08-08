package com.liume.xiukid520.Controller;

import com.alibaba.fastjson.JSONObject;
import com.liume.xiukid520.Entity.LeaveMessage;
import com.liume.xiukid520.Entity.User;
import com.liume.xiukid520.Service.Msg.MsgService;
import com.liume.xiukid520.Service.User.UserService;
import com.liume.xiukid520.Util.IpUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class MsgController {


    @Autowired
    MsgService msgService;
    @Autowired
    UserService userService;
    private static Logger log = LogManager.getLogger(MsgController.class);

    @PostMapping(path = "/getMsg")
    @ResponseBody
    public String insertuser( HttpServletRequest ip, @RequestBody User user) {
        if (user.getUserName() == null || user.getPassword() == null)
            return "404";
        List<LeaveMessage> msgs = null;
        if (userService.userAuth(user))
            msgs = msgService.getAllDate();

        log.info(user.toString());
        log.info(IpUtil.getIpAddr(ip));

        return JSONObject.toJSONString(msgs);
    }

    @GetMapping(path = "/")
    @ResponseBody
    public String index(HttpServletRequest request) {
        System.out.println("okey");
//


//        log.info(ip);

        return "okey";
    }


    @RequestMapping("/insertMsg")
    public String insertuser(LeaveMessage msg) {
        msgService.saveData(msg);
        List<LeaveMessage> msgs = msgService.getAllDate();

        return JSONObject.toJSONString(msgs);
    }

//    @GetMapping(value = "/user/{id}")
//    public LeaveMessages getuser(@PathVariable("id") Integer id) {
//        LeaveMessages user = msgRepository.findById(id).get();
//        return user;
//    }


}
