package pack.model;

import java.util.List;

public interface SawonInter {
	List<SawonDto> sawonList();			//비지니스 로직에 있는것
	SawonDto getLoginInfo(String id);	//ASPECT에 있는 것 (원래는 따로 만들어야 함)
}
