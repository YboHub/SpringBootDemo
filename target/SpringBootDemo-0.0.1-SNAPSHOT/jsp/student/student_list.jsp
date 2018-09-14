<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'student_list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>

  </head>
  
  <body>
  	<table>
  		
  	</table>
    <script type="text/javascript">
    	$(function(){
    		$.post('student/datagrid',function(data){
    			var str = '';
    			for ( var int = 0; int < data.length; int++) {
					str+= '<tr><td>'+data[i].id+'</td><td>'+data[i].sname+'</td></tr>';
				}
				$('table').append(str);
    		},'json');
    	});
    </script>
  </body>
</html>
