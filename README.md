# 특정 숫자 갯수 카운팅 문제

## __문제__
입력값을 정수 m, 한자리수 정수 n으로 받았을 때 1부터 정수 m까지 중에 정수 n이 몇개가 있는지 카운트하는 문제
 * 예) 입력값 m=10000, n=8 인 경우 </br>
 1부터 10000사이에 8이라는 숫자가 몇개가 있는지 카운트</br>8888의 경우 4로 카운트
 * 구글 기출 문제

### __풀이__
String Api, 반복문 이용
1. m과 n을 String으로 변환
2. m을 하나의 자리수로 분해하여 배열에 저장
3. 분해된 m을 n과 비교하여 같은 경우 count++
4. m만큼 반복

#### __소스 코드__
``` java
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
		}
		return result;
	}
```
