//collection

//arraylist string




import java.util.*;  

class pro1{  

public static void main(String args[]){  

ArrayList<String> s1=new ArrayList<String>();//Creating arrays1 

System.out.println("ADDING VALUES");  

s1.add("thanushya");//Adding object in arrays1  

s1.add("gokul");  

s1.add("kavya");  

s1.add("mithun");  

//Traversing arraylist through Iterator  

Iterator itr1=s1.iterator();  

while(itr1.hasNext())

{  

System.out.println(itr1.next());  

}  

}  

} 
