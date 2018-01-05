package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	int id;
	String body;
	public Message() {
		super();
	}
	public Message(int id, String body) {
		super();
		this.id = id;
		this.body = body;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", body=" + body + "]";
	}
	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}
	public String getBody() {
		return body;
	}
	@XmlElement
	public void setBody(String body) {
		this.body = body;
	}

}
