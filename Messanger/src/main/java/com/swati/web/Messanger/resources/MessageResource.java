package com.swati.web.Messanger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.swati.web.Messanger.model.Message;
import com.swati.web.Messanger.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService messageservice=new MessageService();
	@GET
    @Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage(){
	return messageservice.getAllMessages();
}
}
