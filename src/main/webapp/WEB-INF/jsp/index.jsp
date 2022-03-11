<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>

	</head>
	<body>
		<form:form action="calc" method="post" modelAttribute="operation">
		    <input type="number" name="operand1"/>
		    <select name="symbol">
              <option value="+">+</option>
              <option value="-">-</option>
              <option value="*">*</option>
              <option value="/">/</option>
            </select>
		    <input type="number" name="operand2"/>
			<input type="submit" value="Calculate"/>
		</form:form>
		<div>${result}</div>
	</body>
</html>
