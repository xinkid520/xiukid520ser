package com.liume.xiukid520.Service.Msg;

import com.liume.xiukid520.Entity.LeaveMessage;
import com.liume.xiukid520.Repository.MsgRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsgServiceImpl implements MsgService {

    @Autowired
    MsgRepository msgRepository;

    private static Logger log = LogManager.getLogger(MsgServiceImpl.class);

    @Override
    public boolean saveData(LeaveMessage msg) {
        boolean flag = false;
        if (msgRepository.save(msg) != null)
            flag = true;
        return flag;
    }

    @Override
    public List<LeaveMessage> getAllDate() {

        return msgRepository.findAll();
    }
}
