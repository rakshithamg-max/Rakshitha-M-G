<%@ page import="java.util.*,com.model.Product" %>

<%
List<Product> list = (List<Product>) request.getAttribute("list");
%>

<table border="1">

<tr>
<th>ID</th><th>Name</th><th>Category</th><th>Price</th><th>Quantity</th>
</tr>

<%
if(list != null && !list.isEmpty()){
    for(Product p : list){
%>

<tr>
<td><%=p.getProductId()%></td>
<td><%=p.getProductName()%></td>
<td><%=p.getCategory()%></td>
<td><%=p.getPrice()%></td>
<td><%=p.getQuantity()%></td>
</tr>

<%
    }
} else {
%>

<tr>
<td colspan="5">No Records Found</td>
</tr>

<%
}
%>

</table>