package e.nine.one.Keypad;



public class Keypad {
	
	/**
	 * ���׼��� 2���� "��", "��"�� ��ȿ�� ���� ��Ģ�� �˻��ϴ� ���
	 * 
	 * @param 		inputData		��ȿ���� ������ Ű�е� ��ȣ
	 * @return		boolean			"��", "��" ��ȿ�� ���� ���
	 */
	public boolean checkSimpleValidate( String inputData ) {
		
		boolean valid = true;
		
		////////////////////////������� �ڵ� (1) ---------------->
		
		// ��
		
		if(inputData == null){
			return false;
		}
		
		char check;
		
		for(int i = 0; i < inputData.length(); i++){
			check = inputData.charAt(i);
			if( check < 48 || check > 58){
				 valid = false;
			}
			
		}		
		
		if(inputData.length() < 6 || inputData.length() > 15){
			valid = false;
		}
		
		// ��
		
		String[] invalid = {"789", "456", "123", "741", "852", "521", "963", "753", "951"};
		
		
		for(String iva : invalid){
			StringBuffer sb = new StringBuffer(iva);
			if(inputData.indexOf(iva) > -1 || inputData.indexOf(sb.reverse().toString()) > -1){
				valid = false;
			}
		}
		
		
		///////////////////////////// <-------------- ������� �ڵ� (1)
		
		return valid;
	}
	
	/**
	 * ���׼��� 2���� "��", "��"�� ��ȿ�� ���� ��Ģ�� �˻��ϴ� ���
	 * 
	 * @param 		inputData		��ȿ���� ������ Ű�е� ��ȣ
	 * @return		boolean			"��", "��" ��ȿ�� ���� ���
	 */
	public boolean checkComplexValidate( String inputData ) {
		
		boolean valid = true;
		
		////////////////////////������� �ڵ� (2) ---------------->
		
		// ��
		char c1, c2, c3;
		for(int i = 0; i < inputData.length() - 2; i++){
			c1 = inputData.charAt(i);
			c2 = inputData.charAt(i + 1);
			c3 = inputData.charAt(i + 2);
			if(c1 == c2 && c2 == c3){
				valid = false;
			}
			
		}	
		
		// ��
		
		for(int length = 2 ; length <= (inputData.length() / 2) ; length++){
			
//			System.out.println(length);
			
			for(int inx = 0 ; inx <= (inputData.length() - (length * 2)) ; inx++){
				
				String left = inputData.substring(inx, inx + length);
				String right = inputData.substring(inx + length, inx + (length * 2));
				
//				System.out.println(left + " " + right);
				
				if(left.equals(right)){
					valid = false;
				}
			}
			
		}
		
		///////////////////////////// <-------------- ������� �ڵ� (2)
		
		return valid;
	}
}
