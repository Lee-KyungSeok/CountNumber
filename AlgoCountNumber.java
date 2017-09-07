/**
 * 입력값을 정수 m, 한자리수 정수 n으로 받았을 때
 * 1부터 정수 m까지 중에 정수 n이 몇개가 있는지 카운트
 * 
 * 예)  입력값 m=10000, n=8
 * 		1부터 10000사이에 8이라는 숫자가 몇개가 있는지 카운트 하는데
 * 		8888의 경우 4로 카운트 
 *
 * 출처 : 구글 기출
 * @author Kyung
 *
 */
public class AlgoCountNumber {
	
	public int count(int m, int n) {
		int result = 0;
		
		String tranStringSub;
		for(int i=n ; i<m+1 ; i++) {
			
			//m과 n을 String으로 변환하고 m을 분해
			String tranStringN = n+"";
			tranStringSub = i+"";
			String temp[] = tranStringSub.split("");
			
			// 분해된 m과 n을 비교
			for(String item : temp) {
				if(item.equals(tranStringN)) {
					result++;
				}
			}
			
			/* 비슷하지만 조금 다르게
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
