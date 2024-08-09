import java.util.Scanner;
class CompanyArrayObject{

	String name;
	int id;
	int salary;
	String designation;
	int exp;

	CompanyArrayObject c1 [] = new CompanyArrayObject[2];
	CompanyArrayObject c2 [] = new CompanyArrayObject[2];
	
	int tLength = c1.length + c2.length;

	public CompanyArrayObject(String name, int id, int salary, String designation, int exp){
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
		this.exp = exp;
	}

	public CompanyArrayObject(){
	}

	public void accept(){
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		for(int i=0; i<tLength; i++){
			System.out.println("Enter name, id, salary, designation, exp : ");
			String n = sc.next();
			int ids = sc.nextInt();
			int s = sc.nextInt();
			String d = sc.next();
			int e = sc.nextInt();
			
			CompanyArrayObject com = new CompanyArrayObject(n, ids, s, d, e);
		
			if(e>=5){
			   c1[a] = com;
			   a++;
			}
			else{
			    c2[b]=com;
			    b++;
			}
		}
	}

	@Override
	public String toString(){
		return "Name " + name + " Eid : " + id + " Salary : "+ salary + " Role "+ designation + " Exp : " + exp;
	}

	public void display(){
	    System.out.println("Employee of Greater than 5 Years of EXP");
		for(int i=0; i<c1.length; i++){
			System.out.println(c1[i]);
		}
		System.out.println("Employee of Less than 5 Years of Experience");
		for(CompanyArrayObject b1 : c2){
		    System.out.println(b1);
		}
	}
	
	
	public static void main(String [] args){
		CompanyArrayObject c = new CompanyArrayObject();
		c.accept();
		c.display();
	}
}