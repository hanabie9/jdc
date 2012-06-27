package net.daum.search.jdcproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DaumController {

	private static final Logger logger = LoggerFactory.getLogger(DaumController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView start() {

		logger.info("start");

		return new ModelAndView("index");
	}
}
