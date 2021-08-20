package school.lesson7;

import java.io.*;

public class StreamDemoApp {
    public static void main(String[] args)  {
        String fileName = "new.csv";
        AppData appData = new AppData();
        String[] header = {"val1", "val2", "val3"};
        appData.setHeader(header);
        int[][] data = {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};
        appData.setData(data);
        appData.save();
        appData.read(fileName);
    }
}

