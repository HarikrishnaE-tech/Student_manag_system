package entity;

public class Student {
private String stdid; 
private String stdname;
private int stdage;
private int stdmark;
private int stdclass;
private int count=101;

public Student(String stdname,int stdage,int stdmark,int stdclass) {
	this.stdid="SHHS"+count;
	count++;
	this.stdname=stdname;
	this.stdage=stdage;
	this.stdmark=stdmark;
	this.stdclass=stdclass;
	
	
}

public String getStdid() {
	return stdid;
}

public void setStdid(String stdid) {
	this.stdid = stdid;
}

public String getStdname() {
	return stdname;
}

public void setStdname(String stdname) {
	this.stdname = stdname;
}

public int getStdage() {
	return stdage;
}

public void setStdage(int stdage) {
	this.stdage = stdage;
}

public int getStdmark() {
	return stdmark;
}

public void setStdmark(int stdmark) {
	this.stdmark = stdmark;
}

public int getStdclass() {
	return stdclass;
}

public void setStdclass(int stdclass) {
	this.stdclass = stdclass;
}

@Override
public String toString() {
	return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdage=" + stdage + ", stdmark=" + stdmark
			+ ", stdclass=" + stdclass + "]";
}













}
