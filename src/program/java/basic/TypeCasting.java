package program.java.basic;

public class TypeCasting {

  public static void main(String[] args) {

    int i=100;
    long l=i;
    System.out.println("long value " + l);
    
    int p =(int) l;
    System.out.println("int value : "+ p);
    
    char t = (char)i;
    System.out.println("Value of char is :" + t);
    
    
    //-----------------------
    
    
    double d=273477373883.373743838746532920;
    
    float f=(float)d;
    System.out.println("Original value of double: "+d);
    System.out.println("When put in float: "+ f);
    
    
    //----------------------------
    
    
    
    double d2=100.04;
    long l2=(long)d2;
    int i2=(int)l2;
    
    System.out.println("Double value : " + d2);
    System.out.println("Converted to long :"+l2);
    System.out.println("Converted to int :"+i2);
    
    
    //-------------------------
    
    float r=l;//  l=100
    System.out.println("float value "+r);
    
    
    //----------------------------
    
    
    byte b;
    int ii=257;
    double dd=323.3432;
    
    System.out.println("Conversion of int to byte.");
    
    b=(byte)ii;
    System.out.println("Int is : "+ii+" In Byte is "+b);
    
    System.out.println("Conversion of double to byte.");
    b=(byte)dd;
    
    System.out.println("dd="+dd+" b="+ b);
    
    
    
    
  }

}