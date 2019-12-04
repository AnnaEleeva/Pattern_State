
public class CopyMachine {
	public int PricePerDocument;
    public IState State;
    public int MoneyCount;
    public Device SelectedDevice;
    public int SelectedDocument;

    public CopyMachine(int pricePerDocument,int money)
    {
        PricePerDocument = pricePerDocument;
        State = new IdleState();
        MoneyCount = money;
    }

    public void AddMoney(int count) {State.AddMoney(this, count);}

    public void SelectDevice(Device device) { State.SelectDevice(this, device);}

    public void SelectDocument(int document) {State.SelectDocument(this, document);}

    public void Print() { State.Print(this);}

    public void GiveChange() { System.out.println( State.GiveChange(this));}

}
