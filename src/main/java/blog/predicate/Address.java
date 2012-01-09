package blog.predicate;

import javax.xml.bind.annotation.*;
import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlAccessorType(XmlAccessType.FIELD)
public class Address {

     @XmlPath("node[@name='street']/text()")
     private String street;

}
