package k40_ReadNumber08;
//8.�����б�
public class k40_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String�迭 ���� 
		String[] k40_units = {"��","��","��","��","��","��","��","ĥ","��","��"};
		String[] k40_unitx = {"��"};
		//�ݺ� : 100�� �ݺ��� �� ��
		for(int k40_i = 0; k40_i < 101; k40_i++){
			//����(1) : k40_i�� 0�� ���ų� ũ��, 10���ٴ� �۴ٸ� 
			if(k40_i >= 0 && k40_i < 10 ) {
				//�����ڸ� : k40_unit[k40_i]�� ���
				//��) k40_i=0 �϶� k40_unit[0] = "��" ���
				System.out.printf("���� �ڸ� : %s\n",k40_units[k40_i]); 
			}
			//����(2) : k40_i�� 10�� ���ų� ũ�� 100���� �۴ٸ�
			else if(k40_i >= 10 && k40_i < 100 ) {
				//������ ���� �ʿ��� ���� �������ֱ�
				int k40_i10, k40_i0; 
				k40_i10 = k40_i/10; //���� �ڸ��� ǥ���� ����(k40_i�� 10���� ������)
				k40_i0= k40_i %10; //���� �ڸ�(k40_i�� 10���� ���� ������)
				//���� : �����ڸ��� 0�̶��
				if(k40_i0 == 0){
					//k40_i�� 10���� ���� ���� k40_i�� �����ڸ�, �ε����� �°� ��� 
					System.out.printf("���� �ڸ� : %s%s\n",k40_units[k40_i10],k40_unitx[0]);
				}
				else{
					//�����ڸ��� 0�� �ƴ϶��, k40_i�� �����ڸ��� k40_i�� 10���� ���� ������ ��, �����ڸ��� ���� ���
					System.out.printf("���� �ڸ� : %s%s%s\n",k40_units[k40_i10],k40_unitx[0],k40_units[k40_i0]);
				}
			}
			//����(3) : �� ����͵� �ƴ϶�� �׳� k40_i�� ��� (��, ������ ���� ���)
			else System.out.printf("==> %d\n", k40_i);

		}
	}

}