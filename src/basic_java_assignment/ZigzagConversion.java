package basic_java_assignment;

public class ZigzagConversion {
    //write a program to convert a string in zigzag pattern
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuilder();
        int index = 0, step = 1;
        for (char c : s.toCharArray()) {
            sb[index].append(c);
            if (index == 0) step = 1;
            else if (index == numRows - 1) step = -1;
            index += step;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : sb) res.append(row);
        return res.toString();
    }

}
