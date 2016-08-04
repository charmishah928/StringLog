package StringLog;

public interface StringLogInterface 
{
    boolean insert(String newString);
    
    boolean contains(String target);
    //no need to type public abstract, as it is already in the default settings
    
    String getName();
    void setName(String newName);
    
    int getSize();
    void setSize(int newSize);
    
    boolean isFull();
    void clear();
    
    String toString();
}