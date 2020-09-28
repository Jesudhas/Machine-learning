package com.dineshkrish.nlp;

import java.util.Properties;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Pipeline {
	
	private static Properties properties;
	private static String propertiesName = "tokenize, ssplit, pos, lemma, ner, parse, sentiment";
	private static StanfordCoreNLP stafordCoreNLP;
   	
	private Pipeline(){
		
	}
	
	static {
		properties = new Properties();
		properties.setProperty("annotators", propertiesName);
	}
	
	public static StanfordCoreNLP getPipeline(){
		
		if(stafordCoreNLP == null){
			stafordCoreNLP = new StanfordCoreNLP(properties);
		}
		return stafordCoreNLP;
		
	}
}

