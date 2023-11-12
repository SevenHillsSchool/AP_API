# WRAPPER CLASSES
## Bytes (Ethan)
## Short (Ethan)
## Integer (Ethan)
**toString** <br>
*public static String toString​(int i)* <br>
Converts an integer *i* to a String.

Example:
System.out.println(Integer.toString(42)); -> prints "42"


**parseInt** <br>
*public static int parseInt(String s)* <br>
Returns the first integer value found in String *s*.

Example:
System.out.println(Integer.parseInt("ABC12")); -> prints 12


**intValue** <br>
*public static int intValue()* <br>
Converts an instance of the Integer wrapper class to a value of the int data type and returns the converted int value.

Example:
Integer x = new Integer(4);
System.out.println(x.intValue()); -> prints the int 4

**valueOf** <br>
*public static Integer valueOf(int i)* <br>
Converts a integer *i* to an instance of the Integer wrapper class and returns the converted Integer object.

Example:
int x = 4;
System.out.println(Integer.valueOf(x); -> prints the Integer object 4

## Long (Ethan)
**toString** <br>
*public static String toString​(long l)* <br>
Converts a long *l* to a String.

Example:
System.out.println(Long.toString(4)); -> prints "42"


**valueOf**
*public static Long valueOf(long l)*
Converts a long *l* to an instance of the Long wrapper class and returns the converted Long object.

Example:
long l = 42;
System.out.println(Long.valueOf(l)); -> prints the Long object 42

**parseLong** <br>
*public static long parseLong(String s)* <br>
Returns the first long value found in String *s*.

Example:
System.out.println(Long.parseLong("ABC123")); -> prints 123L



## Float Adi
## Double Adi
## Boolean Adi
## Character Adi
