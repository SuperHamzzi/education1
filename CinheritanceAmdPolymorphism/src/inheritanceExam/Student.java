package inheritanceExam;

public class Student {
//학번,이름,나이 -private
private String ssn;
private String name;
private int age;
private String major;

public Student() {
	major ="컴퓨터 공학";
}

public Student(String ssn, String name, int age, String major) {
	super();
	this.ssn = ssn;
	this.name = name;
	this.age = age;
	this.major = major;
}
public void showInfo() {
	System.out.println("학번:" +this.ssn);
	System.out.println("학번:" +ssn);
	
	System.out.println("이름:" +this.name);
	System.out.println("이름:" +name);
	System.out.println("나이:" +this.age);
	System.out.println("전공:" +this.major);
}
public String getSsn() {
	return ssn;
}
public void setSsn(String ssn) {
	this.ssn = ssn;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getMajor() {
	return major;
}

public void setMajor(String major) {
	this.major = major;
}


}
