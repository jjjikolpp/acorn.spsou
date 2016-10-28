package anno2_auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("sender")
//@component("kbs")
@Scope("singleton")  // @Scope("prototype") // @Scope("session") 
public class Sender implements SenderInter{
	@Override
	public void show(){
		System.out.println("show 메소드 수행");
	}
}
