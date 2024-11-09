class Test{
     public static void main(String[] args){
         int x=0;
         System.out.println(x);
       try{
          System.out.println(10/0);
       }
catch(ArithmeticException e){
     System.out.println("can't divide a number by 0");


   }
 
   System.out.println("hello");
}
}
