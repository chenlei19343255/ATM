
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm=new ATM();
		DBdata db=new DBdata();
		if("ICBC".equals(atm.checkCard(db))){
			System.out.println("ICBC");
			
		}else if("ABC".equals(atm.checkCard(db))){
			System.out.println("ABC");
		}else{
			System.out.println("无法识别银行卡");
		}
	}

}
