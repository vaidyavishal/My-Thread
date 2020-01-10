package MyController;

public class MainController {
    public static void main(String[] args) throws InterruptedException {
        ReadThreadCsv readThreadCsv = new ReadThreadCsv();
        ReadThreadJson readThreadJson = new ReadThreadJson();
        ReadThreadXml readThreadXml = new ReadThreadXml();
        readThreadCsv.start();
        readThreadJson.start();
//        System.out.println("Hello");
        readThreadXml.start();
        readThreadCsv.join();

        readThreadJson.join();
        readThreadXml.join();
        MyCollection mycollection = MyCollection.getInstance();
        mycollection.getWriteCounter();
//        mycollection.Display();
        WriteThreadCsv writeThreadCsv = new WriteThreadCsv();
        WriteThreadJson writeThreadJson = new WriteThreadJson();
        WriteThreadXml writeThreadXml = new WriteThreadXml();
        writeThreadCsv.start();
        writeThreadJson.start();
        writeThreadXml.start();
        writeThreadCsv.join();
        writeThreadJson.join();
        writeThreadXml.join();
    }
}
