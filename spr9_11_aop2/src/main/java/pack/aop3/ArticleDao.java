package pack.aop3;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component // db 처리를 위한 클래스는 가독성을 위해  Repository
@Repository
public class ArticleDao implements ArticleInter{
	@Override
	public void selectAll() {
		System.out.println("sawon 자료 전체 읽기 수행");
		
	}
}
