
public class Main {

	public static void main(String[] args) {
		
		Movie hp = new Movie("�ظ�����", 1996, 2000);
		Movie ring = new Movie();
		Member limzz = new Member("������", "limzz");
		Member sexboy = new Member("��μ�", "sexboy", hp);
		
		System.out.println("*****hp�� ����*****");
		System.out.println(hp.getData());
		System.out.println("*****ring�� ����*****");
		System.out.println(ring.getData());
		System.out.println("*****limzz�� ����*****");
		System.out.println(limzz.getMemberData());
		System.out.println("*****sexboy�� ����*****");
		System.out.println(sexboy.getMemberData());
		
		ring.setName("������ ����");
		ring.setPrice(19800);
		ring.setYear(1999);
		limzz.setMovie(ring);
		
		System.out.println("*****hp�� ����*****");
		System.out.println(hp.getData());
		System.out.println("*****ring�� ����*****");
		System.out.println(ring.getData());
		System.out.println("*****limzz�� ����*****");
		System.out.println(limzz.getMemberData());
		System.out.println("*****sexboy�� ����*****");
		System.out.println(sexboy.getMemberData());

	}

}
