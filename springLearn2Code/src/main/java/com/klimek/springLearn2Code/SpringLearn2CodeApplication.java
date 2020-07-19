package com.klimek.springLearn2Code;

import org.apache.catalina.core.*;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

@SpringBootApplication
public class SpringLearn2CodeApplication {

	//TODO: vytiahnut AppRun zo Spring containera, aby sme to vedeli pouzit ako bean, nie vytvorit novu instanciu

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
			 SpringApplication.run(SpringLearn2CodeApplication.class, args);

		 AppRun appRun = context.getBean(AppRun.class);
		 appRun.run();


	}

}
