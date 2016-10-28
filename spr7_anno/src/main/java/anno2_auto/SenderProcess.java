package anno2_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component // 객체를 생성
@Service("senderProcess")
public class SenderProcess {
	//@Autowired  // type을 통한 맵핑 : 현재 등록된 빈 중에서 Sender class type 객체를 찾아 맵핑
	@Autowired(required=true) // true가 기본 값
	@Qualifier("sender2")  // 동일한 객체에 대한 두 개 이상의 객체명을 구분하고자 할 경우
	private SenderInter senderInter;
	private Sender sender;
	
	/*
	@Autowired
	//public void setSender(Sender sender) {
	public void mbc(Sender sender) {
		this.sender = sender;
	}
	*/
	
	public SenderInter getSender() {
		return senderInter;
	}
	
	public void dispData(){
		senderInter.show();
	}
}
