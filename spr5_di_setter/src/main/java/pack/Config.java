package pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config { // meta xml file 대신 class로 환경 설정
	@Bean
	public MyProcess my(){
		MyProcess myProcess = new MyProcess();
		myProcess.setGugudan(gugu());
		myProcess.setDan(7);
		myProcess.setName("신기한");
		return myProcess;
	}
	
	@Bean
	public Gugudan gugu(){
		return new Gugudan();
	}
}
