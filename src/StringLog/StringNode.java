
package StringLog;

public class StringNode implements StringNodeInterface
{
    //data members
    protected String info;
    protected StringNode firstNode;
    protected StringNode lastNode;
    protected StringNode nextNode;
    
    //constructor
    
    public StringNode(String name)
    {
       
    }
    //methods
    public String getInfo()
    {
        return info;
    }
    public void setInfo(String newInfo)
    {
        info = newInfo;
    }
    public StringNode getNextNode()
    {
        return nextNode;
    }
    public void setNextNode(StringNode nextNode)
    {
        this.nextNode = nextNode;
    }
}
