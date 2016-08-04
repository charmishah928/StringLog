package StringLog;
public class StringLogTester 
{
    public static void main(String[] args)
    {
        StringLog s1 = new StringLog("First", "StarLog", 3);
        boolean test = s1.insert("Second");
        System.out.println("test result: " + test);
        
        test = s1.insert("third");
        System.out.println("test result: "+test);
        
        System.out.println("current log: ");
        System.out.println(s1);
        
        test = s1.insert("fourth");
        System.out.println("test result: " + test);
        
        boolean containsTest = s1.contains("First");
        System.out.println("Contains method- String Log S1 contains the string \"First\": " + containsTest);
        
        String getNameTester = s1.getName();
        System.out.println("getName method- The name of the String Log is : " +getNameTester);
        
        s1.setName("Hello World");
        System.out.println("setName method- The new name of the String Log s1 is: " +s1.getName());
        
        int getSizeTester = s1.getSize();
        System.out.println("getSize method- The size of the String Log is : " + getSizeTester);
        
        boolean isFullTester = s1.isFull();
        System.out.println("isFull method- Is String Log S1 full?: " + isFullTester);
        
        //Testing the clear method
        s1.clear();
        System.out.println("clear method- " + s1);
        
        s1.setSize(5);
        System.out.println("setSize method-The new size of the String Log S1 is : " + s1.getSize());
        
        
    }
            
}
