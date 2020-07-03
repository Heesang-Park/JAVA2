package pk22;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number=number;
		
	}

	@Override
	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		// �θ�ü�� �ڽİ�ü�� �����Ǿ ����ȯ�� �������� �Ǵ�
		if(obj instanceof Key) {
			// �ٿ� ĳ�������� obj�� KeyŬ������ compareKey�� ����
			Key compareKey=(Key)obj;
			// this�� number�� compareKey�� number ���� ������ true �ƹ̳� false
			if(this.number==compareKey.number) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	
}
