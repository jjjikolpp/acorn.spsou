package pack;

import other.MyInfo;
import other.OutFileInter;

public class MessageImpl implements MessageInter{
	private String name1, name2;
	private int year;
	private MyInfo myInfo;
	
	private String spec;
	private OutFileInter inter;
	
	public MessageImpl(String name1, String name2, int year, MyInfo myinfo) { //Constructor injection
		this.name1 = name1;
		this.name2 = name2;
		this.year = year;
		this.myInfo = myinfo;
	}
	
	public void setSpec(String spec) { //setter injection
		this.spec = spec;
	}
	
	public void setInter(OutFileInter inter) {
		this.inter = inter;
	}
	@Override
	public void sayHi() {
		// 출력 담당
		String msg = name1 + " "  + name2 + "\n";
		msg += (2000 + year) + "년";
		msg += "\n" + myInfo.myData();
		msg += "\n고유 기술은 " + spec;
		
		System.out.println(msg);
		
		//메시지를 파일로 출력
		inter.outFile(msg);
	}
}
