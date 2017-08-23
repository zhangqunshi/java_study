package remotetime;

/**
* remotetime/ExactTimeHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ExactTime.idl
* 2007年11月15日 星期四 下午08时43分01秒 PST
*/

public final class ExactTimeHolder implements org.omg.CORBA.portable.Streamable
{
  public remotetime.ExactTime value = null;

  public ExactTimeHolder ()
  {
  }

  public ExactTimeHolder (remotetime.ExactTime initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = remotetime.ExactTimeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    remotetime.ExactTimeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return remotetime.ExactTimeHelper.type ();
  }

}
