package design.pattern.test;

import design.pattern.watcher.Observer3;
import design.pattern.watcher.SubjectFor3d;
import design.pattern.watcher.SubjectForSSQ;

public class TestWatcherSys
{  
    public static void main(String[] args)  
    {  
        SubjectFor3d subjectFor3d = new SubjectFor3d() ;  
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ() ;  
          
        Observer3 observer3 = new Observer3();  
        observer3.registerSubject(subjectFor3d);  
        observer3.registerSubject(subjectForSSQ);  
          
          
        subjectFor3d.setMsg("hello 3d'nums : 110 ");  
        subjectForSSQ.setMsg("ssq'nums : 12,13,31,5,4,3 15");  
          
    }  
}