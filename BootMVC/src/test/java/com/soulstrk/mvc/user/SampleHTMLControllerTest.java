package com.soulstrk.mvc.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.soulstrk.mvc.Tem.SampleController;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)

public class SampleHTMLControllerTest {
	
	@Autowired
	WebClient wc;
	
	@Test
	public void hello() throws Exception{
		HtmlPage page = wc.getPage("/hello");
		HtmlHeading1 h1 = page.getFirstByXPath("//h1");
		assertThat(h1.getTextContent()).isEqualToIgnoringCase("keesun");
		
	}
	
}
