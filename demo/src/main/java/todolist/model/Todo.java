package todolist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="todos")
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="titlex", nullable=false)
	private String titlexx;
	
	@Column(name="descx")
	private String descxx;
	

	
	public Todo() {
		
	}
	
	public Todo(String titlexx, String descxx) {
		super();
		this.titlexx = titlexx;
		this.descxx = descxx;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String gettitlexx() {
		return titlexx;
	}
	public void settitlexx(String titlexx) {
		this.titlexx = titlexx;
	}
	public String getdescxx() {
		return descxx;
	}
	public void setdescxx(String descxx) {
		this.descxx = descxx;
	}
	
}
