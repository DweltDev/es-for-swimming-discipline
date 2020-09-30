package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	kSession.getAgenda().getAgendaGroup( "meta-pravila" ).setFocus();
        	kSession.getAgenda().getAgendaGroup( "fizicke-karakteristike" ).setFocus();
        	kSession.getAgenda().getAgendaGroup( "tehnika-karakteristike" ).setFocus();
        	kSession.getAgenda().getAgendaGroup( "maraton" ).setFocus();
        	kSession.getAgenda().getAgendaGroup( "triatlon" ).setFocus();


            Plivac a = new Plivac();
            
           //set karakteristike plivaca;
            a.setEksplozivan(true);
           
            //Unosenje cinjenica u radnu memoriju
            kSession.insert( a );
            
            //Pokretanje ES
            kSession.fireAllRules();
            System.out.println(a);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
