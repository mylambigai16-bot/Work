package abstra;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

interface SearchByGen{
	public abstract void searchGen(String gen);
}
interface SearchByTitle{
	public abstract void searchTitle(String title);
}
class Catalogue implements SearchByGen,SearchByTitle{
	private static Date lastUpdate;
	private static List<Moviee>MovieList=new ArrayList<Moviee>();
	public void searchTitle(String Title) {
		for(Moviee movie:MovieList) {
			if(movie.getTitle().equals(Title)) {
				movie.getMovieDetail();
			}
		}
	}
	
	private void getMovieDetail() {
		// TODO Auto-generated method stub
		
	}

	private Object getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void searchGen(String gen) {
		for(Moviee movie:MovieList) {
			if(movie.getGen().equalsIgnoreCase(gen)) {
				movie.getMovieDetail();
			}
		}
	}
	
private String getGen() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Moviee {
	
}
		private String name;
		private String des;	
		private int rating;
		private String language;
		private date date;
		private String country;
		private String type;
		
		public void Movie(String name, String des, int rating, String language, Date date, String country, String type) {
			this.name=name;
			this.des=des;
			this.rating=rating;
			this.language=language;
			this.date=date;
			this.country=country;
			this.type=type;
			

	}

}
