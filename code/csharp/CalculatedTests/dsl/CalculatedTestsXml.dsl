// Xml resolves with System.Xml.Linq.XDocument
module CalculatedTestsXml {
  root TestXml {
    Xml originalXml;

    // Unsupported method call ToString()
    // calculated String calculatedStringFromXml from 'it => it.originalXml.ToString()';

    // won't work Encoding functions missing
    //calculated Binary calculatedBinaryFromXml from 'it =>  System.Text.Encoding.UTF8.GetBytes(it.originalXml.OuterXml)';
  }
}
