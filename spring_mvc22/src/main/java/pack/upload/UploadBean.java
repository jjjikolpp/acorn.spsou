package pack.upload;

import org.springframework.web.multipart.MultipartFile;

public class UploadBean {		//FormBean
	private MultipartFile file;
	
	public MultipartFile getFile(){
		return file;
	}
	
	public void setFile(MultipartFile file) {
		this.file = file;
	}

}
