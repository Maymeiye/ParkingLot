    //Mei Ye
    //23459517
import java.util.*;

public class MySet<T>
{
	private Set<T> s = new HashSet<T>();
	public void insert(T x)
	{
		this.s.add(x);
	}
	public void delete(T x)
	{
		this.s.remove(x);
	}
	public ArrayList<T> getArrayList()
	{
		ArrayList<T> a = new ArrayList<T>();
        Iterator<T> iterator = this.s.iterator(); 
        while ( iterator.hasNext() )
        {
            a.add(iterator.next());
        }
        return a;
	}
	
	public void sort_and_print()
	{
        ArrayList<T> a = new ArrayList<T>();
        Iterator<T> iterator = this.s.iterator(); 
        while ( iterator.hasNext() )
        {
            a.add(iterator.next());
        }
        
        for ( int i = 0; i < a.size(); i++ )
        {
        	    System.out.println(a.get(i));
        }
	}	
}
