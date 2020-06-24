<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.io.*" %>
<%@ page    import ="java.util.*"%>
<%@ page    import= "org.json.simple.*"%>
<%@ page    import ="org.json.simple.parser.*;" %>    
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>

<%      JSONParser parser = new JSONParser();
     try {
         Object obj = parser.parse(new FileReader("/resources/db/db.json"));
         JSONObject jsonObject = (JSONObject)obj;
         String name = (String)jsonObject.get("Name");
         String course = (String)jsonObject.get("Course");
         JSONArray subjects = (JSONArray)jsonObject.get("Subjects");
         System.out.println("Name: " + name);
         System.out.println("Course: " + course);
         System.out.println("Subjects:");%>
         <h1>mfdvnf</h1>
         <%
         Iterator iterator = subjects.iterator();
         while (iterator.hasNext()) {
            System.out.println(iterator.next());
         }
      } catch(Exception e) {
         e.printStackTrace();
      }
%>


</body>
</html>