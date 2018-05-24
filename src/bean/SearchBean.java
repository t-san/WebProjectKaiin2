package bean;

import java.util.Date;

import domain.SexEnum;

public class SearchBean
{
	private int id;
	private String name;
	private Date registDate;
	private SexEnum sex;



	public SearchBean() {
		super();
	}
	public SexEnum getSex()
	{
		return sex;
	}
	public void setSex(SexEnum sex)
	{
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", registDate=" + registDate+" ,sex="+sex;
	}


}
