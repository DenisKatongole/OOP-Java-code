String author1 = "Ainebyoona";
String author2 = "ainebyoona";
String author3 = new String("Ainebyoona");

System.out.println(author1 == author3); // false (different objects)
System.out.println(author1.equalsIgnoreCase(author2)); // true (case-insensitive match)
