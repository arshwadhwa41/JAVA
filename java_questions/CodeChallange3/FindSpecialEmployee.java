package java_questions.CodeChallange3;

import java.util.HashSet;

class Employee{
    String name;
    Employee sendsReqTo;

    Employee(String name){
        this.name=name;
        this.sendsReqTo=null;
    }
}
public class FindSpecialEmployee {
    static Employee special(Employee firstEmployee){
        if(firstEmployee==null){
            return null;
        }
        Employee tmp=firstEmployee;
        HashSet<Employee> visited=new HashSet<>();

        while(tmp.sendsReqTo!=null && !visited.contains(tmp.sendsReqTo)){
            visited.add(tmp);
            tmp=tmp.sendsReqTo;
        }
        return tmp.sendsReqTo;
    }
}
