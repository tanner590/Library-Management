package library_management;

public class Student {
	
	String name,fname,uni_id,uid;
    int sem;

    public void getdata( String name,String fname, String uni_id, String uid,int sem ){

        this.name=name;
        this.fname=fname;
        this.uni_id=uni_id;
        this.uid=uid;
        this.sem=sem;

    }

    public void setdata(){

        System.out.println("Student's name: "+name);
        System.out.println("Parents Name: "+fname);
        System.out.println("University id: "+uni_id);
        System.out.println("Student id: "+ uid);
        System.out.println("Semester: "+sem);
    }

}
