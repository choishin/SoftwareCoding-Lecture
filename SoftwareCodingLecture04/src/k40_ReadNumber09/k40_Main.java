package k40_ReadNumber09;
//9.�����б���  
//���� ���ú��� ��÷�ϴ� ��ó�� ���� �б�
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. ���ڸ� �������� ���
		int k40_iNumVal = 1001034567; // int k40_iNumVal = 1001034567 ������ ���� ���� 
		String k40_sNumVal = String.valueOf(k40_iNumVal); //�� ������ StringŸ������ ��ȯ�� (String.valueOf())
		String k40_sNumVoice=""; // sNumVoice = �ƹ��� ������ ��� ���� ���� String ���� ����
		System.out.printf("==> %s [%d �ڸ�]\n", k40_sNumVal ,k40_sNumVal.length()); 
		//k40_sNumVal = String���� ��ȯ�� �� k40_sNumVal.length = k40_sNumVal�� ���� 
		//��� ��) 1001034567 [10 �ڸ�] 

		//2.�� �ڸ����� ���ڸ� ����ϰ� []<-�� �ȿ� �ѱ۷� ���� ȣ���ϱ�
		//3.�ڸ����� ����ȣ�� ���� ���
		int k40_i,k40_j; //������ ���ڵ��� ������ �ε��� �ű� ������ ��������
		String[] k40_units = {"��","��","��","��","��","��","��","ĥ","��","��"};//ȣ�� �迭�� �ְ�
		String[] k40_unitx = {"","��","��","õ","��","��","��","õ","��","��"}; //�ڸ����� �迭�� ����
		k40_i = 0;                  //i = ó������ ���� 
		k40_j = k40_sNumVal.length()-1; //j = ������ ���������� ����
		
		//�ݺ� (���ѹݺ�)
		while (true) { 
			//�ݺ�Ż������ ���� : i�� sNumVal�� ���̿� ���ų� ũ�ٸ� �ݺ� Ż��
			if(k40_i >= k40_sNumVal.length()) break;
			//k40_sNumVal���� i��°���� i+1��°���� ����ϰ� (��, i��°�ڸ��� ��µǴ� ���̰� 0�ڸ����� ���۵�)
			//i��° �ڸ����� Integer�� ��ȯ�ϰ�, �װ��� �ε������ϴ� k40_units�� []�� ��� �ϴµ� (��) 3�̶�� '��')
			System.out.printf("%s[%s]", k40_sNumVal.substring(k40_i, k40_i+1), 
					k40_units[Integer.parseInt(k40_sNumVal.substring(k40_i, k40_i+1))]); 
			//����(1) : sNumVal i��° ���� "0"�̰�
			if(k40_sNumVal.substring(k40_i, k40_i+1).equals("0")) {
				// k40_unitx[j]�� ���̰ų� ���̶�� (��, �ٸ� �������� ���� ����)
				//������ �ڸ�Ʈ : �ش� �ڸ��� 0�� �� �������� �Ⱥ��̴µ� ��, �� �ڸ��� ���δ�. �̹� �縸 �̽�.. �̹鸸 ����, �� �ڸ��� �ƴϸ� �ƹ����� ����
				if(k40_unitx[k40_j].equals("��") || k40_unitx[k40_j].equals("��")) {
					//k40_sNumVoice�ڸ��� unitx[j]������ ��ü ��)
					k40_sNumVoice = k40_sNumVoice +""+ k40_unitx[k40_j];
					// ������ �ڸ�Ʈ : �ش��ڸ��� 0�̸� ������ �ٿ��� 
				}else{ // �������ڸ�Ʈ : �ƹ����� ����
				}
				//����(2) : k40_sNumVal k40_i���� "0"�� �ƴ϶�� 
			}else { //k40_sNumVoice�� k40_i�� Integer ��ȯ�� ���� �ε������ϴ� k40_units���� ���ϰ�
				//k40_unitx[j]�� ��� ��) 7�̸� ĥ, �����ڸ��� 6�̸� ����
				k40_sNumVoice = k40_sNumVoice
						+ k40_units[Integer.parseInt(k40_sNumVal.substring(k40_i,k40_i+1))]
								+ k40_unitx[k40_j]; 
			}
			k40_i++; k40_j--; //k40_i�� ���ڴ� �÷��ְ�, k40_j�� ���ڴ� �����ֱ�
		}
		System.out.printf("\n%s[%s]\n", k40_sNumVal, k40_sNumVoice);

	}

}



