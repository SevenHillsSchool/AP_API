# WRAPPER CLASSES
## Integer (Ethan)
**toString** <br>
*public static String toString​(int i)* <br>
Converts an integer *i* to a String.

Example:
System.out.println(Integer.toString(42)); -> prints "42" <br>


**parseInt** <br>
*public static int parseInt(String s)* <br>
Returns the first integer value found in String *s*.

Example:
System.out.println(Integer.parseInt("ABC12")); -> prints 12 <br><br>


**intValue** <br>
*public static int intValue()* <br>
Converts an instance of the Integer wrapper class to a value of the int data type and returns the converted int value.

Example:
Integer x = new Integer(4);
System.out.println(x.intValue()); -> prints the int 4 <br><br>


**valueOf** <br>
*public static Integer valueOf(int i)* <br>
Converts a integer *i* to an instance of the Integer wrapper class and returns the converted Integer object.

Example:
int x = 4;
System.out.println(Integer.valueOf(x); -> prints the Integer object 4 <br><br>


## Long (Ethan)
**toString** <br>
*public static String toString​(long l)* <br>
Converts a long *l* to a String.

Example:
System.out.println(Long.toString(42)); -> prints "42" <br><br>


**valueOf**
*public static Long valueOf(long l)*
Converts a long *l* to an instance of the Long wrapper class and returns the converted Long object.

Example:
long l = 42;
System.out.println(Long.valueOf(l)); -> prints the Long object 42 <br><br>


**parseLong** <br>
*public static long parseLong(String s)* <br>
Returns the first long value found in String *s*.

Example:
System.out.println(Long.parseLong("ABC123")); -> prints 123L <br><br>



## Double (Adi)
**compareTo** <br>
*public int compareTo(Double anotherDouble)* <br>
Compares this Double and *anotherDouble* and returns an int. Returns 0 if *anotherDouble* == this Double, a negative number if this Double < *anotherDouble*, or a positive number if this Double > *anotherDouble*.

Example:
Double num = 4.0;
System.out.println(num.compareTo(4.0)); -> prints 0


**parseDouble** <br>
*public static double parseDouble(String s)* <br>
Returns the first Double value found in String *s*.

Example:
System.out.println(Double.parseDouble("at98.533hy")); -> prints 98.533


**valueOf** <br>
*public static Double valueOf(double d)* <br>
Converts a double *d* to an instance of the Double wrapper class and returns the converted Double object.

Example:
double d = 6.45;
System.out.println(Double.valueOf(d)); -> prints 6.45


**toString** <br>
*public String toString()* <br>
Converts a double *d* to a String.

Example:
System.out.println(Double.toString(586.45)); -> prints "586.45"



## Boolean (Adi)
**valueOf** <br>
*public static Boolean valueOf(boolean b)* <br>
Converts a boolean *b* to an instance of the Boolean wrapper class and returns the converted Boolean object.

Example:
boolean b = true;
System.out.println(Boolean.valueOf(b)); -> prints true


**parseBoolean** <br>
*public static boolean parseBoolean(String s)* <br>
Returns true if the value of String *s* == "true" (ignoring cases).

Example:
System.out.println(Boolean.parseBoolean("at98.533hy")); -> prints 98.533


**toString** <br>
*public String toString()* <br>
Converts a boolean *b* to a String.

Example:
System.out.println(Boolean.toString(true)); -> prints "true"

## Character (Adi)
**valueOf** <br>
*public static Character valueOf(char c)* <br>
Converts a char *c* to an instance of the Character wrapper class and returns the converted Character object.

Example:
char c = 'y';
System.out.println(Character.valueOf(c)); -> prints "y"


**toString** <br>
*public String toString()* <br>
Converts a char *c* to a String.

Example:
System.out.println(Character.toString('w')); -> prints "w"
