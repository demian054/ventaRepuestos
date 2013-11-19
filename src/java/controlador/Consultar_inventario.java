/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/**
 *
 * @author demian
 */
public class Consultar_inventario implements Controller {

   
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        System.out.println("111");
        ModelAndView mv = new ModelAndView("consultar_Inventarios");
        String out = "Inventarios";
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            List result = session.createQuery("from Inventarios").list();
            System.out.println("111");
            mv.addObject("Inventarios", result);
            session.getTransaction().commit();
            
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        mv.addObject("Message", out);
        return mv;
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
