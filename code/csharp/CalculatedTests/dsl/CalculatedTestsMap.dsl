module CalculatedTestsMap {
  root TestMap {
    Map originalMap;

    // serialize map to string, i.e. key1 = value1; key2=value2...
    // Error: Unsupported method call: Join
    // calculated String calculatedStringFromMap from 'it => string.Join(";", it.originalMap.Select(x => x.Key + "=" + x.Value).ToArray())';

    // ERROR: 42883: function unnest(hstore) does not exist
    // calculated String calculatedStringFromMap from 'it => it.originalMap.Select(x => x.Key + "=" + x.Value).Aggregate((accumulator, next) => accumulator + next + ";")';


    /* Won't work, missing MemoryStream, BinaryFormatter
    calculated Binary calculatedBinaryFromMap from @"it =>
    {
	MemoryStream stream = new MemoryStream();
	BinaryFormatter formatter = new BinaryFormatter();

	formatter.Serialize(stream, it.originalMap);
	return stream.ToArray();
     }";
     **/

    // serialize map to xml, i.e. <root><key>value</key></root>
    // Error: The type or namespace name 'XElement' could not be found
    // calculated Xml calculatedXmlFromMap from 'it => new XElement("root", it.originalMap.Select(kv => new XElement(kv.Key, kv.Value)))';
  }
}
