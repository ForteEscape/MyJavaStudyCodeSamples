
public class Computer {
	
	String cpu;
	int memory;
	String graphic;
	
	Computer(){//������, �ʵ带 �ѹ��� �ʱ�ȭ�����ش�.
		cpu = "m3";
		memory = 1;
		graphic = "GTX550";
	}
	
	Computer(String cpu, int memory){//this.value�� �ʵ忡 �ִ� ������ �����ϴ� ����̴�.
		this();//�ƹ��͵� �������� �����Ƿ� Computer()�� ȣ���Ѵ�.
		this.cpu = cpu;
		this.memory = memory;
	}
	
	Computer(String cpu, int memory, String graphic){
		this.cpu = cpu;
		this.memory = memory;
		this.graphic = graphic;
	}
	
	String status() {
		return "cpu:"+cpu+",memory:"+memory+",graphic:"+graphic;
	}
	
	int memory_Add(int mem) {
		return memory += mem;
	}

	public static void main(String[] args) {
		Computer com1 = new Computer();
		Computer com2 = new Computer("i7", 8);
		Computer com3 = new Computer("i5", 4, "GTX750Ti");
		
		System.out.println(com1.status());
		System.out.println(com2.status());
		System.out.println(com3.status());
	}

}
