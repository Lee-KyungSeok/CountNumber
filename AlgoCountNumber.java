/**
 * �Է°��� ���� m, ���ڸ��� ���� n���� �޾��� ��
 * 1���� ���� m���� �߿� ���� n�� ��� �ִ��� ī��Ʈ
 * 
 * ��)  �Է°� m=10000, n=8
 * 		1���� 10000���̿� 8�̶�� ���ڰ� ��� �ִ��� ī��Ʈ �ϴµ�
 * 		8888�� ��� 4�� ī��Ʈ 
 *
 * ��ó : ���� ����
 * @author Kyung
 *
 */
public class AlgoCountNumber {
	
	public int count(int m, int n) {
		int result = 0;
		
		String tranStringSub;
		for(int i=n ; i<m+1 ; i++) {
			
			//m�� n�� String���� ��ȯ�ϰ� m�� ����
			String tranStringN = n+"";
			tranStringSub = i+"";
			String temp[] = tranStringSub.split("");
			
			// ���ص� m�� n�� ��
			for(String item : temp) {
				if(item.equals(tranStringN)) {
					result++;
				}
			}
			
			/* ��������� ���� �ٸ���
			for(String item : temp) {
				int comparedNum = Integer.parseInt(item);
				if(comparedNum==n) {
					result++;
				}
			}
			*/
		}
		return result;
	}
}
