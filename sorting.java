
import java.util.*;
class sorting implements Comparator<student>
{
    public int compare(student s1,student s2)
    {
        if(s1.cgpa>s2.cgpa) return -1;
        else if(s1.cgpa<s2.cgpa) return 1;
        else 
        {
            
            if(s1.name.compareTo(s2.name)>0) return 1;
            else if(s1.name.compareTo(s2.name)<0) return -1;
            else{
            if(s1.id>s2.id) return 1;
            else if(s1.id<s2.id) return -1;
            else return 0;
            }
        }
    }
}