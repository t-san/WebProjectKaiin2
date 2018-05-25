package bean;

//登録bean
public class RegistBean
{
	//TODO ListOutBeanを追加する
	private ListOutBean list;

	public RegistBean()
	{
		super();
	}

	/*public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Date getRegistDate()
	{
		return registDate;
	}

	public void setRegistDate(Date registDate)
	{
		this.registDate = registDate;
	}

	public SexEnum getSex()
	{
		return sex;
	}

	public void setSex(SexEnum sex)
	{
		this.sex = sex;
	}*/

	public ListOutBean getList()
	{
		return list;
	}

	public void setList(ListOutBean list)
	{
		this.list = list;
	}

	//@Override
	/*public String toString()
	{
		return "RegistBean [id=" + id + ", name=" + name + ", registDate=" + registDate + ", sex=" + sex + "]";
	}*/

}
