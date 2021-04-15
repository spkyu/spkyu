package Ticketing;

public class Cacuage {
	public int calage(int daynight, int realage, int amountticket) {

		int ticketprice = 0;
		if (daynight == 1) {
			if ((realage <= 21) && (realage >= 20)) {
				ticketprice = 0;
				return ticketprice;
			} else if ((realage <= 19) && (realage >= 10)) {
				ticketprice = 44000 * amountticket;
				return ticketprice;
			} else if ((realage <= 9) && (realage >= 4)) {
				ticketprice = 47000 * amountticket;
				return ticketprice;
			} else if (((realage <= 3) && (realage >= 0)) || ((realage <= 99) && (realage >= 58))) {
				ticketprice = 56000 * amountticket;
				return ticketprice;
			} else if ((realage <= 57) && (realage > 22)) {
				ticketprice = 44000 * amountticket;
				return ticketprice;
			} else {
				return ticketprice;
			}
		
		}else if(daynight==2) {
			if ((realage <= 21) && (realage >= 20)) {
				ticketprice = 0;
				return ticketprice;
			} else if ((realage <= 19) && (realage >= 10)) {
				ticketprice = 37000 * amountticket;
				return ticketprice;
			} else if ((realage <= 9) && (realage >= 4)) {
				ticketprice = 40000 * amountticket;
				return ticketprice;
			} else if (((realage <= 3) && (realage >= 0)) || ((realage <= 99) && (realage >= 58))) {
				ticketprice = 46000 * amountticket;
				return ticketprice;
			} else if ((realage <= 57) && (realage > 22)) {
				ticketprice = 37000 * amountticket;
				return ticketprice;
			} else {
				return ticketprice;
			}
		}
		return ticketprice;
	}

	public String ageString(int realage) {

		String str = "";

		if ((realage <= 21) && (realage >= 20)) {
			str = "����";
			return str;
		} else if ((realage <= 19) && (realage >= 10)) {
			str = "û�ҳ�";
			return str;
		} else if ((realage <= 9) && (realage >= 4)) {
			str = "�Ҿ�";
			return str;
		} else if (((realage <= 3) && (realage >= 0)) || ((realage <= 99) && (realage >= 58))) {
			str = "����";
			return str;
		} else if ((realage <= 57) && (realage > 22)) {
			str = "����";
			return str;
		} else {
			return str;
		}
	}

	public int discount(int discount, int ticketprice) {

		if (discount == 1) {
			ticketprice = ticketprice;// ����
			return ticketprice;
		} else if (discount == 2) {// �����
			ticketprice = ticketprice * 60 / 100;
			return ticketprice;
		} else if (discount == 3) {// ����������
			ticketprice = ticketprice * 50 / 100;
			return ticketprice;
		} else if (discount == 4) {// ���ڳ�
			ticketprice = ticketprice * 80 / 100;
			return ticketprice;
		} else if (discount == 5) {// �ӻ��
			ticketprice = ticketprice * 75 / 100;
			return ticketprice;
		} else {
			return ticketprice;
		}

	}

	public String discountString(int discount) {
		String str = "";
		if (discount == 1) {
			str = "����";// ����
			return str;
		} else if (discount == 2) {// �����
			str = "�����";// ����
			return str;
		} else if (discount == 3) {// ����������
			str = "����������";// ����
			return str;
		} else if (discount == 4) {// ���ڳ�
			str = "���ڳ�";// ����
			return str;
		} else if (discount == 5) {// �ӻ��
			str = "�ӻ��";// ����
			return str;
		} else {
			return str;
		}

	}
	
	public String strdaynight(int daynight) {
		String str="";
		if(daynight==1) {
			str="�ְ�";
			return str;
		}else if(daynight==2) {
			str="�߰�";
			return str;
		}else {
			return str;
			
		}
	}
	
}
