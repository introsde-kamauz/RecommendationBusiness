package introsde.document.client;
import introsde.experienceadapter.soap.Experience;
import introsde.experienceadapter.soap.ExperienceAdapter;
import introsde.experienceadapter.soap.ExperienceService;
import introsde.recommendationbusiness.soap.RecommendationBusinessLogic;
import introsde.resourceadapter.soap.*;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {
    public static void main(String[] args) throws Exception {
    	/*URL url = new URL("http://10.38.224.129:6901/business?wsdl");
		QName qname = new QName("http://soap.recommendationbusiness.introsde/", "RecommendationService");
        Service service = Service.create(url, qname);
        RecommendationBusinessLogic resource = service.getPort(RecommendationBusinessLogic.class);
        */
    	
    	ResourceService resAdapter = new ResourceService();
    	ResourceAdapterLogic resource = resAdapter.getResourceAdapterLogicImplPort();
    	
    	Preference p = new Preference();
    	Artist a = new Artist();
    	a.setId("44022");
    	a.setName("Metallica");
    	p.setArtistId(a);
    	Person pers = new Person();
    	pers.setUserId("2");
    	pers.setName("Ornella Brol");
    	p.setUserId(pers);
    	resource.removeArtist(p);
        /*
    	ExperienceService expS = new ExperienceService();
    	ExperienceAdapter expA = expS.getExperienceAdapterImplPort();
    	
    	Experience e = expA.getIndications("2018-07-12", "Trento", "Gasoline", "Rovereto");
    	System.out.println(e.getPrecipitations()+" "+e.getDistance()+" "+e.getDuration()+
    			" "+e.getMaxTemperature()+" "+e.getMinTemperature());*/
    }
}