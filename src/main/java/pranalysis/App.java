package pranalysis;

public class App 
{
    public void aMethod( String[] args )
    {
    	// TODO fix this
    	int i = 0;
    	if (i != 0) {
    		// TODO fix this too..
    		int j = 5 / i;
    	}
      for (int k = 0; k < 10; k--)
      {
        System.out.println("In a loop!");
      }
      
    	System.out.println("IN AMETHOD"); 
    }
    
    public String uncoveredMethod() {
      // TODO: need to fix this uncovered method
    	return "UNCOVERED";
    }
}
