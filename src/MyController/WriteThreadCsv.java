package MyController;

import java.io.IOException;

public class WriteThreadCsv extends Thread {
    @Override
    public void run() {
        MyCollection myCollection = MyCollection.getInstance();
        CSVFileHandler csvFileHandler = new CSVFileHandler();

        for(int Counter=0;Counter<100;Counter++)
        {
            Employee emp = myCollection.get();
            try {
                csvFileHandler.write(emp);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
