package k40_CompareIf02;
//2.������, ������ ��
public class k40_Main {

	public static void main(String[] args) {
		
		int k40_il; double k40_iD;
		k40_il = 10/3; // k40_il�� int���̱� ������ = 3 (������ �Ҽ��� ���ϴ� ������)
		k40_iD = 10/3.0; //k40_iD�� double���̱� ������ = 3.333333
		
		//2-1. if������ üũ 10/3�� �� double���� ����� int���� ����� ���ٸ� 'equal', 
		// �ٸ��ٸ� 'Not equal'�� �Բ� ��� ���
		if (k40_il == k40_iD) System.out.printf("(2-1.)equal\n"); 
		else System.out.printf("(2-1.)Not equal [%f][%f]\n", (double)k40_il, k40_iD);
		
		//2-2. k40_iD = 3.333333 �̶�� 'equal' �ٸ��ٸ� 'Not equal'�� �Բ� ��� ���
		if (k40_iD == 3.333333) System.out.printf("(2-2.)equal\n"); 
		else System.out.printf("(2-2.)Not equal [3.333333][%f]\n", k40_iD); 
		
		//2-3. double���� k40_iD�� ���� int�� ���� ����ȯ�� ������̰�
		//�� ������� �׳� int�� ����� 10/3�� ������� ���ٸ� 'equal' �ٸ��ٸ� 'Not equal'�� ������
		k40_iD = (int) k40_iD; 
		if(k40_il == k40_iD) System.out.printf("(2-3.)equal\n"); 
		else System.out.printf("(2-3.)Not equal [%f][%f]\n",(double)k40_il, 0); 
		System.out.printf("(2-3.)int�� �μ� [%d][%f]\n",k40_il,k40_iD); 
		System.out.printf("(2-3.)double�� �μ� [%f][%f]\n", (double)k40_il, k40_iD); 
		
		//2-4. char Ÿ���� ������(''���)�� ���� if�� üũ
		char k40_a ='c';
		if (k40_a =='b') System.out.printf("(2-4.)a�� b�̴�\n"); //char a == 'b'��� ������ ���
		if (k40_a =='c') System.out.printf("(2-4.)a�� c�̴�\n"); //char a == 'c'��� ������ ���
		if (k40_a =='d') System.out.printf("(2-4.)a�� d�̴�\n"); //char a == 'd'��� ������ ���
		
		//2-5. String Ÿ���� �������� if�� üũ
		String k40_aa = "abcd";
		if(k40_aa.equals("abcd")) System.out.printf("(2-5.)aa�� abcd�̴�\n"); 
		else System.out.printf("(2-5.)aa�� abcd�� �ƴϴ�\n");
		
		//2-6. boolean Ÿ���� �������� if�� üũ
		boolean k40_bb = true; 
		if(!!k40_bb) System.out.printf("(2-6.)bb�� �ƴϰ� �ƴϸ� ���̴� \n"); //not not k40_bb(�ᱹ �ڱ��ڽ�)�� ���̸� �� ������
		else System.out.printf("(2-6.)bb�� �ƴϰ� �ƴϸ� �����̴�\n"); //�����̶�� �� ����� ���
	}
}

