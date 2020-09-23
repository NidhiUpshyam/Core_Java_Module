//41.Write a program to demonstrate this() construct functionality. 

class Employee{
       private int empId;
       private String empName;
       Employee(){
       this(100,"abc");
       }
      Employee(int empId,String empName){
         this.empId=empId;
         this.empName=empName;
     }

      void show(){
           
             System.out.println(empId+""+empName);

       }



  }

   class Q41{

        public static void main(String args[]){
              Employee e=new Employee();
              e.show();
              Employee e1=new Employee(124,"Hannah");
              e1.show();

        }

   }

  


  