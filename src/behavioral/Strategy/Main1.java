package behavioral.Strategy;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        System.out.print("Choose formatting style (1: Bold, 2: Italic, 3: Underline): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                editor.setTextFormatter(new BoldFormatter());
                break;
            case 2:
                editor.setTextFormatter(new ItalicFormatter());
                break;
            case 3:
                editor.setTextFormatter(new UnderlineFormatter());
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        String formattedText = editor.formatText(text);
        System.out.println("Formatted Text: " + formattedText);
        scanner.close();
    }
}