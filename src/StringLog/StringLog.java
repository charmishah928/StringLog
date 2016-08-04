package StringLog;

public class StringLog implements StringLogInterface
{
    //data members
    protected String name;
    protected int size;
    protected String [] log;
    protected int lastMemberIndex;
    //constructors
    public StringLog(String name)
    {
        this.name=name;
        this.size =100;
        log = new String[100];
        lastMemberIndex =-1;
    }
    
    public StringLog(String firstMember, String name, int size)
    {
        this.name=name;
        this.size= size;
        log = new String[size];
        log[0] = firstMember;
        lastMemberIndex = 0;
    }
    //methods
    public boolean insert(String newString)
    {
        if(!isFull())
        {
            log[lastMemberIndex + 1] = newString;
            lastMemberIndex++;
            return true;
        }else
            //lastMemberIndex++;
            return false;
    }
    
    public boolean contains(String target)
    {
        for(int i=0; i<= lastMemberIndex; i++)
        {
            if(log[i].equalsIgnoreCase( target))
            return true;
        }
        return false;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public void setSize(int newSize)
    {
        String [] temp = new String[newSize];
        for(int k=0; k<= lastMemberIndex; k++)
        {
            temp[k] = log[k];
        }
        log = temp;
        size = newSize;
    }
    
    public void clear()
    {
        for(int j=0; j<=lastMemberIndex; j++)
        log[j]= null;
    }
    
    public boolean isFull()
    {
        return (lastMemberIndex == size - 1);
    }
    
    public String toString()
    {
        String str = "";
        for(int k = 0; k<= lastMemberIndex; k++)
        {
            str += log[k] + " ";
            
        }
        return str;
    }
}

