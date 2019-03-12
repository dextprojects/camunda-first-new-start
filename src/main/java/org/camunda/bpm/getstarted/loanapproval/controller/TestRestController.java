package org.camunda.bpm.getstarted.loanapproval.controller;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBPM")
public class TestRestController {

	@Autowired
	private RuntimeService runtimeService;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	private void testBpm() {
		System.out.println("HERE");
		runtimeService.startProcessInstanceByKey("loanApproval");
	}
}
