package com.liume.xiukid520.Service.Msg;

import com.liume.xiukid520.Entity.LeaveMessage;

import java.util.List;

public interface MsgService {

    public boolean saveData(LeaveMessage msg);

    public List<LeaveMessage> getAllDate();
}
