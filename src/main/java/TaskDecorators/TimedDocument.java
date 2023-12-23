package TaskDecorators;

public class TimedDocument implements Document {
    private String result;

    public TimedDocument(Document document) {
        long startTime = System.currentTimeMillis();
        this.result = document.parse();
        long endTime = System.currentTimeMillis();
        System.out.println("Photo is parsed by " + (endTime - startTime) + " ms");
    }

    @Override
    public String parse() {
        return result;
    }
}