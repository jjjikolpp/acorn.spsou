package pack.aop2;

public class ArticleDao implements ArticleInter{
	@Override
	public void selectAll() {
		System.out.println("sawon 자료 전체 읽기 수행");
		
	}
}
