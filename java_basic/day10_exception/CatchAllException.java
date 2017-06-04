class ABException extends Exception {}
class XYException extends Exception {}


class CatchAllException {
	
	public static void f() throws ABException, XYException {		
		if (true) {
			throw new ABException();
		} else {
			throw new XYException();
		}
	}
	
	public static void main(String[] args) {
		
		try {
			f();
			//g();
		} catch (ABException e) {
			e.printStackTrace();
		} catch (XYException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			f();
		} catch (ABException e) {
			e.printStackTrace();
		} catch (XYException e) {
			e.printStackTrace();
		}
		
	}
}