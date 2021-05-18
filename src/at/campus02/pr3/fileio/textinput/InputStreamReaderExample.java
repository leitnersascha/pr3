package at.campus02.pr3.fileio.textinput;

import java.io.*;

public class InputStreamReaderExample {
    /*
    An InputStreamReader is a bridge from byte streams to character streams:
    It reads bytes and decodes them into characters using a specified
    charset. The charset that it uses may be specified by name or may
    be given explicitly, or the platform's default charset may be accepted.
     */

    public static void main(String[] args) {
        try  {
            InputStream stream = new FileInputStream("testout.txt");
            Reader reader = new InputStreamReader(stream);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}