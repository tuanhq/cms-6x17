<%@page import="org.thq.business.ContentInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Trang chủ</title>
<link rel="stylesheet" href="plugin/css/bootstrap.css">
<link rel="stylesheet" href="plugin/css/main.css">
<link rel="stylesheet" href="css/displaytag.css" type="text/css">
<script type="text/javascript">
	var rownum = 1;
</script>
</head>
<body>
	<!--navbar start-->
	<nav class="navbar navbar-inverse" style="margin-bottom: 0px">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand"
					href="<%=request.getContextPath()%>/listCharge.do">Trang chủ</a>
			</div>
			<div>
				<ul class="nav navbar-nav">
					<li><a href="<%=request.getContextPath()%>/listContent.do">Danh
							sách nội dung</a></li>
					<li><a
						href="<%=request.getContextPath()%>/editContent.do?action=add">Thêm
							mới nội dung</a></li>
					<li><a href="giaithuong.html">Giải thưởng</a></li>
					<li><a href="FAQs.html">FAQs</a></li>
					<li><a href="lienhe.html">Liên hệ</a></li>


				</ul>
				<form role="search" class="navbar-form navbar-right">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="từ khóa">
					</div>
					<button class="btn btn-default" type="button">Tìm kiếm</button>
				</form>
			</div>
		</div>
	</nav>
	<!--navbar end-->

	<!--practice here-->
	<div class="col-md-2" style="padding-left: 0px">
		<ul class="nav nav-pills nav-stacked">
			<li class="active"><a
				href="<%=request.getContextPath()%>/listCharge.do">Danh sách
					charging</a></li>
			<li class="active"><a
				href="<%=request.getContextPath()%>/listContent.do">Danh sách
					nội dung</a></li>
			<li class="active"><a
				href="<%=request.getContextPath()%>/editContent.do?action=add">Thêm
					mới nội dung</a></li>
			<li class="active"><a href="FAQs.html">FAQs</a></li>
			<li class="active"><a href="lienhe.html">Liên hệ</a></li>
			<li class="active"><a href="dstrungthuong.html">Danh sách
					trúng thưởng</a></li>
		</ul>
	</div>

	<div class="col-md-10">
		<br />
		<br />
		<display:table uid="dto" class="grid-view"
			name="requestScope.listContentInfoForm.list"
			requestURI="/listContent.do" pagesize="20">
			<display:column headerClass="header" title="<strong>STT</strong>"
				style="width: 1%;text-align: center;font-weight: bold">
				<script>
							document.write(rownum++);
						</script>
			</display:column>
			<display:column sortName="id" headerClass="header"
				style="width: 18%;overflow: hidden;text-align: center;font-size: 13px"
				title="<span title='Sắp xếp tên'>ID</span>" sortable="true"
				property="id" />
			<display:column sortName="mo" headerClass="header"
				style="width: 18%;overflow: hidden;text-align: center;font-size: 13px"
				title="<span title='Sắp xếp tên'>MO</span>" sortable="true"
				property="mo" />
			<display:column sortName="mt" headerClass="header"
				style="width: 18%;overflow: hidden;text-align: center;font-size: 13px"
				title="<span title='Sắp xếp tên'>MT</span>" sortable="true"
				property="mt" />
			<display:column headerClass="header"
				style="width: 18%;overflow: hidden;text-align: center;font-size: 13px"
				title="<span title='Sắp xếp tên'>Action</span>" sortable="true">
				<a
					href="<%=request.getContextPath()%>/editContent.do?action=edit&id=<%=((ContentInfo)pageContext.getAttribute("dto")).getId()%>">
					Edit</a>&nbsp;
						<a
					onclick="return window.confirm('Bạn có chắc chắn muốn xóa các bản ghi này không?');"
					href="<%=request.getContextPath()%>/editContent.do?action=delete&id=<%=((ContentInfo)pageContext.getAttribute("dto")).getId()%>">Xóa</a>
			</display:column>

		</display:table>
	</div>

	<script src="plugin/js/jquery-2.1.1.min.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="plugin/js/bootstrap.js" type="text/javascript"
		charset="utf-8"></script>
</body>
</html>