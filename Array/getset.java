// public class getset  
// {  
//     public static void main(String argvs[])   
//     {  
       
//         final Employee emp = new Employee();  
          
//         // the employee details are getting set using the setter methods.  
//         emp.setEmpId(107);  
//         emp.setEmpName("Kathy");  
//         emp.setEmpDesignation("Software Tester");  
//         emp.setEmpCompany("XYZ Corporation");  
          
//         // Displaying the details of the employee details using the   
//         // 'toString()' method, which uses the getter methods  
//         System.out.println(emp.toString());  
//     }  
// }  
// class Employee   
// {  
//     // class member variable  
//     private int eId;  
//     private String eName;  
//     private String eDesignation;  
//     private String eCompany;  
  
//     public int getEmpId()   
//     {  
//         return eId;  
//     }  
//     public void setEmpId(final int eId)   
//     {  
//         this.eId = eId;  
//     } 

//     public String getEmpName()   
//     {  
//         return eName;  
//     }  
//     public void setEmpName( String eName)   
//     {  
//         // Validating the employee's name and   
//         // throwing an exception if the name is null or its length is less than or equal to 0.  
//         if(eName == null ||  eName.length() <= 0)   
//         {  
//             throw new IllegalArgumentException();  
//         }  
//         this.eName = eName;  
//     }  

//     public String getEmpDesignation()   
//     {  
//         return eDesignation;  
//     }  
//     public void setEmpDesignation( String eDesignation)   
//     {  
//         this.eDesignation = eDesignation;  
//     }  


//     public String getEmpCompany()   
//     {  
//         return eCompany;  
//     }  
      
//     public void setEmpCompany( String eCompany)   
//     {  
//         this.eCompany = eCompany;  
//     }  
//     // for printing the values  
//     @Override  
//     public String toString()   
//     {  
//         String str = "Employee: [id = " + getEmpId() + ", name = " + getEmpName() + ", designation = " + getEmpDesignation() + ", company = " + getEmpCompany() + "]";  
//         return str;  
//     }  
// } 

public class getset 
{  
public static void main(String argvs[])  
{  
ABC obj = new ABC();  
int mainArr[] = {3, 4, 6, 8, 78, 9};   
obj.setVal(mainArr);  //invoke set methode  
obj.display();  // invoking the display method
mainArr[0] = -1; // updating the value at the 0th index  
System.out.println();
obj.display(); 
mainArr[1] = -2; 
System.out.println();  
obj.display();  
}  
}  

class ABC
{  
int[] var;  
void setVal(int[] arr)   
{  
this.var = arr; //getting value
}  
  
void display()  // for displaying the value  // present in the val array 
{  
int n = (this.var).length;  
for(int i = 0; i < n; i++)  
{  
System.out.print(this.var[i] + " ");  
}  
} 

}  
  





    

