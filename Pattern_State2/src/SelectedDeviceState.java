
public class SelectedDeviceState extends BaseState{
	 public  void Print(CopyMachine copyMachine)
     {
         try {
			throw new Exception("Document not selected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }

     public  void SelectDocument(CopyMachine copyMachine, int document)
     {
         if (document < 0 || copyMachine.SelectedDevice.DocumentCount <= document)
             throw new IndexOutOfBoundsException("Invalid document");
         copyMachine.SelectedDocument = document;
         copyMachine.State = new SelectedDocumentState();
     }

}
