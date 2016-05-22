package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.avaje.ebean.Model;

@Entity
public class Task extends Model {

	@Id
	public Integer id;
	public String name;
	public Date period;

	public static Find<Integer, Task> find = new Find<Integer, Task>(){};
}
