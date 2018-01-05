package rest.mesages.msgservice;
import database.DBClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Message;

@Path("/messages")

public class MessageService {
	
ArrayList<Message> msg = new ArrayList<Message>();
	DBClass db=new DBClass();
	
	
	
	public MessageService() {
		db.addMessage(new Message(1,"hello"));
		db.addMessage(new Message(2,"ello"));
		
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public  ArrayList<Message> getMessaages(){
		
		
		
				
				for(Object o:db.getAllMessages()) {
					msg.add((Message)o);
				}
				return msg;
					
	}
	
	@GET
	@Path("/{msgid}")
	@Produces(MediaType.APPLICATION_XML)
	public Message test(@PathParam("msgid")int msgid) {
		
		
		
		return db.getMessage(msgid);
	}
	
	
	

}
