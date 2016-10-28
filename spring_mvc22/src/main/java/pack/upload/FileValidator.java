package pack.upload;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
public class FileValidator implements Validator{
	@Override
	public boolean supports(Class<?> arg0) {
		
		return false;
	}
	
	@Override
	public void validate(Object uploadBean, Errors errors) {
		UploadBean bean = (UploadBean)uploadBean;
		
		if(bean.getFile().getSize() == 0 ){
			errors.rejectValue("file", "", "업로드할 파일을 선택하시오");
		}
	}
}
