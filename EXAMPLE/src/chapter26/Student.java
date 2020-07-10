package chapter26;

public class Student {
//	이름, 학과, 학번, 학점 평균
	private String name;
	private String depart;
	private String number;
	private double grade;
	Student(String name, String depart, String number,
			double grade){
		this.name=name;
		this.depart=depart;
		this.number=number;
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	
	public String getDepart() {
		return depart;
	}
	
	public String getNumber() {
		return number;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public void findStudent(String name) {
		if(name.equals(this.name)) {
			System.out.println(this.name+","+this.depart+","+this.number+
					","+this.grade);
		}
	}

	

	
	
	
}
