package school.lesson7;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppData {

    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("new.csv"));
            int i = 0;
            for (String str : header) {
                writer.append(str);
                if (i++ != (header.length - 1)) {
                    writer.append(";");
                }
            }
            writer.append('\n');
            for (int[] array : data) {
                int n = 0;
                for (int value : array) {
                    writer.append(String.valueOf(value));
                    if (n++ != (array.length - 1)) {
                        writer.append(";");
                    }
                }
                writer.append('\n');
            }
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String[] headerRead;
            headerRead = (reader.readLine()).split(";");
            System.out.println(Arrays.toString(headerRead));
            String line;
            List<List<Integer>> lines = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                lines.add(Arrays
                        .stream(line.split(";"))
                        .map(s -> Integer.parseInt(s))
                        .collect(Collectors.toList()));
            }
            lines.forEach(ln -> System.out.println(ln));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


