package pack.business;

import java.util.List;

import pack.model.DaoInter;
import pack.model.ProductDto;

public class ProcessInterImpl implements ProcessInter {
	private DaoInter daoInter;
	
	public ProcessInterImpl(DaoInter daoInter) {
		this.daoInter = daoInter;
	}
	
	@Override
	public void dataShow() {
		List<ProductDto> list = daoInter.selectDataAll();
		
		//출력
		for(ProductDto p:list){
			System.out.println(p.getCode()+ " " +
					p.getSang()+ " " +
					p.getSu()+ " " +
					p.getDan()
		
					);
		}
	}
}
