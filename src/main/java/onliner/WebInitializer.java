package onliner;


import onliner.configuration.HibernateConfiguration;
import onliner.configuration.WebConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfiguration.class, HibernateConfiguration.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
