package org.dpoletti.example.springint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class App {
	//private final static Logger logger = LogManager.getLogger(ProductionESB.class);

	
	public final static String DB_LOG_SUFFIX=" #";
	
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext ctx = new SpringApplication(App.class).run(args);
        Thread shutdownThread = new Thread(new Runnable() {
			@Override
			public void run() {
		        System.out.println("Closing Service...");
				ctx.close();
			}
		});
		
        Runtime.getRuntime().addShutdownHook(shutdownThread);
    }

}