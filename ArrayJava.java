import java.util.Scanner;
class  ArrayJava {
	String name;
	int id;
	double per;

	 ArrayJava stu [] = new  ArrayJava[5];

	public  ArrayJava (String name, int id, double per) {
		this.name = name;
		this.id = id;
		this.per = per;
	}

	//Empty constructor to call the methods
	public  ArrayJava() {

	}
	//By using this method we can print the values insted of Memory address because we are printing objects
	@Override
	public String toString() {
		return "Name : " + name + " ID : " + id + " Per : " + per;
	}


	//Accept the values for the  ArrayJava
	public void accept() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<stu.length; i++) {
			System.out.println("Enter name, id per ");
			String n = sc.next();
			int id = sc.nextInt();
			double p = sc.nextDouble();

			 ArrayJava s1 = new  ArrayJava(n, id, p);

			stu[i] = s1;
		}
	}

	public void displayInfo() {
		System.out.println("Original Array");
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i]);
		}

		System.out.println("Sorted Array");
		for(int i=0; i<stu.length; i++) {
			for(int j=i+1; j<stu.length; j++) {
				if(stu[i].per<stu[j].per) {
					 ArrayJava temp = stu[i];
					stu[i] = stu[j];
					stu[j] = temp;
				}
			}
			System.out.println(stu[i]);
		}
	}

	public static void main(String [] args) {
		 ArrayJava s = new  ArrayJava();
		s.accept();
		s.displayInfo();
	}
}