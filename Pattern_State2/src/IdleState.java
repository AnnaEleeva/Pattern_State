
public class IdleState extends BaseState{
	public  void Print(CopyMachine copyMachine)
    {
        try {
			throw new Exception("Device not selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public  void SelectDocument(CopyMachine copyMachine, int document)
    {
        try {
			throw new Exception("Device not selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
