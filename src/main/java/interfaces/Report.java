package interfaces;

public class Report implements Printable {
    final String content;

    public Report(String content) {
        this.content = content;
    }

    @Override
    public String print(String device) {
        System.out.println("printing using device: " + device);
        return "Raport ";
    }
}
