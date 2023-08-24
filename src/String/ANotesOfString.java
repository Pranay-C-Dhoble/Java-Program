package String;

//Definition: A string is a sequence of characters.
//In Java, objects of String are immutable which means a constant and cannot be changed once created.
//String objects are stored in a special memory area known as String Constant Pool.
//String is a final class in java.lang package.
//String class is immutable, so that once it is created a String object cannot be changed.
//If there is a necessity to make a lot of modifications to Strings of characters, then you should use String Buffer & String Builder Classes.


//How many ways we can create string object?
// ** There are two ways to create string object:
//1. String literal (String s = "abc";)
//2. By new keyword (String s = new String("abc");)
//3. By using string buffer (StringBuffer sb = new StringBuffer("abc");)
//4. By using string builder (StringBuilder sb = new StringBuilder("abc");)


//How many methods in the string class?
//1. char charAt(int index) //
//2. int length()
//3. String substring(int beginIndex)
//4. String substring(int beginIndex, int endIndex)
//5. boolean contains(CharSequence s)
//6. boolean equals(String s)
//7. boolean isEmpty()
//8. String concat(String s)
//9. String replace(char old, char new)
//10. String replace(CharSequence old, CharSequence new)
//11. String[] split(String regex)
//12. String toLowerCase()
//13. String toUpperCase()
//14. String trim()
//15. static String valueOf(primitive data type x)
//16. static String valueOf(primitive data type x, int radix)
//17. String intern()
//18. String join(CharSequence delimiter, CharSequence... elements)
//19. String repeat(int count)




//String class methods:
//1. ** char charAt(int index): returns the character at the specified index.
//2. ** int length(): returns the length of the string.
//3. String substring(int beginIndex): returns the substring from the specified beginIndex.
//4. String substring(int beginIndex, int endIndex): returns the substring from the specified beginIndex and endIndex.
//5. boolean contains(CharSequence s): returns true or false after matching the sequence of char value.
//6. ** boolean equals(String s): checks the equality of string with the given object.
//7. ** boolean isEmpty(): checks if string is empty.
//8. ** String concat(String s): concatenates the specified string.
//9. ** String replace(char old, char new): replaces all occurrences of the specified char value.
//10. String replace(CharSequence old, CharSequence new): replaces all occurrences of the specified CharSequence.
//11. String[] split(String regex): returns a split string matching regex.
//12. ** String toLowerCase(): returns a string in lowercase.
//13. ** String toUpperCase(): returns a string in uppercase.
//14. ** String trim(): removes beginning and ending spaces of this string.
//15. static String valueOf(primitive data type x): returns the string representation of the passed argument.
//16. static String valueOf(primitive data type x, int radix): returns the string representation of the passed argument with radix.
//17. String intern(): returns the interned string.
//18. String join(CharSequence delimiter, CharSequence... elements): returns a joined string.
//19. String repeat(int count): returns a string concatenated with itself a specified number of times.
//20. String strip(): returns a string with the leading and trailing whitespace removed.
//21. String stripLeading(): returns a string with the leading whitespace removed.
//22. String stripTrailing(): returns a string with the trailing whitespace removed.
//23. String strip(): returns a string with the leading and trailing whitespace removed.
//24. String stripLeading(): returns a string with the leading whitespace removed.
//25. String stripTrailing(): returns a string with the trailing whitespace removed.
//26. IntStream chars(): returns a stream of chars.
//27. IntStream codePoints(): returns a stream of code points.
//28. Stream lines(): returns a stream of lines extracted from this string.




//Constructors of String class:
//1. String(): initializes a new string object with the empty constructor.
//2. String(byte[] byteArr): initializes a new string object with the byte array.
//3. String(byte[] byteArr, int offset, int length): initializes a new string object with the byte array, offset, and length.
//4. String(char[] charArr): initializes a new string object with the char array.
//5. String(char[] charArr, int offset, int length): initializes a new string object with the char array, offset, and length.
//6. String(StringBuffer sb): initializes a new string object with the string buffer.
//7. String(StringBuilder sb): initializes a new string object with the string builder.
//8. String(String original): initializes a new string object with the string object.
//9. String(StringBuilder builder, int startIndex, int endIndex): initializes a new string object with the string builder, startIndex, and endIndex.




public class ANotesOfString {
    public static void main(String[] args) {

    }
}
