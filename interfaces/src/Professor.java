/**
 * 
 */

/**
 * @author gabri
 *
 */
public class Professor extends Employee implements Docent{
	
	private String group;
	private Schedule schedule;
	
	public void setGroup (String group, Schedule schedule) {
		this.group = group;
		this.schedule = schedule;
	}
	
	public String getGroup () {
		return group;
	}
	
	public Schedule getSchedule () {
		return schedule;
	}

}
