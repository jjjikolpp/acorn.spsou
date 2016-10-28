package pack.aspect;

import org.springframework.stereotype.Component;

@Component
public class SecurityClass {
   public void mySecurity(){
      System.out.println("핵심 로직 수행 전 보안작업 설정");
   }
}