package Model;

public class Employee {
	public enum Role {
		PILOT,
		COPILOT,
		STEWARD
	}
	private String Name;
    private  Role role;

    public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}
