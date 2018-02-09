<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleUserDaoProxyid" scope="session" class="com.tutorialspoint.UserDaoProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleUserDaoProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleUserDaoProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleUserDaoProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.tutorialspoint.UserDao getUserDao10mtemp = sampleUserDaoProxyid.getUserDao();
if(getUserDao10mtemp == null){
%>
<%=getUserDao10mtemp %>
<%
}else{
        if(getUserDao10mtemp!= null){
        String tempreturnp11 = getUserDao10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String id_1id=  request.getParameter("id22");
        int id_1idTemp  = Integer.parseInt(id_1id);
        com.tutorialspoint.User getUser13mtemp = sampleUserDaoProxyid.getUser(id_1idTemp);
if(getUser13mtemp == null){
%>
<%=getUser13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getUser13mtemp != null){
java.lang.String typename16 = getUser13mtemp.getName();
        String tempResultname16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename16));
        %>
        <%= tempResultname16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">profession:</TD>
<TD>
<%
if(getUser13mtemp != null){
java.lang.String typeprofession18 = getUser13mtemp.getProfession();
        String tempResultprofession18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprofession18));
        %>
        <%= tempResultprofession18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getUser13mtemp != null){
%>
<%=getUser13mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 24:
        gotMethod = true;
        String name_3id=  request.getParameter("name29");
            java.lang.String name_3idTemp = null;
        if(!name_3id.equals("")){
         name_3idTemp  = name_3id;
        }
        String profession_4id=  request.getParameter("profession31");
            java.lang.String profession_4idTemp = null;
        if(!profession_4id.equals("")){
         profession_4idTemp  = profession_4id;
        }
        String id_5id=  request.getParameter("id33");
        int id_5idTemp  = Integer.parseInt(id_5id);
        %>
        <jsp:useBean id="com1tutorialspoint1User_2id" scope="session" class="com.tutorialspoint.User" />
        <%
        com1tutorialspoint1User_2id.setName(name_3idTemp);
        com1tutorialspoint1User_2id.setProfession(profession_4idTemp);
        com1tutorialspoint1User_2id.setId(id_5idTemp);
        int addUser24mtemp = sampleUserDaoProxyid.addUser(com1tutorialspoint1User_2id);
        String tempResultreturnp25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addUser24mtemp));
        %>
        <%= tempResultreturnp25 %>
        <%
break;
case 35:
        gotMethod = true;
        String name_7id=  request.getParameter("name40");
            java.lang.String name_7idTemp = null;
        if(!name_7id.equals("")){
         name_7idTemp  = name_7id;
        }
        String profession_8id=  request.getParameter("profession42");
            java.lang.String profession_8idTemp = null;
        if(!profession_8id.equals("")){
         profession_8idTemp  = profession_8id;
        }
        String id_9id=  request.getParameter("id44");
        int id_9idTemp  = Integer.parseInt(id_9id);
        %>
        <jsp:useBean id="com1tutorialspoint1User_6id" scope="session" class="com.tutorialspoint.User" />
        <%
        com1tutorialspoint1User_6id.setName(name_7idTemp);
        com1tutorialspoint1User_6id.setProfession(profession_8idTemp);
        com1tutorialspoint1User_6id.setId(id_9idTemp);
        int updateUser35mtemp = sampleUserDaoProxyid.updateUser(com1tutorialspoint1User_6id);
        String tempResultreturnp36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateUser35mtemp));
        %>
        <%= tempResultreturnp36 %>
        <%
break;
case 46:
        gotMethod = true;
        String id_10id=  request.getParameter("id49");
        int id_10idTemp  = Integer.parseInt(id_10id);
        int deleteUser46mtemp = sampleUserDaoProxyid.deleteUser(id_10idTemp);
        String tempResultreturnp47 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteUser46mtemp));
        %>
        <%= tempResultreturnp47 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>