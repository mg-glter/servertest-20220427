package other;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtherController {
	@RequestMapping("/other")
	public void other() {
		//자동 뷰 이름 uri 동일 other.jsp 결정
		
	}
}
