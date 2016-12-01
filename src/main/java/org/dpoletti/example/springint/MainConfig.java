package org.dpoletti.example.springint;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.context.IntegrationFlowContext;

@Configuration
public class MainConfig {


	@Autowired
	private IntegrationFlowContext intContext;
	
	
	@Value("${readingDir}")
	private String readingDir;
	
	public static final long ON_ERROR_RETRY_AFTER_DEFAULT_VALUE=10000;

	public static final long RETRASMIT_AFTER_DEFAULT_VALUE = 5;
	
	public static Map<String, FileDispatcher> dispatcherMap;
	
	@PostConstruct
	private void initDispatchers() throws Exception{
		
		FileDispatcher f = new FileDispatcher(readingDir);
		f.initDispatcher(intContext);
	}
		









}
