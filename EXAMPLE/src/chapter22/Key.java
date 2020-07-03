package chapter22;

public class Key {
	public int number;
	Key(int number){
		this.number=number;
	}
	// equals 오버라이딩(논리적인 주소를 같게 만든다)
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
	// hashcode 오버라이딩 (물리적인 주소를 같게 만든다)
	@Override
	public int hashCode() {
		return number;
	}
	
	
	
	
	
	
}
