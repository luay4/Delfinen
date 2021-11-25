import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private final String FILE_NAME = "data/members.csv";
    private PrintStream ps = new PrintStream(new FileOutputStream(FILE_NAME, true));

    public FileHandler() throws FileNotFoundException {
        readFromFile();
    }

    public void readFromFile(){


    }
}
