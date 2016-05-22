package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.avaje.ebean.Model;
import play.data.validation.Constraints.*;

@Entity
public class Task extends Model {

	@Id
	public Integer id;
	@Required(message="nameを入力してください。")
	@MaxLength(value=100, message="名前が長すぎます(100文字以下)")
	@MinLength(value=2, message="名前が短すぎます(2文字以上)")
	public String name;
	public Date period;

	public static Find<Integer, Task> find = new Find<Integer, Task>(){};
}
