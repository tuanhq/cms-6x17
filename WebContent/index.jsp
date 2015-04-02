<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
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
  <nav class="navbar navbar-inverse" style="margin-bottom: 0px" >
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" href="<%=request.getContextPath()%>/listCharge.do">Trang chủ</a>
      </div>
      <div>
        <ul class="nav navbar-nav">          
          <li>
            <a href="<%=request.getContextPath()%>/listContent.do">Danh sách nội dung</a>
          </li>
          <li>
            <a href="<%=request.getContextPath()%>/editContent.do?action=add">Thêm mới nội dung</a>
          </li>
          <li>
            <a href="giaithuong.html">Giải thưởng</a>
          </li>
          <li>
            <a href="FAQs.html">FAQs</a>
          </li>
          <li>
            <a href="lienhe.html">Liên hệ</a>
          </li>
          
          
        </ul>
        <form role="search" class="navbar-form navbar-right">
          <div class="form-group">
            <input type="text" class="form-control" placeholder="từ khóa"></div>
          <button class="btn btn-default" type="button">Tìm kiếm</button>
        </form>
      </div>
    </div>
  </nav>
  <!--navbar end-->

  <!--practice here-->
  <div class="col-md-2" style="padding-left: 0px ">
  <ul class="nav nav-pills nav-stacked">
         <li class="active">
            <a href="<%=request.getContextPath()%>/listCharge.do">Danh sách charging</a>
          </li>
          <li class="active">
            <a href="<%=request.getContextPath()%>/listContent.do">Danh sách nội dung</a>
          </li>
          <li class="active">
            <a href="<%=request.getContextPath()%>/editContent.do?action=add">Thêm mới nội dung</a>
          </li>
          <li class="active">
            <a href="FAQs.html">FAQs</a>
          </li>
          <li class="active">
            <a href="lienhe.html">Liên hệ</a>
          </li>
          <li class="active">
            <a href="dstrungthuong.html">Danh sách trúng thưởng</a>
          </li>
  </ul>
  </div>

  <div class="col-md-10">
  		 <html:form action="/listCharge" method="post" >
  		 <br/><br/>  		 
  		 	CommandCode:<html:text property="cmc"></html:text>
  		 	&nbsp; FromDate :<html:text property="t1"></html:text>&nbsp;
  		 	ToDate :<html:text property="t1"></html:text>
  		 	<html:submit value="Lọc"></html:submit>   
  		 </html:form>
		<display:table id="dto" class="grid-view"
			name="requestScope.listChargingInfoForm.chargingInfoList"
			size="requestScope.listChargingInfoForm.total"
			requestURI="/listCharge.do" pagesize="20">
			<display:column headerClass="header" title="<strong>STT</strong>"
				style="width: 1%;text-align: center;font-weight: bold">
				<script>
					document.write(rownum++);
				</script>
			</display:column>
			<display:column sortName="userId" headerClass="header"
				style="width: 18%;overflow: hidden;text-align: center;font-size: 13px"
				title="<span title='Sắp xếp tên'>Thuê bao</span>" sortable="true"
				property="userId" />
			<display:column sortName="serviceId" headerClass="header"
				style="width: 18%;overflow: hidden;text-align: center;font-size: 13px"
				title="<span title='Sắp xếp tên'>Đầu số</span>" sortable="true"
				property="serviceId" />
			<display:column sortName="commandCode" headerClass="header"
				style="width: 18%;overflow: hidden;text-align: center;font-size: 13px"
				title="<span title='Sắp xếp tên'>Cú pháp</span>" sortable="true"
				property="commandCode" />
			<display:column sortName="timeStamp1" headerClass="header"
				style="width: 18%;overflow: hidden;text-align: center;font-size: 13px"
				title="<span title='Sắp xếp tên'>Ngày nhắn tin </span>"
				sortable="true" property="timeStamp1" />

		</display:table>
	</div>

  <script src="plugin/js/jquery-2.1.1.min.js" type="text/javascript" charset="utf-8"></script>
  <script src="plugin/js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>