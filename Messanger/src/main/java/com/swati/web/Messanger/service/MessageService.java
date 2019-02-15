package com.swati.web.Messanger.service;

import java.util.ArrayList;
import java.util.List;

import com.swati.web.Messanger.model.Message;

public class MessageService {
public List<Message> getAllMessages(){
       Message m1=new Message(1L,"Hello World","swati");
       Message m2=new Message(2L,"Hello jersey","priti");
       List<Message> list1=new ArrayList<Message>();
       list1.add(m1);
       list1.add(m2);
       return list1;
}
}