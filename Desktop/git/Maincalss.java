package exchagemoney;

public class Maincalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double KORmoney;
		int kindmoney;
		double ReturnMoney, ChangedMoney;

		imoirtcalse insert = new imoirtcalse();

		do {
			KORmoney = insert.inputfromclass();
			kindmoney = insert.inputfromclass2();
			OutputclassUSD usd = new OutputclassUSD();
			OutputclassEuro euro = new OutputclassEuro();
			OutputclassJPY jpy = new OutputclassJPY();

			if (kindmoney == 상수.CHANG_TYPE_USD) {

				usd.changeToUSD(KORmoney);

			} else if (kindmoney == 상수.CHANG_TYPE_EUR) {

				euro.changeToEUR(KORmoney);

			} else if (kindmoney == 상수.CHANG_TYPE_JPY) {
				jpy.changeToJPY(KORmoney);
			}
		} while (KORmoney != 0);
	}
}
