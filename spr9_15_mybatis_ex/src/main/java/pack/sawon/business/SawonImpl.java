package pack.sawon.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pack.sawon.model.DaoInter;
import pack.sawon.model.SawonDto;

@Service
public class SawonImpl implements ProcessInter{
	@Autowired
	private DaoInter daoInter;
	
	/*public SawonImpl(DaoInter daoInter) {
		this.daoInter = daoInter;
	}*/
	
	@Override
	public void viewSawonAll() {
		List<SawonDto> list = daoInter.selectSawonAll();
		
		System.out.println("사번\t이름\t부서명\t입사년");
		for(SawonDto p : list){
			System.out.println(p.getSawon_no()+ "\t" +
					p.getSawon_name()+ "\t" +
					p.getBuser_name()+ "\t" +
					p.getSawon_ibsail().substring(0,4)
					);
		}
	}
}
