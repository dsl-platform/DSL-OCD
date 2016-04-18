module CalculatedTestsString {
  root TestString {
    String originalString;

    // string => int, "100" should return 100
    calculated Int calculatedIntFromString from 'it => int.Parse(it.originalString)';

    // string => long, "100" should return 100l
    calculated Long calculatedLongFromString from 'it => long.Parse(it.originalString)';

    // string => double, "100" should return 100d
    calculated Double calculatedDoubleFromString from 'it => double.Parse(it.originalString)';

    // string => double, "100" should return 100f
    calculated Float calculatedFloatFromString from 'it => float.Parse(it.originalString)';

    // string => decimal
    calculated Decimal calculatedDecimalFromString from 'it => decimal.Parse(it.originalString)';

    // string => money
    calculated Money calculatedMoneyFromString from 'it => decimal.Parse(it.originalString)';

    // string => binary, this method doesn't work
    // calculated Binary calculatedBinaryFromString from 'it => System.Text.Encoding.UTF8.GetBytes(it.originalString)';

    // string => binary, BUG:  function unnest(character varying) does not exist
    // calculated Binary calculatedBinaryFromString from 'it => it.originalString.Select(e => (byte)e).ToArray<byte>()';

    // string => boolean, should convert "true", "false", "t", "f", "0" and "1" doesn't work
    calculated Boolean? calculatedBooleanFromString from 'it => it.originalString.Equals("true")';

    // string => guid ; BUG: Object reference not set to an instance of an object
    // calculated Guid calculatedGuidFromString from 'it => new Guid(it.originalString)';

    // string => Xml, XmlDocument missing
    // calculated Xml calculatedXmlFromString from 'it => XElement.parse(it.originalString)';

    // string => Map, doesn't work
    // calculated Map calculatedMapFromString from "it => {var d = new Dictionary<String, String>(); var list = it.originalString.Split(';').Select(e => e.Split(',')).Select(e => { d.Add(e[0], e[1]); return e; }); return d;}";

  }
}
