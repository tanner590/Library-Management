package library_management;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner obj=new Scanner(System.in);

        int choice =0;

        while(choice !=3){

            System.out.println("Enter 1- for Student \n Enter 2- for Subject");
            choice =obj.nextInt();

            if (choice == 1) {
            Student obj1=new Student();
                System.out.println("Enter student's name");
                obj1.name=obj.nextLine();obj1.name=obj.nextLine();
                System.out.println("Enter the Parent name");
                obj1.fname=obj.nextLine();
                System.out.println("Enter university id");
                obj1.uni_id=obj.nextLine();
                System.out.println("Enter the Student id");
                obj1.uid=obj.nextLine();
                System.out.println("In which semester do you study:");
                obj1.sem=obj.nextInt();

                obj1.getdata(obj1.name, obj1.fname, obj1.uid,obj1.uni_id,obj1.sem);
                obj1.setdata();
            }

            else if(choice ==2){
                Subject obj2=new Subject();

                obj2.itandcs();
                obj2.library();
                
            }
            }


	}

}
