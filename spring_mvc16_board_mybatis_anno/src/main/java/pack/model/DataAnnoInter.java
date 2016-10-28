package pack.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pack.controller.DataBean;

public interface DataAnnoInter {
	@Select("select * from annoboard order by gnum desc,onum asc limit #{startRow},#{endRow}")
	public List<DataDto> selectAllData(PagingBean bean);
	
	@Select("select * from annoboard where num=#{num}")
	public DataBean selectOne(String num);
	
	@Insert("insert into annoboard(author,title,content,gnum) values(#{author}, #{title}, #{content}, #{gnum})")
	public boolean write(DataBean bean);
	
	@Update("update annoboard set readcnt = (readcnt+1) where num=#{num}")
	public void readcntUp(String num);
	
	@Update("update annoboard set author=#{author}, title=#{title}, content=#{content} where num=#{num}")
	public boolean updateOk(DataBean bean);
	
	@Select("select * from annoboard where author like concat('%',#{searchValue},'%') order by num desc")
	public List<DataDto> authorSearch(String searchValue);
	
	@Select("select * from annoboard where title like concat('%',#{searchValue},'%') order by num desc")
	public List<DataDto> titleSearch(String searchValue);
	
	@Delete("delete from annoboard where num=#{num}")
	public boolean delete(String num);
	
	@Select("select count(num)as num from annoboard")
	public int getBoardCount();
	
	@Select("select ifnull(max(num), 0)as gnum from annoboard")
	public int getGnum();
	
	@Insert("insert into annoboard(author,title,content,gnum,onum,nested) values(#{author}, #{title}, #{content}, #{gnum}, #{onum}, #{nested})")
	public boolean replay(DataBean bean);
	
	@Update("update annoboard set onum = (onum+1) where gnum=#{gnum}")
	public void onumUp(DataBean bean);
}
