package StringLog;


public class StringLogLL implements StringLogInterface 
{
    //data members
    protected StringNode log;
    protected int size;
    protected StringNode lastNode;
    protected  String name;
    //Constructors
    
    public StringLogLL(String name)
    {
            log = null;
            lastNode = null;
            this.name = name;
            size = 0;
    }
    //methods
    public boolean insert(String newString)
    {
        StringNode newNode = new StringNode(newString);
        
        if(log == null)
        {
            log = newNode;
            lastNode = newNode;
            size++;
            return true;
         }
        else
        {
            //linked list has some nodes in it
            lastNode.setNextNode(newNode);
            size++;
            lastNode = newNode;
            return true;
        }
    }
    
    public boolean contains(String target)
    {
        StringNode temp = log;
        while(temp.getNextNode() != null)
        {
            if(target.equalsIgnoreCase(temp.getInfo()))
            
                return true;
            temp = temp.getNextNode();
        }
         if(target.equalsIgnoreCase(temp.getInfo()))
             return true;
            else
              return false;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public int getSize()
    {
        return size;
    }
    public void setSize(int newSize)
    {
        this.size = newSize;
    }
    
    public boolean isFull()
    {
        return false;
    }
    public void clear()
    {
        log = null;
        lastNode = log;
        size = 0;
    }
    public String toString()
    {
        StringNode temp = log;
        String result = " ";
        while(temp.getNextNode() != null)
        {
            result += temp.getInfo() + ", ";
            temp = temp.getNextNode();
        }
        result += temp.getInfo() + ", ";
        return result;
    }
            
}
