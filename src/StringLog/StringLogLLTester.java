
package StringLog;


public class StringLogLLTester {
 
    public static void main(String[] args) {
        
    
        StringLogLL s1 = new StringLogLL("StarLog");
        
        boolean test = s1.insert("Second");
        System.out.println("test result1: " + test);
        System.out.println("Log: " + s1);
        
        test = s1.insert("third");
        System.out.println("test result2: " + test);
        System.out.println("Log: " + s1);
        
        
        System.out.println("current log: ");
        System.out.println(s1);
        
        test = s1.insert("fourth");
        System.out.println("test result3: " + test);
        
        boolean containsTest = s1.contains("First");
        System.out.println("Contains method test for \"first\": " + containsTest);
        
        String name1 = s1.getName();
        System.out.println("getName method test: " + name1);
        
        s1.setName("New StringLogLL Name");
        System.out.println("setName method test: " + s1.getName());
        
        int size = s1.getSize();
        System.out.println("getSize method test: " + size);
        
        boolean full = s1.isFull();
        System.out.println("isFull method test: " + full);
        
        String tester = s1.toString();
        System.out.println("toString method test: " + tester);
        
        s1.clear();
        System.out.println("clear method test-> after clearing the size is now: " + s1.getSize());
        
        
        
    }
}
