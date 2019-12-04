
public class SelectedDocumentState extends BaseState {
	public  void SelectDocument(CopyMachine copyMachine, int document)
    {
        if (document < 0 || copyMachine.SelectedDevice.DocumentCount <= document)
            throw new IndexOutOfBoundsException("Invalid document");
        copyMachine.SelectedDocument = document;
    }

    public void Print(CopyMachine copyMachine)
    {
        if (copyMachine.MoneyCount < copyMachine.PricePerDocument)
        {
            try {
				throw new Exception("Not enough money");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	//System.out.println("Not enough money");
        	//return;
        }

        copyMachine.MoneyCount -= copyMachine.PricePerDocument;
        System.out.println(copyMachine.SelectedDevice.GetDocument(copyMachine.SelectedDocument));
        copyMachine.State = new SelectedDeviceState();
    }

}
