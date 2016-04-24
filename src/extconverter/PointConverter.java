package extconverter;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import entity.Point;

public class PointConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		System.out.println("执行了convertFromString");
		String[] pointArray = arg1[0].split("\\_");
		Point point = new Point();
		point.setX(pointArray[0]);
		point.setY(pointArray[1]);
		return point;

	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		System.out.println("执行了convertToString");
		return ((Point) arg1).getX() + " " + ((Point) arg1).getY();
	}

}
