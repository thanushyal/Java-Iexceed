//arraylist integer

import java.util.*;  




class sam

{

   sam()

   {

   ArrayList<Integer> a1=new ArrayList<Integer>();//Creating arrays

   //Adding object in arraya1  

   a1.add(3);

   

   a1.add(9) ;

   a1.add(8); 

   a1.add(7);

   a1.add(5 );

   a1.add(44);

   //Traversing arraylist through Iterator  

    Iterator itr1=a1.iterator();  

    while(itr1.hasNext())

   {  

    System.out.println(itr1.next());  

   }   

   

   }




}




class pro2{  

public static void main(String args[]){  

new sam();




}  

} 
