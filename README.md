# Test for Retrofit2 with SimpleXML

## Overwiew

The objective is to test deserialization of XML via a **Retrofit** server call.
The library for deserialization of XML is **SimpleXML** (for Java). 

## XML source of data

- https://www.w3schools.com/xml/simple.xml

## References

- [Retrofit](https://square.github.io/retrofit/) library
- [List of official converters](https://square.github.io/retrofit/#restadapter-configuration)
- [Simple](http://www.simpleframework.org/) framework / on [GitHub](https://github.com/ngallagher/simpleframework)
- SO question : [How to use Retrofit and SimpleXML together in downloading and parsing an XML file from a site?](https://stackoverflow.com/questions/25380280/how-to-use-retrofit-and-simplexml-together-in-downloading-and-parsing-an-xml-fil)

## Content of XML sample

Source : https://www.w3schools.com/xml/simple.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<breakfast_menu>
  <food>
    <name>Belgian Waffles</name>
    <price>$5.95</price>
    <description>Two of our famous Belgian Waffles with plenty of real maple syrup</description>
    <calories>650</calories>
  </food>
  <food>
    <name>Strawberry Belgian Waffles</name>
    <price>$7.95</price>
    <description>Light Belgian waffles covered with strawberries and whipped cream</description>
    <calories>900</calories>
  </food>
  <food>
    <name>Berry-Berry Belgian Waffles</name>
    <price>$8.95</price>
    <description>Light Belgian waffles covered with an assortment of fresh berries and whipped cream</description>
    <calories>900</calories>
  </food>
  <food>
    <name>French Toast</name>
    <price>$4.50</price>
    <description>Thick slices made from our homemade sourdough bread</description>
    <calories>600</calories>
  </food>
  <food>
    <name>Homestyle Breakfast</name>
    <price>$6.95</price>
    <description>Two eggs, bacon or sausage, toast, and our ever-popular hash browns</description>
    <calories>950</calories>
  </food>
</breakfast_menu>
```
