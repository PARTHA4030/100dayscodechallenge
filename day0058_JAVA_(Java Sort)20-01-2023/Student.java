import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            
            testCases--;
        }
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if (st1.getCgpa() == st2.getCgpa())
                    if (st1.getFname().compareTo(st2.getFname()) == 0)
                        return ((Integer) st1.getId()).compareTo(st2.getId()) ;
                    else
                        return st1.getFname().compareTo(st2.getFname());
                else
                    return ((Double)  st2.getCgpa()).compareTo(st1.getCgpa()) ;
            }
        });
      
          for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}