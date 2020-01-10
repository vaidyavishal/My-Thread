package MyController;

import java.io.IOException;

public class WriteThreadJson extends Thread {
    @Override
    public void run() {
        MyCollection myCollection = MyCollection.getInstance();
        JsonReadAndWrite jsonReadAndWrite = new JsonReadAndWrite();

        for(int Counter=0;Counter<100;Counter++)
        {
            Employee emp = myCollection.get();
            try {
                jsonReadAndWrite.write(emp);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            try {
//                jsonReadAndWrite.write();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
//        try {
//            jsonReadAndWrite.write();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
