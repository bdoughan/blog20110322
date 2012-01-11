Map to Element based on an Attribute Value with EclipseLink JAXB (MOXy)
=======================================================================

This is the complete source code for the following blog post:

* http://blog.bdoughan.com/2011/03/map-to-element-based-on-attribute-value.html

Summary
-------

In EclipseLink 2.3 the @XmlPath annotation was enhanced to support predicates.  This allows us to map the class below:

    @XmlRootElement(name="node")
    public class Customer {
  
        @XmlPath("node[@name='name']/text()")
        private String lastName;
 
        @XmlPath("node[@name='address']")
        private Address address;
 
        @XmlPath("node[@name='phone-number']")
        private List<PhoneNumber> phoneNumbers;
 
    }
    
To the following XML:

    <?xml version="1.0" encoding="UTF-8"?>
    <node>
        <node name="name">Jane Doe</node>
        <node name="address">
            <node name="street">123 A Street</node>
        </node>
        <node name="phone-number" type="work">555-1111</node>
        <node name="phone-number" type="cell">555-2222</node>
    </node>

Compile the Example
-------------------

You can compile the example code using the following command.  Maven will automatically fetch the required dependencies.

     mvn compile

Run the Example
---------------

You can run the example using the following command.

    mvn exec:java