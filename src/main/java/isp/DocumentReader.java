package isp;

public class DocumentReader implements Scanner{

    private final Scanner scanner;

    public DocumentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public void scanner() {
        scanner.scanner();
    }
}
