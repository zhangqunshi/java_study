

//: appendixb:ShowMessage.java

public class ShowMessage {
	
	private native void ShowMessage(String msg);

	static {
		System.loadLibrary("MsgImpl");
		// Linux hack, if you can't get your library
		// path set in your environment:
		// System.load("/home/MsgImpl.so");
	}

	public static void main(String[] args) {
		ShowMessage app = new ShowMessage();
		app.ShowMessage("Generated with JNI");
	}
}