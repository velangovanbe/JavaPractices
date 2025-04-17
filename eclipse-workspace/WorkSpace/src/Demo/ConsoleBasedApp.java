package Demo;
        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        
        public class ConsoleBasedApp {
            public static void main(String[] args) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
                    System.out.print("Enter your age: ");
                    String ageStr = reader.readLine();
                    int age = Integer.parseInt(ageStr);
                    System.out.println("You are " + age + " years old.");
                } catch (IOException | NumberFormatException e) {
                    System.err.println("Error reading input: " + e.getMessage());
                } finally {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        System.err.println("Error closing reader: " + e.getMessage());
                    }
                }
            }
        }