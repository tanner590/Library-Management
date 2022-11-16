package library_management;

public class Subject {
	
	public void itandcs(){
        System.out.println("");
        String it[]={"Information Technology","Information Systems","Compiler Design"};


        System.out.println("The books available in IT and Computer Science Dept are as follows:");
        for (int i=0; i< it.length;i++){

            System.out.println(it[i]);

        }


    }


    public void library(){
        System.out.println("");
        String lib[]={"Library Management","Library Administration", "Information Science"};

        System.out.println("The books available in Library and Information Science department are as follow:");

        for(int j=0; j<lib.length;j++){

            System.out.println(lib[j]);
        }

    }



    
}
