package controller;

import dao.InsertDao;
import dto.InsertDto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/insert")
public class InsertController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String textLine = request.getParameter("textLine");

        System.out.println(request.getParameter("title"));
        System.out.println(request.getParameter("textLine"));

        InsertDto insertDto = new InsertDto(title, textLine);
        InsertDao insertDao = new InsertDao();
        insertDao.insert(insertDto);

    }
}
