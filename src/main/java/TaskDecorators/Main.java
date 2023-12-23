package TaskDecorators;

import TaskDecorators.Document;
import TaskDecorators.SmartDocument;
import TaskDecorators.TimedDocument;

public class Main {
    public static void main(String[] args) {
        printParsingTimeForPhoto("gs://ucu/read_text.jpg");
    }

    private static void printParsingTimeForPhoto(String photoUrl) {
        System.out.println("Photo URL: " + photoUrl);
        Document photo = new TimedDocument(new SmartDocument(photoUrl));
        System.out.println(photo.parse());
    }
}
