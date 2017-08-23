import remotetime.*;
import org.omg.CosNaming.*;
import org.omg.CORBA.*;

public class RemoteTimeClient {
	
	// Throw exceptions to console:
	public static void main(String[] args) throws Exception {
		// ORB creation and initialization:
		ORB orb = ORB.init(args, null);
		
		// Get the root naming context:
		org.omg.CORBA.Object objRef = orb
				.resolve_initial_references("NameService");
		NamingContext ncRef = NamingContextHelper.narrow(objRef);
		
		// Get (resolve) the stringified object
		// reference for the time server:
		NameComponent nc = new NameComponent("ExactTime", "");
		NameComponent[] path = { nc };
		ExactTime timeObjRef = ExactTimeHelper.narrow(ncRef.resolve(path));
		
		// Make requests to the server object:
		String exactTime = timeObjRef.getTime();
		System.out.println(exactTime);
	}
}