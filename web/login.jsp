<%@ include file="/taglibs.jsp" %>
<tiles:insert page="/theme/tiles-simplepage.jsp">
   <tiles:put name="banner"       value="/theme/banner.jsp" />
   <tiles:put name="bannerStatus" value="/theme/bannerStatus.jsp" />
   <tiles:put name="head"         value="/theme/head.jsp" />
   <tiles:put name="styles"       value="/theme/empty.jsp" />
   <tiles:put name="messages"     value="/theme/messages.jsp" />
   <tiles:put name="content"      value="/loginBody.jsp" />
   <tiles:put name="footer"       value="/theme/footer.jsp" />
</tiles:insert>