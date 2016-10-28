package pack;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageImpl  implements Message, BeanNameAware,
		BeanFactoryAware, DisposableBean,InitializingBean{
	private String mes;
	private String beanName;
	private BeanFactory beanFactory;
	
	public MessageImpl() {
		System.out.println("1) 빈의 생성자 실행");
	}
	public void setMes(String mes) {
		this.mes = mes;
		System.out.println("2) setter 메소드 실행");
	}
	
	@Override
	public void sayHello() {
		System.out.println(mes + beanName + "!!!");
	}
	
	@Override
	public void setBeanName(String beanName) {
		System.out.println("3) 빈이름 설정");
		this.beanName = beanName;
		System.out.println("-->" + beanName);
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4) BeanFactory 설정");
		this.beanFactory = beanFactory;
		System.out.println("-->" + beanFactory);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("6) Propertiey 설정 완료");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("프로그램 종료");
		
	}
	
	private void init(){
		System.out.println("7) 초기화 메소드 실행");
	}
	

}
