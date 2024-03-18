package IO_operation;

import java.io.*;

class FileOutputStreamEx

{

    public static void main(String args[]) throws IOException

    {

        FileInputStream fin = new FileInputStream("D:/Code_wid_pablo/Java/test1.txt");

        FileOutputStream fout = new FileOutputStream("D:/Code_wid_pablo/Java/test.txt");

        int c;

        while ((c = fin.read()) != -1)

        {

            fout.write(c);

        }

        fout.close();

        fin.close();

    }

}