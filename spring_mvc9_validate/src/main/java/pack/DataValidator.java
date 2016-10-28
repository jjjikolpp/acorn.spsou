package pack;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class DataValidator implements Validator{
	
	public boolean supports(Class<?> arg0) {
		//Validator 가 해당 클래스에 대한 값 검증 지원여부 반환
		
		return LoginFormBean.class.isAssignableFrom(arg0);
	}
	
	public void validate(Object target, Errors errors) {
		// target에 대한 검증 지원. 에러 발생 시 Errors 객체에 저장
		LoginFormBean command = (LoginFormBean)target;
		
		//입력 자료 확인
//		System.out.println(command.getUserid() + " " + command.getPasswd());
		
		//입력자료 검증
		//방법 1
		if(command.getUserid() == null || command.getUserid().trim().isEmpty()){
			errors.rejectValue("userid", "err.userid");
		}
		
		//방법 2
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwd", "err.passwd");
	}
}
