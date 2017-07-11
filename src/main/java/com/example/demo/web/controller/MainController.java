package com.example.demo.web.controller;

import com.example.demo.hibernate.HibernateUtil;
import com.example.demo.hibernate.entity.ChesEntity;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Controller
public class MainController {
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    @ResponseBody
    public String index() {//@RequestParam("id") int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<ChesEntity> list = ((List<ChesEntity>) session.createQuery("from ChesEntity")
                //.setParameter("id", id)
                .list());
        Date date = new Date(new GregorianCalendar(2017, 2, 2).getTimeInMillis());
        ChesEntity result1 = list.get(0);
        for (Object result : list) {
            System.out.println(result.toString());
        }
        session.close();
        //HibernateUtil.closeSessionFactory();
        return result1.getDateColumn().toString();
    }
}
