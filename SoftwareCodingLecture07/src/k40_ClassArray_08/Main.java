package k40_ClassArray_08;
/*
 * 8.Ŭ������ �迭 (�迭�� Ŭ������ ���� �ϱ�)
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k40_iPerson = 5;
		OneRec1[] k40_inData = new OneRec1[k40_iPerson];//OneRec1 Ŭ������ ������Ʈ ���� 
		
		k40_inData[0] = new OneRec1("ȫ��01",100,100,90); //�����ڸ� ���� �� ������ ����
		k40_inData[1] = new OneRec1("ȫ��02",90,90,90); 
		k40_inData[2] = new OneRec1("ȫ��03",80,70,90); 
		k40_inData[3] = new OneRec1("ȫ��04",70,60,90); 
		k40_inData[4] = new OneRec1("ȫ��05",60,100,90);
		
		for (int k40_i=0; k40_i<k40_iPerson; k40_i++) {
		
		String k40_name = k40_inData[k40_i].name(); //������� �̸�, ����, ����, ����, ����, ��� ������ �ҷ��� ���
		int k40_kor = k40_inData[k40_i].kor(); 
		int k40_eng = k40_inData[k40_i].eng();
		int k40_mat = k40_inData[k40_i].mat();
		int k40_sum = k40_inData[k40_i].sum();
		double k40_ave = k40_inData[k40_i].ave();
		System.out.printf("��ȣ : %d, �̸� : %s, ���� : %d, ���� : %d, ���� : %d, ���� : %d, ��� : %f\n",
				k40_i,k40_name,k40_kor,k40_eng,k40_mat,k40_sum,k40_ave);
	
		}	
		

	}
}
