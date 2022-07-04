class Swap2{
  public static void main(String args[]){
     int a=-10;
     int b=-6;

  System.out.println("Values Before Swap "+a+" , "+b);  
  //using XOR gate
  a=a^b; 
  b=a^b; 
  a=a^b;
 
  System.out.println("Values After Swap "+a+" , "+b);  

  }
}
