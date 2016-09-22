package prob2;

public class Member {
	private String id;
	private String name;
	
	public Member(String s, String s2) {
		setId(s);
		setName(s2);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return getId() + " : " + getName();
	}
}
