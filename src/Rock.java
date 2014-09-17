/**
 * Rock class that will be used to describe types of rocks
 * rocktype will only be one of 3 values: Igneous, Sedimentary, and Metamorphic
 * @author Andy
 *
 */
public class Rock
{
    private String rocktype;
    
    public Rock(String rocktype)
    {
        this.rocktype = rocktype;
    }
    
    public String getRocktype() 
    {
        return rocktype;
    }
    
    public void changeRockType(String rocktype)
    {
        this.rocktype = rocktype;
    }
}
