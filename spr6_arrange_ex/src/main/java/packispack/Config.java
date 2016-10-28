package packispack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import otherisother.OutFileInterImpl;

@Configuration
public class Config {
	@Bean
	public MessageInterImpl my(){
		String name1 = "와";
		String name2 = "우";
		int year = 3;
		MessageInterImpl impl = new MessageInterImpl(name1, name2, year,info());
		
		impl.setSpec("자바 전문가");
		impl.setFilePath(fileout());
		return impl;
	}
	
	@Bean
	public MyInfo info(){
		return new MyInfo();
	}
	
	@Bean
	public OutFileInterImpl fileout(){
		String filePath = "c:/work/good3.txt";
		
		OutFileInterImpl inter = new OutFileInterImpl();
		inter.setFilePath(filePath);
		
		return inter;
	}
}
