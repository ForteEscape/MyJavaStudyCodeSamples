
public class Member {
	
	String memberName;
	String Id;
	String Movie_name;
	
	Member(String name, String Id){
		this.memberName = name;
		this.Id = Id;
	}
	
	Member(String name, String Id, Movie Movie_name){
		this.memberName = name;
		this.Id = Id;
		this.Movie_name = Movie.Movie_name;
	}
	
	void setMovie(Movie Movie_name) {
		this.Movie_name = Movie.Movie_name;
	}
	
	String getMemberData() {
		if(Movie_name == null) {
			return "�̸� : "+memberName+", ���̵� : "+Id;
		}
		return "�̸� : "+memberName+", ���̵� : "+Id+", ��ȭ : "+Movie_name;
	}
	
}
