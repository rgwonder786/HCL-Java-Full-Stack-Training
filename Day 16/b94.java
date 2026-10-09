//Text Block Example
public class b94 {
    public static void main(String[] args) {

        // Traditional Multi-line String
        String message = "Hello Students\n"
                + "Welcome to Java\n"
                + "Today we are learning Text Blocks";
        System.out.println(message);

        // Text Block – Java 15
        String message1 = """
                Hello Students
                Welcome to Java
                Today we are learning Text Blocks
                """;

        System.out.println(message1);

        // Text Block with JSON
        String json = "{\n"
                + "  \"name\": \"Rahul\",\n"
                + "  \"age\": 36,\n"
                + "  \"course\": \"Java\"\n"
                + "}";
        System.out.println(json);

        // Text Block with HTML
        String html = """
                <html>
                    <body>
                        <h1>Welcome to Java</h1>
                        <p>Learning Java 15 Text Blocks</p>
                    </body>
                </html>
                """;

        System.out.println(html);

        // Text Block with SQL
        String sql = "SELECT id, name, salary "
                + "FROM employee "
                + "WHERE salary > 50000 "
                + "ORDER BY salary DESC";
        System.out.println(sql);

        // Text Block with String.formatted()
        String name = "Rahul";
        double salary = 55000.50;

        String result = """
                Employee Details
                ----------------
                Name   : %s
                Salary : %.2f
                """.formatted(name, salary);

        System.out.println(result);
        // Escape Characters
        String text = """
                Java
                Python
                C++
                """;

        System.out.println(text);
    }
}
