
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List charging</title>

<link rel="stylesheet" href="css/displaytag.css" type="text/css">


<script type="text/javascript">
	var rownum = 1;
</script>

</head>
<body>
	<table with="100%">
		<tr>
			<td colspan="2">Header</td>

		</tr>
		<tr>
			<td>Lefmenu</td>
			<td><display:table id="dto" class="grid-view"
					name="requestScope.listChargingInfoForm.chargingInfoList"
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

				</display:table></td>
		</tr>
		<tr>
			<td colspan="2">Footer</td>
		</tr>
	</table>
</body>
</html>