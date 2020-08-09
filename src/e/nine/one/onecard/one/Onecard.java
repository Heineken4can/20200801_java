package e.nine.one.onecard.one;

public class Onecard {

	/**
	 * 카드 문자열이 원카드 룰에 맞는지 여부를 판별하는 기능
	 * 
	 * @param 		inputData		입력데이터 (문자열 배열)
	 * @return		boolean			원카드 룰 적합 여부 (true/false)
	 */
	public boolean isValidOnecardRule( String[] inputData ) {
		
		boolean valid = true;
		
		////////////////////////여기부터 코딩 (1) ---------------->
		
		for(int i = 0 ; i < inputData.length - 1 ; i++){
			
			String left = inputData[i];
			String right = inputData[i + 1];
			
			if(left.charAt(0) != right.charAt(0)
					&& left.charAt(1) != right.charAt(1)){
				valid = false;
				break;
			}
			
		}
		
		///////////////////////////// <-------------- 여기까지 코딩 (1)
		
		return valid;
	}
}
