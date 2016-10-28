package pack;

public class BusinessImpl implements BusinessInter{
	private SangpumInter sangpumInter;
	
	public void setSangpumInter(SangpumInter sangpumInter) {
		this.sangpumInter = sangpumInter;
	}
	
	@Override
	public void dataList() {
		sangpumInter.selectList();
		
	}
}
