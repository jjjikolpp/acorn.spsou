package otherisother;

import java.io.FileWriter;

public class OutFileInterImpl implements OutFileInter{
	private String filePath;
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	@Override
	public void outfile(String msg) {
		try {
			FileWriter writer = new FileWriter(filePath);
			writer.write(msg);
			writer.close();
			System.out.println("파일 저장성공!");
			
		} catch (Exception e) {
			System.out.println("outfile err : " + e);
		}
		
	}
}
