import java.util.Scanner;

public class ATMStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBdata db=new DBdata();
		Scanner scan=new Scanner(System.in);
		String upwd=scan.next();
		ATM atm=new ATM();
		if(atm.checkPwd(db.password, upwd)){
			System.out.println(atm.getBalance(db));
			atm.save(100, db);
			System.out.println(atm.getBalance(db));
		}else{
			
		}
	}

}
