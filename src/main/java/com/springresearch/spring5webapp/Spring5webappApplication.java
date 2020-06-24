package com.springresearch.spring5webapp;

import com.springresearch.spring5webapp.controllers.ConstructorInjectedController;
import com.springresearch.spring5webapp.controllers.MyController;
import com.springresearch.spring5webapp.controllers.PropertyInjectedController;
import com.springresearch.spring5webapp.controllers.SetterInjectedController;
import com.springresearch.spring5webapp.examplebeans.FakeDataSource;
import com.springresearch.spring5webapp.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);

		//create controller from the context bean.  Run method directly from controller.
		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());

	}

}
