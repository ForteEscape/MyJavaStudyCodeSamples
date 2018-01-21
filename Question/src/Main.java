
public class Main {

	public static void main(String[] args) {
		
		Movie hp = new Movie("해리포터", 1996, 2000);
		Movie ring = new Movie();
		Member limzz = new Member("임진하", "limzz");
		Member sexboy = new Member("김두수", "sexboy", hp);
		
		System.out.println("*****hp의 내용*****");
		System.out.println(hp.getData());
		System.out.println("*****ring의 내용*****");
		System.out.println(ring.getData());
		System.out.println("*****limzz의 내용*****");
		System.out.println(limzz.getMemberData());
		System.out.println("*****sexboy의 내용*****");
		System.out.println(sexboy.getMemberData());
		
		ring.setName("반지의 제왕");
		ring.setPrice(19800);
		ring.setYear(1999);
		limzz.setMovie(ring);
		
		System.out.println("*****hp의 내용*****");
		System.out.println(hp.getData());
		System.out.println("*****ring의 내용*****");
		System.out.println(ring.getData());
		System.out.println("*****limzz의 내용*****");
		System.out.println(limzz.getMemberData());
		System.out.println("*****sexboy의 내용*****");
		System.out.println(sexboy.getMemberData());

	}

}
