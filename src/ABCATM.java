
public class ABCATM extends ATM{

	public void savePhone(int money,DBdata user){
		user.balance-=money;
	}
}
