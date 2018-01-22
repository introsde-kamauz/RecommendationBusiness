package introsde.recommendationbusiness.soap;
import java.net.MalformedURLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import introsde.resourceadapter.soap.*;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface RecommendationBusinessLogic {
	
	// 1
	@WebMethod(operationName="addArtist")
    @WebResult(name="addArtist") 
	public void addArtist(String name, int uid) throws MalformedURLException;
	
	// 2
	@WebMethod(operationName="removeArtist")
	@WebResult(name="removeArtist") 
	public void removeArtist(String name, int uid) throws MalformedURLException;
	
	// 3
	@WebMethod(operationName="getRecommendedSimilarArtists")
	@WebResult(name="recommendedSimilarArtistList") 
	public List<Artist> getRecomSimilarArtists(List<Artist> artists) throws MalformedURLException;
	
	// 4
	@WebMethod(operationName="recommendEvents")
	@WebResult(name="recommendEventsList") 
	public List<Event> getRecomEvents(List<Artist> artists, String origin) throws MalformedURLException;
	
	// 5
	@WebMethod(operationName="getUserArtists")
	@WebResult(name="getUserArtists") 
	public List<Artist> getUserArtists(Integer id);
	
}