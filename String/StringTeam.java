/*Jasper and Chinmay

-.equals();
  -compares two string values to each other
    - String str = "cheese";
      String s1 = str;
      s1.equals(str);
        -returns true, because the comparison that str is the same as s1 is true, hence the return statement

-str.length();
  -Determines the length of a given string
    -String str = "hello";
     str.length(str);
    returns 5; //even though it returns an integer value, the string is the one doing the "work";

-str.substring();
  -A subset of a given string
    -String str = "world";
     str.substring(1,4);
     return "orl", because the index starts at 1(o), and goes to but not inclduing 4(d), hence "orl"

     -String str = "snake";
     str.substring(2);
     returns "ake", because if there is only one int in the (), then that means it starts from of the string that matches the int(s0,n1,a2,k3,e4)

  -str.indexOf();
    -Determines the index of certain char in a string/beginning of a string in a sentence
      -String string =  "String cheese is good";
       System.out.println(string.indexOf("cheese"));
       return 7; even though is int, string doing "work"// EVERYTHING must be counted for (spaces, punc., etc)
//Chinmay- 11/11
  -str.toUpperCase() & str.toLowerCase();
    -Changes all the character in a string to all caps or to all lowercase letters
      String str = "Strong";
      str.toUpperCase(str);
      Result should print out "STRONG"
      if it was toLowerCase(str); result should be "strong"

      str.replace()
        -replaces chars of a string with new chars that aare in the () of the replace
           "mesquite in your cellar".replace('e', 'o')
         returns "mosquito in your collar"

  -str.intern()
    - it does a check, where if two strings are the same, then it will return the string, but if not, then it will get added as a reference
    -String s1=new String("hello");
     String s2="hello";
     String s3=s1.intern();//returns string from pool, now it will be same as s2.

  -

*/

      
