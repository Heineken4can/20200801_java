package e.nine.one.onecard.one;

public class Onecard {

	/**
	 * ī�� ���ڿ��� ��ī�� �꿡 �´��� ���θ� �Ǻ��ϴ� ���
	 * 
	 * @param 		inputData		�Էµ����� (���ڿ� �迭)
	 * @return		boolean			��ī�� �� ���� ���� (true/false)
	 */
	public boolean isValidOnecardRule( String[] inputData ) {
		
		boolean valid = true;
		
		////////////////////////������� �ڵ� (1) ---------------->
		
		for(int i = 0 ; i < inputData.length - 1 ; i++){
			
			String left = inputData[i];
			String right = inputData[i + 1];
			
			if(left.charAt(0) != right.charAt(0)
					&& left.charAt(1) != right.charAt(1)){
				valid = false;
				break;
			}
			
		}
		
		///////////////////////////// <-------------- ������� �ڵ� (1)
		
		return valid;
	}
}
