package database;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import model.Message;
public class DBClass {
	int index=0;
	
	private Map<Integer,Message> messages=new HashMap<Integer,Message>();
	
	public void addMessage(Message m) {
		
		index++;
		messages.put(index, m);
	}
	
	public void removeMessage(int index) {
		
		messages.remove(index);
		index--;
	}
	public Message getMessage(int index) {
		return messages.get(index);
	}
	
public Collection getAllMessages() {
	return messages.values();
}
public void deleteAllMessage() {
	messages.clear();
	
}

public DBClass() {
	super();
}
}
