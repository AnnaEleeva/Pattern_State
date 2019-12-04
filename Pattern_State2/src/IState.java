
public interface IState {
	void AddMoney(CopyMachine copyMachine, int count);
    void SelectDevice(CopyMachine copyMachine, Device device);
    void SelectDocument(CopyMachine copyMachine, int document);
    void Print(CopyMachine copyMachine);
    int GiveChange(CopyMachine copyMachine);
}
