package introsde.recommendationbusiness.soap;
import introsde.experienceadapter.soap.*;
import introsde.resourceadapter.soap.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

//Service Implementation

@WebService(endpointInterface = "introsde.recommendationbusiness.soap.RecommendationBusinessLogicImpl", serviceName="RecommendationService")
public class RecommendationBusinessLogicImpl implements RecommendationBusinessLogic {

	@Override
	public void addArtist(String name, int uid) throws MalformedURLException {
		
		// SOAP CALL: getArtistExternalId(name)
		// SOAP CALL: getPersonById(uid)
		// SOAP CALL: addArtist(pref)
		
		try {
			System.out.println("Resource adapter -> addArtist");
			ResourceService resS = new ResourceService();
			ResourceAdapterLogic resource = resS.getResourceAdapterLogicImplPort();
			
			int aid = resource.getArtistExternalId(name);
			
			Preference pref = new Preference();
			pref.setUserId(String.format("%s", uid));
			pref.setArtistId(String.format("%s", aid));
			pref.setArtistName(name);
			System.out.println("Resource adapter -> addArtist");
			resource.addArtist(pref);
		} catch (Exception err) {
			err.printStackTrace();
		}
		
	}

	@Override
	public void removeArtist(String name, int uid) throws MalformedURLException {
		
		// SOAP CALL: getArtistExternalId(name)
		// SOAP CALL: getPersonById(uid)
		// SOAP CALL: remArtist(pref)
		
		try {
			ResourceService resS = new ResourceService();
			ResourceAdapterLogic resource = resS.getResourceAdapterLogicImplPort();
			
			int aid = resource.getArtistExternalId(name);
			
			Preference pref = new Preference();
			pref.setArtistId(String.format("%s", aid));
			pref.setUserId(String.format("%s", uid));
			pref.setArtistName(name);
			resource.removeArtist(pref);
		} catch (Exception err) {
			err.printStackTrace();
		}
		
	}

	@Override
	public List<Artist> getRecomSimilarArtists(List<Artist> artists) throws MalformedURLException {
		
		// SOAP CALL: getRecommendedSimilarArtist(a)
		
		List<Artist> artistList = new ArrayList<Artist>();
		try {
	        ResourceService resS = new ResourceService();
			ResourceAdapterLogic resource = resS.getResourceAdapterLogicImplPort();
			
			for(Artist a : artists) {
				// artistList.add(getRecommendedSimilarArtists(a));
				List<Artist> simil = resource.getRecommendedSimilarArtists(a.getId());
				System.out.println(a.getId()+"  "+simil.size());
				artistList.addAll(simil);
			}
		} catch (Exception err) {
			err.printStackTrace();
		}
		System.out.println("ARTSIZE: "+artistList.size());
		return artistList;
	}

	@Override
	public List<Event> getRecomEvents(List<Artist> artists, String origin) throws MalformedURLException {
		/*
		
		 Merge Event list of the adapters
		 
		*/
		// SOAP CALL: recommendEvents(id)
		// SOAP CALL: getEventInfo(e)
		List<Event> eventList = new ArrayList<Event>();
		try {
			System.out.println("getRecomEvents");
			ResourceService resS = new ResourceService();
			ResourceAdapterLogic resource = resS.getResourceAdapterLogicImplPort();
			
	        ExperienceService expS = new ExperienceService();
			ExperienceAdapter resource2 = expS.getExperienceAdapterImplPort();
			
			for(Artist a : artists) {
				List<Event> ev = resource.recommendEvents(a.getId());
				System.out.println("EVENT: "+ev.size());
				if (ev != null) {
					eventList.addAll(ev);
					System.out.println(ev.size());
				}
			}
			
			for(Event e : eventList) {
				// SOAP CALL: getEventInfo(e)
				Experience esp = resource2.getIndications(e.getStartdate(), e.getCity(), e.getVenue(), origin);
				if (esp != null) {
					System.out.println("ESP distance"+esp.getDistance());
					System.out.println("ESP duration"+esp.getDuration());
					
					e.setDistance(esp.getDistance());
					e.setDuration(esp.getDuration());
					e.setPrecipitations(esp.getPrecipitations().toString());
					e.setMaxTemperature(esp.getMaxTemperature());
					e.setMinTemperature(esp.getMinTemperature());
					System.out.println("NOME "+e.getName());
				}
			}
		} catch (Exception err) {
			err.printStackTrace();
		}
		System.out.println(eventList.size());
		return eventList;
	}

	@Override
	public List<Artist> getUserArtists(Integer id) {
		
		// SOAP CALL: getProfilePreferences(p)
		// SOAP CALL: getArtistName(artistId)
		
		URL url;
		List<Artist> artists = new ArrayList<Artist>();
		try {
			ResourceService resS = new ResourceService();
			ResourceAdapterLogic resource = resS.getResourceAdapterLogicImplPort();
			
			System.out.println("ID: "+id.toString());
			List<Preference> preferences = resource.getProfilePreferences(id.toString());
			System.out.println("PREFERENCES: "+preferences);
			
			for (Preference p : preferences) {
				Artist a = new Artist();
				a.setId(p.getArtistId());
				a.setName(p.getArtistName());
				artists.add(a);
			}
			System.out.println("GetUserArtists");
			System.out.println(artists.size());
			return artists;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return artists;
		
	}
	
}