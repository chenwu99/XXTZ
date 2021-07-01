package com.example.xxtz.dao;

import com.example.xxtz.domain.Receiver;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ReceiverDao {


    Receiver getByTele(String tele);

}
