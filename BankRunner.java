class BankRunner{
	public static void main(String a[]){
		Bank.addAccountName("Asset Account");
		Bank.addAccountName("Liability Account");
		Bank.addAccountName("Equity Account");
		Bank.addAccountName("Revenue Account");
		Bank.addAccountName(null);
		Bank.getAccountNames();
		boolean isUpdate=Bank.editAccountName(null,"Liquid Account");
		System.out.println("Is the value updated : "+isUpdate);
		Bank.getAccountNames();
		Bank.deleteAccount("Asset Account");
		Bank.getAccountNames();
	}
}