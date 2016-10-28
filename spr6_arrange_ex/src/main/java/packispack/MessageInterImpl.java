package packispack;

import otherisother.OutFileInter;

public class MessageInterImpl implements MessageInter{
	private String name1, name2;
	private int year;
	private MyInfo myInfo;
	
	private String spec;
	private OutFileInter inter;
	
	public MessageInterImpl(String name1, String name2, int year, MyInfo myInfo) {
		this.name1 = name1;
		this.name2 = name2;
		this.year = year;
		this.myInfo = myInfo;
	}
	
	public void setSpec(String spec){
		this.spec = spec;
	}
	
	public void setFilePath(OutFileInter inter){
		this.inter = inter;
	}
	
	@Override
	public void sayHi() {
		String msg = name1 +" " + name2 + "\n";
		msg += (2000 +year) + "년";		
		msg += "\n" +  myInfo.myData();
		msg += "\n" +  spec;
				
		System.out.println(msg);
		
		inter.outfile(msg);
	}
}
