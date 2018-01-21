
public class Movie {
	int year;
	int price;
	String MovieName;
	public static String Movie_name; // 변하지 않는 일정한 값이나 공용자원에 대한 접근을 효율적으로 하기 위해 static을 사용한다.
	
	// Movie_name이 Member클래스에 사용되는 공용자원이므로 이를 전역변수 형태로 접근 가능하게 하기 위해 static을 사용했다.
	
	Movie(String name, int year, int x){
		Movie.Movie_name = name;
		this.MovieName = name;
		this.year = year;
		this.price = x;
	}
	
	Movie(){
		
	}
	
	void setName(String Movie) {
		this.Movie_name = Movie;
		this.MovieName = Movie;
	}
	
	void setYear(int year) {
		this.year = year;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	String getData() {
		if(MovieName == null && year == 0) {
			return "정보가 없습니다. 초기화시켜주세요";
		}	
		else 
			return "제목 : "+Movie_name+", 년도 : "+year;
	}
	
}
