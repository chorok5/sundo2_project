package servlet.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import servlet.service.ServletService;

@Controller
public class ServletController {
	
	@Resource(name = "ServletService")
	private ServletService servletService;
	
	@RequestMapping(value = "/main.do")
	public String mainTest(ModelMap model) throws Exception {
		System.out.println("main start");
        List<Map<String, Object>> sdList = servletService.selectSD();
        List<Map<String, Object>> sggList = servletService.selectSGG();
        List<Map<String, Object>> bjdList = servletService.selectBJD();
        
        model.addAttribute("sdList", sdList);
        model.addAttribute("sggList", sggList);
        model.addAttribute("bjdList", bjdList);
        
		return "main/main";
	}	
}
