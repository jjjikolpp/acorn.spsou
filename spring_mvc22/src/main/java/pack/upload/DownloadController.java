package pack.upload;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DownloadController {
	@RequestMapping("download")
	@ResponseBody
	public byte[] getDownloadfile(HttpServletResponse response,@RequestParam String filename)throws IOException{
//		System.out.println("filename : " + filename);
		File newFile = new File("c:/my/upload/" + filename);
		byte[] bytes = FileCopyUtils.copyToByteArray(newFile);
		
		String fn = new String(newFile.getName().getBytes(), "iso_8859_1"); // 윈도우 
		response.setHeader("Content-Disposition", "attatchment;filename=\"" + fn +"\"");
		response.setContentLength(bytes.length);
		return bytes;
		
	}
}
