
public class Movie {
	int year;
	int price;
	String MovieName;
	public static String Movie_name; // ������ �ʴ� ������ ���̳� �����ڿ��� ���� ������ ȿ�������� �ϱ� ���� static�� ����Ѵ�.
	
	// Movie_name�� MemberŬ������ ���Ǵ� �����ڿ��̹Ƿ� �̸� �������� ���·� ���� �����ϰ� �ϱ� ���� static�� ����ߴ�.
	
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
			return "������ �����ϴ�. �ʱ�ȭ�����ּ���";
		}	
		else 
			return "���� : "+Movie_name+", �⵵ : "+year;
	}
	
}
