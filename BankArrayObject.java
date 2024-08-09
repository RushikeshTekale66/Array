import java.util.Scanner;
class BankArrayObject{

	int balance;
	String name;
	int age;

	BankArrayObject b [] = new BankArrayObject[3];

	public BankArrayObject(int balance, String name, int age){
		this.balance = balance;
		this.name = name;
		this.age = age;
	}

	public BankArrayObject(){
	}

	public void accept(){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<b.length; i++){
			System.out.println("Enter balance, name, age");
			int bal = sc.nextInt();
			String n = sc.next();
			int a = sc.nextInt();
		
			if(bal>50000){
				BankArrayObject b1 = new BankArrayObject(bal, n, a);
				b[i] = b1;
			}	
			else{
				i--;
			}
		}
	}

	@Override
	public String toString(){
		return "Balance : " + balance + " Name : "+ name + " Age" + age;
	}

	public void display(){
		for(int i=0; i<b.length; i++){
			System.out.println(b[i]);
		}
	}
	
	
	public static void main(String [] args){
		BankArrayObject b = new BankArrayObject();
		b.accept();
		b.display();
	}
}