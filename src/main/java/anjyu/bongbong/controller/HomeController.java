package anjyu.bongbong.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import anjyu.bongbong.service.HomeService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	@RequestMapping(value="")
    public ModelAndView Home(ModelAndView mv) throws Exception{
        log.debug("홈 컨트롤러 시작");
        
        List<Map<String, Object>> AllList = homeService.selectAllList();
        mv.addObject("Alllist", AllList);
        mv.setViewName("home");
        
        log.debug("홈 컨트롤러 종료");
        return mv;
    }
}
