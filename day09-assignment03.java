import java.util.Iterator;

import java.util.LinkedList;

import java.util.ListIterator;

import java.util.Spliterator;  


class sam1

{

   sam1()

   {

   LinkedList <String> a1=new LinkedList<String>();//Creating arrays

   //Adding object in arraya1  

   a1.add("s");

   a1.add("w") ;

   a1.add("ue"); 

   a1.add("vy");

   a1.add("ot");

   a1.add("rep");

   a1.add("prr");

   a1.add("t") ;

   a1.add("u"); 

   a1.add("v");

   a1.add("o");

   a1.add("p");

   a1.add("p");


   //Traversing arraylist through Iterator  

    Iterator itr1=a1.iterator();  

    while(itr1.hasNext())

   {  

    System.out.println(itr1.next());  

   }   

   //extraction

   System.out.println("element at i:"+a1.get(3));

   System.out.println("first element:"+a1.getFirst());    

   System.out.println("last element:"+a1.getLast());

   System.out.println("element at i:"+a1.element());




   //deletion

   System.out.println("removed element is :"+a1.remove());//removing head element

   System.out.println("removed element is :"+a1.remove("p"));//remove first occcurance

   System.out.println("removed element at 1st is :"+a1.removeFirst());//removing head element

    //deleting elements method

   a1.removeLast();

   System.out.println("removed last elements:"+a1);

   a1.poll();

   System.out.println("removed 1st element:"+a1);

   //a1.removeAll(a1);

  // System.out.println(a1);

  a1.removeIf(x-> x.equals("rep"));

  System.out.println("removeIf"+a1);

  a1.removeIf((x-> x.equals("u") && x.equals("v")));

  System.out.println("removeIf and"+a1);


   //traversal

   //spliiterator

   Spliterator <String> si=a1.spliterator();

   System.out.println("traversal by spliterator:"+a1);

   si.forEachRemaining(ele->System.out.println(ele));

   //listiterator forward

   ListIterator li=a1.listIterator();

   while(li.hasNext())

   {

       System.out.println("traversal by listiterator forward:"+li.next());

   }

   //listiterator backward



   while(li.hasPrevious())

   {

       System.out.println("traversal by listiterator backward:"+li.previous());

   }


   }


}



class pro3{  

public static void main(String args[]){  

new sam1();


}  

} 
