class Test { 
    public static void main(String args[])  { 
       int x = -4; 
       System.out.println(x>>1);    
       int y = 4; 
       System.out.println(y>>1);  
int z = -1;   //variable should be different
  
       System.out.println(x>>>29);  // The value of 'x>>>29' is 00...0111 
       System.out.println(x>>>30);  // The value of 'x>>>30' is 00...0011  
       System.out.println(x>>>31);  // The value of 'x>>>31' is 00...0001  
  	   
    }     
}