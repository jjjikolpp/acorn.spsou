package pack.jdbc;

public class BusinessImpl implements BusinessInter{
	private GogekInter gogekInter;
	
	public void setGogekInter(GogekInter gogekInter) {
		this.gogekInter = gogekInter;
	}
	
	@Override
	public void dataList() {
		for(GogekDto s : gogekInter.selectMan()){
			if (s.gogek_gen.equals("남")) {
				System.out.println(s.getGogek_no()+ " " +
						s.getGogek_name()+ " " +
						s.getGogek_tel()+ " " +
						s.getGogek_gen()
						);
				
			}
		}
		
	}
}
