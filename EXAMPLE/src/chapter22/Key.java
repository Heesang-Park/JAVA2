package chapter22;

public class Key {
	public int number;
	Key(int number){
		this.number=number;
	}
	// equals �������̵�(������ �ּҸ� ���� �����)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key comparekey=(Key)obj;
			if(this.number==comparekey.number) {
				return true;
			}
		}
		return false;
	}
	// hashcode �������̵� (�������� �ּҸ� ���� �����)
	@Override
	public int hashCode() {
		return number;
	}
	
	
	
	
	
	
}
