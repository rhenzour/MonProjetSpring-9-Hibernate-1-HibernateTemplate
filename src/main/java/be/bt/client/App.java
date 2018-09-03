package be.bt.client;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.bt.repository.CompteRepositoryImpl;

public class App 
{
    public static void main( String[] args )
    {
     // démarrer le contexte Spring
    ConfigurableApplicationContext txct= new ClassPathXmlApplicationContext("beans.xml");
    CompteRepositoryImpl ob=txct.getBean(CompteRepositoryImpl.class);
    System.out.println(ob.finById("A100"));
    txct.close();
    }
}
