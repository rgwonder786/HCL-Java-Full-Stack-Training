//Java Utility Method
/*
isBlank()
lines()
strip()
stripLeading()
stripTrailing()
repeat()
*/
public class b87 {

        public static void main(String[] args) {

                String str = "  Hello Java World  ";
                String text = "Java Programming";
                String empty = "";
                String blank = "   ";

                // =========================================================
                // 1. length()
                // =========================================================
                System.out.println("1. length(): " + text.length());

                // =========================================================
                // 2. isEmpty()
                // =========================================================
                System.out.println("2. isEmpty(): " + empty.isEmpty());

                // =========================================================
                // 3. isBlank() - Java 11
                // =========================================================
                System.out.println("3. isBlank(): " + blank.isBlank());

                // =========================================================
                // 4. charAt()
                // =========================================================
                System.out.println("4. charAt(2): " + text.charAt(2));

                // =========================================================
                // 5. codePointAt()
                // =========================================================
                System.out.println("5. codePointAt(0): " + text.codePointAt(0));

                // =========================================================
                // 6. substring()
                // =========================================================
                System.out.println("6. substring(): " + text.substring(5));
                System.out.println("   substring(0, 4): " + text.substring(0, 4));

                // =========================================================
                // 7. equals()
                // =========================================================
                System.out.println("7. equals(): "
                                + text.equals("Java Programming"));

                // =========================================================
                // 8. equalsIgnoreCase()
                // =========================================================
                System.out.println("8. equalsIgnoreCase(): "
                                + text.equalsIgnoreCase("JAVA PROGRAMMING"));

                // =========================================================
                // 9. compareTo()
                // =========================================================
                System.out.println("9. compareTo(): "
                                + "Apple".compareTo("Banana"));

                // =========================================================
                // 10. compareToIgnoreCase()
                // =========================================================
                System.out.println("10. compareToIgnoreCase(): "
                                + "java".compareToIgnoreCase("JAVA"));

                // =========================================================
                // 11. contains()
                // =========================================================
                System.out.println("11. contains(): "
                                + text.contains("Java"));

                // =========================================================
                // 12. startsWith()
                // =========================================================
                System.out.println("12. startsWith(): "
                                + text.startsWith("Java"));

                // =========================================================
                // 13. endsWith()
                // =========================================================
                System.out.println("13. endsWith(): "
                                + text.endsWith("ing"));

                // =========================================================
                // 14. indexOf()
                // =========================================================
                System.out.println("14. indexOf(): "
                                + text.indexOf("a"));

                // =========================================================
                // 15. lastIndexOf()
                // =========================================================
                System.out.println("15. lastIndexOf(): "
                                + text.lastIndexOf("a"));

                // =========================================================
                // 16. toUpperCase()
                // =========================================================
                System.out.println("16. toUpperCase(): "
                                + text.toUpperCase());

                // =========================================================
                // 17. toLowerCase()
                // =========================================================
                System.out.println("17. toLowerCase(): "
                                + text.toLowerCase());

                // =========================================================
                // 18. trim()
                // =========================================================
                System.out.println("18. trim(): [" + str.trim() + "]");

                // =========================================================
                // 19. strip() - Java 11
                // =========================================================
                System.out.println("19. strip(): [" + str.strip() + "]");

                // =========================================================
                // 20. stripLeading() - Java 11
                // =========================================================
                System.out.println("20. stripLeading(): ["
                                + str.stripLeading() + "]");

                // =========================================================
                // 21. stripTrailing() - Java 11
                // =========================================================
                System.out.println("21. stripTrailing(): ["
                                + str.stripTrailing() + "]");

                // =========================================================
                // 22. replace()
                // =========================================================
                System.out.println("22. replace(): "
                                + text.replace("Java", "Python"));

                // =========================================================
                // 23. replaceFirst()
                // =========================================================
                String data = "Java Java Java";

                System.out.println("23. replaceFirst(): "
                                + data.replaceFirst("Java", "Python"));

                // =========================================================
                // 24. replaceAll()
                // =========================================================
                System.out.println("24. replaceAll(): "
                                + data.replaceAll("Java", "Python"));

                // =========================================================
                // 25. concat()
                // =========================================================
                System.out.println("25. concat(): "
                                + "Hello ".concat("Java"));

                // =========================================================
                // 26. join()
                // =========================================================
                System.out.println("26. join(): "
                                + String.join("-", "Java", "Python", "C++"));

                // =========================================================
                // 27. valueOf()
                // =========================================================
                int number = 100;

                String numberString = String.valueOf(number);

                System.out.println("27. valueOf(): " + numberString);

                // =========================================================
                // 28. format()
                // =========================================================
                String name = "Rahul";
                int age = 36;

                System.out.println("28. format(): "
                                + String.format("Name: %s, Age: %d", name, age));

                // =========================================================
                // 29. repeat() - Java 11
                // =========================================================
                System.out.println("29. repeat(): "
                                + "Java ".repeat(3));

                // =========================================================
                // 30. lines() - Java 11
                // =========================================================
                String multiLine = "Java\nPython\nC++\nSQL";

                System.out.println("30. lines():");

                multiLine.lines()
                                .forEach(System.out::println);

                // =========================================================
                // 31. toCharArray()
                // =========================================================
                char[] chars = text.toCharArray();

                System.out.print("31. toCharArray(): ");

                for (char c : chars) {
                        System.out.print(c + " ");
                }

                System.out.println();

                // =========================================================
                // 32. getBytes()
                // =========================================================
                byte[] bytes = "Java".getBytes();

                System.out.print("32. getBytes(): ");

                for (byte b : bytes) {
                        System.out.print(b + " ");
                }

                System.out.println();

                // =========================================================
                // 33. matches()
                // =========================================================
                String email = "student@gmail.com";

                System.out.println("33. matches(): "
                                + email.matches(".*@.*\\.com"));

                // =========================================================
                // 34. regionMatches()
                // =========================================================
                System.out.println("34. regionMatches(): "
                                + "JavaProgramming".regionMatches(
                                                4,
                                                "Programming",
                                                0,
                                                11));

                // =========================================================
                // 35. contentEquals()
                // =========================================================
                StringBuilder sb = new StringBuilder("Java");

                System.out.println("35. contentEquals(): "
                                + "Java".contentEquals(sb));

                // =========================================================
                // 36. intern()
                // =========================================================
                String s1 = new String("Java");
                String s2 = s1.intern();

                System.out.println("36. intern(): "
                                + (s2 == "Java"));

                // =========================================================
                // 37. transform()
                // =========================================================
                String result = "java"
                                .transform(s -> s.toUpperCase());

                System.out.println("37. transform(): " + result);

                // =========================================================
                // 38. indent() - Java 12
                // =========================================================
                // NOT available in Java 11
                // System.out.println(text.indent(4));

                // =========================================================
                // 39. stripIndent() - Java 15
                // =========================================================
                // NOT available in Java 11
        }
}