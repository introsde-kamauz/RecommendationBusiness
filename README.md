# RecommendationBusiness
Business logic

## Functions
SOAP
wsdl: http://recommendationbusiness.herokuapp.com/?wsdl
- **void addArtist(String name, int uid)**  =>  add artist name to the preferences of the user with that specific id value
- **void removeArtist(String name, int uid)**  =>  remove artist name to the preferences of the user with that specific id value
- **List of Artists recommendedSimilarArtistList(List of Artists)**  =>  recommend a list of similar artists to the ones that the user likes in the preferences
- **List of Events recommendEvents(List of Artists, String origin)**  =>  recommend a list of events of the artists
- **getUserArtists**  =>  get the list of artists corresponding to the specific user preferences
