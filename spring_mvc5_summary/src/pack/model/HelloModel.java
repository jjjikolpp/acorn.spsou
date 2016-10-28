package pack.model;

import java.util.Calendar;

public class HelloModel {
	public String getGreeting(){
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(hour >= 6 && hour <= 10){
			return "좋은 아침 입니다";
		}else if(hour >= 12 && hour <= 15){
			return "점심은 맛있게 드셨나요?";
		}else if(hour >= 18 && hour <= 22){
			return "좋은 저녁되세요";
		}else{
			return "안녕하세요";
		}
		
	}
}
