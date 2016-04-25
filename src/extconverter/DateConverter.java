package extconverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.xml.bind.TypeConstraintException;

import org.apache.struts2.util.StrutsTypeConverter;

public class DateConverter extends StrutsTypeConverter {

	private static SimpleDateFormat[] formatArray = {
			new SimpleDateFormat("yyyy-MM-dd"),
			new SimpleDateFormat("yyyy年MM月dd日"),
			new SimpleDateFormat("yyyy/MM/dd") };

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		System.out.println("执行了Date日期格式转换!");
		String dateString = arg1[0];
		for (int i = 0; i < formatArray.length; i++) {
			try {
				return formatArray[i].parse(dateString);
			} catch (ParseException e) {
				e.printStackTrace();
				continue;
			}
		}
		throw new TypeConstraintException("日期转换失败");
	}

	// convertToString()方法仅仅在使用Struts2标签输出时调用
	@Override
	public String convertToString(Map arg0, Object arg1) {
		System.out.println("DateConverter convertToString");
		return "在IE中输出："
				+ new SimpleDateFormat("yyyy-MM-dd").format((Date) arg1);
	}

}
