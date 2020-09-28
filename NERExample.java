package com.dineshkrish.nlp;

import java.util.List;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class NERExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		
		String text = "Hey my name is Jesudhas and I have a friend his name is Robert" + 
						" We both living in Chennai";
		
		CoreDocument coreDocument = new CoreDocument(text);
		
		stanfordCoreNLP.annotate(coreDocument);
		
		List<CoreLabel> coreLabels = coreDocument.tokens();
		
		for(CoreLabel coreLabel : coreLabels){
			String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
			
			System.out.println(coreLabel.originalText()+ " = "+ ner);
			
		}
			
		
	}

}
