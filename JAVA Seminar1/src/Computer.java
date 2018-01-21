
public class Computer {
	
	String cpu;
	int memory;
	String graphic;
	
	Computer(){//생성자, 필드를 한번에 초기화시켜준다.
		cpu = "m3";
		memory = 1;
		graphic = "GTX550";
	}
	
	Computer(String cpu, int memory){//this.value는 필드에 있는 변수에 접근하는 기능이다.
		this();//아무것도 적혀있지 않으므로 Computer()를 호출한다.
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
