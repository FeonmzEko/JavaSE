package printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class A01_Instruction {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("day19\\b.txt"),true, Charset.forName("UTF-8"));

        //写出数据
        ps.println(97);
        ps.print(true);
        ps.println();
        ps.printf("%s爱上了%s","阿珍","阿强");

        ps.close();
    }
}
