
public class ATM {

	public double getBalance(DBdata db){
		return db.balance;
	}
	
	public boolean checkPwd(String s,String u){
		if(s.equals(u)){
			return true;
		}else {
			return false;
		}
	}
	
	public void save(int money,DBdata db){
		db.balance+=money;
	}
	
	public String checkCard(DBdata db){
		if("ABC".equals(db.cardId)){
			return "ABC";
		}else if("ICBC".equals(db.cardId)){
			return "ICBC";
		}else{
			return null;
		}
	}
}
