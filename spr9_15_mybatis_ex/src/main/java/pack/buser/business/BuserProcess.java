package pack.buser.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.buser.model.BuserDto;
import pack.buser.model.BuserInter;

@Service
public class BuserProcess implements BuserViewInter{
	@Autowired
	private BuserInter buserInter;
	
	@Override
	public void viewBuserList() {
		List<BuserDto> list = buserInter.selectBuser();
		
		System.out.println("부서벌\t인원수");
		for(BuserDto p : list){
			System.out.println(p.getBuser_name()+"\t"+p.getBuser_count());
		}
	}
}
