package replica_friendly_end;


/**
* replica_friendly_end/stringsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Jerem/Source/Repos/SOEN423_Project/Jeremy_Replica/src/FlightReservationServer.idl
* Wednesday, November 16, 2016 12:54:47 AM EST
*/

public final class stringsHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public stringsHolder ()
  {
  }

  public stringsHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = replica_friendly_end.stringsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    replica_friendly_end.stringsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return replica_friendly_end.stringsHelper.type ();
  }

}
