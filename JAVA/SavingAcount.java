public class SavingAcount{
	public double annualInterestRate;
	SavingAcount(){
		annualInterestRate=2/200;
	}
	public void setAnnualInterestRate(double number){
		annualInterestRate=number;
	}
	public double calcmonthInterestRate(double savingBalance){
		double result=savingBalance*annualInterestRate;
		savingBalance+=result;
		return savingBalance;
	}
	public static void main(String[] args) {
		SavingAcount sav1=new SavingAcount();
		sav1.setAnnualInterestRate(0.04);
		double savingBalance=40000.0;
		System.out.println("your first saving balance is:"+sav1.calcmonthInterestRate(savingBalance));
		sav1.setAnnualInterestRate(0.05);
		System.out.println("your first saving balance is:"+sav1.calcmonthInterestRate(savingBalance));
		SavingAcount sav2=new SavingAcount();
		sav2.setAnnualInterestRate(0.04);
		double savingBalance2=80000.0;
		System.out.println("your first saving balance is:"+sav2.calcmonthInterestRate(savingBalance2));
		sav2.setAnnualInterestRate(0.05);
		System.out.println("your first saving balance is:"+sav2.calcmonthInterestRate(savingBalance2));
		

	}
}