package com.example.xxtz.dao;

import com.example.xxtz.domain.Receiver;
import com.example.xxtz.domain.Sender;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SenderDao {

    boolean insertSender(Sender sender);

    Sender getByTele(String tele);


}
