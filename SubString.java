import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      
      String[] str=new String[5];
      str[1]="justEngineersThing";
      Optional<String>isNull=Optional.ofNullable(str[1]);
        if(isNull.isPresent()){
            //Getting the SubString
            String str2=str[1].substring(2,5);
            //Display SubString
            System.out.println("SubString is: "+str2);
        } 
        else{
            System.out.println("Cannot get the subString from an empty string");
        }
        
    }
}

// Output :- stE