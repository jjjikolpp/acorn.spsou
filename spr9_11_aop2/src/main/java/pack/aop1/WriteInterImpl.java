package pack.aop1;

public class WriteInterImpl implements WriteInter {
	
	public WriteInterImpl() {
		System.out.println("WriteInterImpl 생성");
	}
	
	@Override
	public void write() {
//	public void colt() {
		System.out.println("write 수행");
		
	}
}
