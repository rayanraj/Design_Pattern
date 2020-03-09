package composite_pattern;

public class App {

	public void showData() {
		
		Component ssd =  new Leaf(4000,"SSD");
		Component keyboard = new Leaf(150,"Keyborad");
		Component monitor = new Leaf(6000,"Monitor");
		Component ram = new Leaf(3000,"RAM");
		Component cpu =  new Leaf(10000,"CPU");
		
		Composite ph = new Composite("Peri");
		Composite cabinet = new Composite("Cabinet");
		Composite motherBoard = new Composite("Mother Board");
		Composite computer = new Composite("Computer");
		
		motherBoard.addComponent(cpu);
		motherBoard.addComponent(ram);
		
		
		ph.addComponent(keyboard);
		ph.addComponent(monitor);
		
		cabinet.addComponent(ssd);
		cabinet.addComponent(motherBoard);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		ram.showPrice();
		ph.showPrice();
		computer.showPrice();
		
		
	}
}
