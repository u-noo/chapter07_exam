package p290;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ�", "���", 12);

		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		System.out.println("ä�� : " + dmbCellPhone.channel);

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("�������� ����");
		dmbCellPhone.receiveVoice("�׿� ���� ȫ�浵�Դϴ�");
		dmbCellPhone.sendVoice("��ȣ��");
		dmbCellPhone.hangUp();

		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(15);
		dmbCellPhone.turnOffDmb();

	}

}
