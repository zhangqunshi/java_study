package remotetime;


/**
* remotetime/ExactTimeHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ExactTime.idl
* 2007年11月15日 星期四 下午08时43分01秒 PST
*/

abstract public class ExactTimeHelper
{
  private static String  _id = "IDL:remotetime/ExactTime:1.0";

  public static void insert (org.omg.CORBA.Any a, remotetime.ExactTime that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static remotetime.ExactTime extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (remotetime.ExactTimeHelper.id (), "ExactTime");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static remotetime.ExactTime read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ExactTimeStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, remotetime.ExactTime value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static remotetime.ExactTime narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof remotetime.ExactTime)
      return (remotetime.ExactTime)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      remotetime._ExactTimeStub stub = new remotetime._ExactTimeStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static remotetime.ExactTime unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof remotetime.ExactTime)
      return (remotetime.ExactTime)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      remotetime._ExactTimeStub stub = new remotetime._ExactTimeStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
