package spring_mvc17_xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="msg-list") // root element
public class XmlMessageList {
	@XmlElement(name="msg") // element name
	private List<XmlMessage> messages;
	
	public XmlMessageList() {
		// TODO Auto-generated constructor stub
	}
	
	public XmlMessageList(List<XmlMessage> messages) {
		this.messages = messages;
	}
	
	public List<XmlMessage> getMessages() {
		return messages;
	}
}
