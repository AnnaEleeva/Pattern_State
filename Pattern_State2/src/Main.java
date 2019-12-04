
public class Main {

	public static void main(String[] args) {
		CopyMachine cm=new CopyMachine(2,100);
		cm.SelectDevice(new Device());
		cm.SelectDocument(1);
		cm.Print();
		cm.SelectDocument(1);
		cm.Print();
		cm.SelectDocument(2);
		cm.Print();
		cm.GiveChange();		

	}

}
