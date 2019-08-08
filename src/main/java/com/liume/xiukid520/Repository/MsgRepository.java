package com.liume.xiukid520.Repository;

import com.liume.xiukid520.Entity.LeaveMessage;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MsgRepository extends JpaRepository<LeaveMessage, Integer> {

}
