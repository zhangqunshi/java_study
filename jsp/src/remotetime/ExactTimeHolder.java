package remotetime;

/**
* remotetime/ExactTimeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ExactTime.idl
* 2007��11��15�� ������ ����08ʱ43��01�� PST
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
