
public class ICBCATM extends ATM{
  
	public void transMoney(int money,DBdata user){
		user.balance-=money;
	}
}
