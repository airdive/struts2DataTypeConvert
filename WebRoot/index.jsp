<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<body>
		<s:form action="register.action" method="post">
			<s:textfield name="username" label="username"></s:textfield>
			<s:textfield name="age" label="age"></s:textfield>
			<s:textfield name="insertdate" label="insertdate"></s:textfield>
			<s:textfield name="point" label="point"></s:textfield>
			<s:submit value="提交按钮"></s:submit>
		</s:form>
	</body>
</html>
