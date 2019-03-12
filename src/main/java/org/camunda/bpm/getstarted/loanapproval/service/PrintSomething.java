package org.camunda.bpm.getstarted.loanapproval.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class PrintSomething implements JavaDelegate {

	public void execute(DelegateExecution arg0) throws Exception {
		System.out.println("IN Print Something");
	}

	public void goodTask(DelegateExecution arg0) throws Exception {
		System.out.println("IN goodTask");
	}

	public void badTask(DelegateExecution arg0) throws Exception {
		System.out.println("IN badTask");
	}

	public boolean goNoGo() {
		return true;
	}
}
