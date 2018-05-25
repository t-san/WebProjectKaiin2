package bean;

import java.util.List;

//会員リストbean
public class ListOutBean
{
	private List<KaiinLineBean> line;

	public ListOutBean()
	{
	}

	public List<KaiinLineBean> getLine()
	{
		return line;
	}

	public void setLine(List<KaiinLineBean> line)
	{
		this.line = line;
	}

}
