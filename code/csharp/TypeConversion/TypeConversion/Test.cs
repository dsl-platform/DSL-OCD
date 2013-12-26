using System;
using System.Collections.Generic;
using System.Xml.Linq;

namespace TypeConversion
{
	class Test
	{
		Root root;

		public Test()
		{
			root = new Root();
			Dictionary<String, String> d = new Dictionary<String, String>();
			d.Add("jabuke", "10");
			d.Add("naranče", "15");
			XDocument doc = new XDocument();
			doc.Add(new XComment("Komentiram bezveze"));

			CalculatedTestsBoolean(false);
			CalculatedTestsDate(DateTime.Now);
			CalculatedTestsDouble(2.5454);
			CalculatedTestsFloat(1.23f);
			CalculatedTestsGuid(Guid.NewGuid());
			CalculatedTestsInt(37737373);
			CalculatedTestsLong(121212103903902939);
			CalculatedTestsMap(d);
			CalculatedTestsStringToGuid("f5c19b5b-e44e-4323-9462-05ae2e4aadb6");
			CalculatedTestsStringToXml("<stara><baba>72</baba></stara>");
			CalculatedTestsStringToMap("jabuke=10;naranče=20");
			CalculatedTestsStringToNumeric("1");
			CalculatedTestsXml(doc);

		}

		public void CalculatedTestsBoolean(Boolean val)
		{
			root.originalBoolean = val;
			Console.WriteLine("==========================================================");
			Console.WriteLine("Boolean calculations");
			Console.WriteLine("Original value             : {0}", root.originalBoolean);
			Console.WriteLine("Boolean -> Binary (Base64) : {0}", Convert.ToBase64String(root.calculatedBinaryFromBoolean));
			Console.WriteLine("Boolean -> String          : {0}", root.calculatedStringFromBoolean);
			Console.WriteLine("==========================================================");
		}

		public void CalculatedTestsDate(DateTime val)
		{
			root.originalDateTime = val;
			Console.WriteLine("==========================================================");
			Console.WriteLine("Date calculations");
			Console.WriteLine("Original value              : {0}", root.originalDateTime);
			Console.WriteLine("DateTime -> String          : {0}", root.calculatedStringFromDate);

			// these methods do convert to long, though return 2 different values
			Console.WriteLine("DateTime -> Long (Ticks)    : {0}", root.calculatedLongFromDate1);
			Console.WriteLine("DateTime -> Long (Binary)   : {0}", root.calculatedLongFromDate2);

			Console.WriteLine("DateTime -> Binary (Base64) : {0}", Convert.ToBase64String(root.calculatedBinaryFromDate));
			Console.WriteLine("==========================================================");
		}

		public void CalculatedTestsDouble(Double val)
		{
			root.originalDouble = val;
			Console.WriteLine("==========================================================");
			Console.WriteLine("Double calculations");
			Console.WriteLine("Original value            : {0}", root.originalDouble);
			Console.WriteLine("Double -> String          : {0}", root.calculatedStringFromDouble);
			Console.WriteLine("Double -> Int             : {0}", root.calculatedIntFromDouble);
			Console.WriteLine("Double -> Float           : {0}", root.calculatedFloatFromDouble);
			Console.WriteLine("Double -> Long            : {0}", root.calculatedLongFromDouble);
			Console.WriteLine("Double -> Binary (Base64) : {0}", Convert.ToBase64String(root.calculatedBinaryFromDouble));
			Console.WriteLine("Double -> Decimal         : {0}", root.calculatedDecimalFromDouble);
			Console.WriteLine("Double -> Boolean         : {0}", root.calculatedBooleanFromDouble);
			Console.WriteLine("==========================================================");
		}

		public void CalculatedTestsFloat(float val)
		{
			root.originalFloat = val;
			Console.WriteLine("==========================================================");
			Console.WriteLine("Float calculations");
			Console.WriteLine("Original value           : {0}", root.originalFloat);
			Console.WriteLine("Float -> String          : {0}", root.calculatedStringFromFloat);
			Console.WriteLine("Float -> Int             : {0}", root.calculatedIntFromFloat);
			Console.WriteLine("Float -> Double          : {0}", root.calculatedDoubleFromFloat);
			Console.WriteLine("Float -> Long            : {0}", root.calculatedLongFromFloat);
			Console.WriteLine("Float -> Binary (Base64) : {0}", Convert.ToBase64String(root.calculatedBinaryFromFloat));
			Console.WriteLine("Float -> Decimal         : {0}", root.calculatedDecimalFromFloat);
			Console.WriteLine("Float -> Boolean         : {0}", root.calculatedBooleanFromFloat);
			Console.WriteLine("==========================================================");
		}

		public void CalculatedTestsGuid(Guid val)
		{
			root.originalGuid = val;
			Console.WriteLine("==========================================================");
			Console.WriteLine("Guid calculations");
			Console.WriteLine("Original value          : {0}", root.originalGuid);
			Console.WriteLine("Guid -> String          : {0}", root.originalGuid);
			Console.WriteLine("Guid -> Binary (Base64) : {0}", Convert.ToBase64String(root.originalBinary));
			Console.WriteLine("==========================================================");
		}

		public void CalculatedTestsInt(int val)
		{
			root.originalInt = val;
			Console.WriteLine("==========================================================");
			Console.WriteLine("Int calculations");
			Console.WriteLine("Original value              : {0}", root.originalInt);
			Console.WriteLine("Int -> String (1st)         : {0}", root.calculatedStringFromInt1);
			Console.WriteLine("Int -> String (2nd)         : {0}", root.calculatedStringFromInt2);
			Console.WriteLine("Int -> Float                : {0}", root.calculatedFloatFromInt);
			Console.WriteLine("Int -> Double (1st)         : {0}", root.calculatedDoubleFromInt1);
			Console.WriteLine("Int -> Double (2nd)         : {0}", root.calculatedDoubleFromInt2);
			Console.WriteLine("Int -> Long (1st)           : {0}", root.calculatedLongFromInt1);
			Console.WriteLine("Int -> Long (2nd)           : {0}", root.calculatedLongFromInt2);
			// I prefer the first method. Second method shows different output, although is also legit
			Console.WriteLine("Int -> Binary (1st, Base64) : {0}", Convert.ToBase64String(root.calculatedBinaryFromInt1));
			//Console.WriteLine("Int -> Binary (2nd, Base64) : {0}", Convert.ToBase64String(root.calculatedBinaryFromInt2));
			Console.WriteLine("Int -> Decimal              : {0}", root.calculatedDecimalFromInt);
			Console.WriteLine("Int -> Boolean              : {0}", root.calculatedBooleanFromInt);
			Console.WriteLine("==========================================================");
		}

		public void CalculatedTestsLong(long val)
		{
			root.originalLong = val;
			Console.WriteLine("==========================================================");
			Console.WriteLine("Long calculations");
			Console.WriteLine("Original value          : {0}", root.originalLong);
			Console.WriteLine("Long -> String (1st)    : {0}", root.calculatedStringFromLong1);
			Console.WriteLine("Long -> String (2nd)    : {0}", root.calculatedStringFromLong2);
			Console.WriteLine("Long -> Int (1st)       : {0}", root.calculatedIntFromLong1);
			Console.WriteLine("Long -> Double (1st)    : {0}", root.calculatedDoubleFromLong1);
			Console.WriteLine("Long -> Double (2nd)    : {0}", root.calculatedDoubleFromLong2);
			Console.WriteLine("Long -> Float (1st)     : {0}", root.calculatedDoubleFromLong1);
			Console.WriteLine("Long -> Float (2nd)     : {0}", root.calculatedDoubleFromLong2);
			Console.WriteLine("Long -> Binary (Base64) : {0}", Convert.ToBase64String(root.calculatedBinaryFromLong));
			Console.WriteLine("Long -> Decimal         : {0}", root.calculatedDecimalFromLong);
			Console.WriteLine("Long -> Boolean         : {0}", root.calculatedBooleanFromLong);
			Console.WriteLine("==========================================================");
		}

		public void CalculatedTestsMap(System.Collections.Generic.Dictionary<String, String> val)
		{
			root.originalDictionary = val;
			Console.WriteLine("==========================================================");
			Console.WriteLine("Map calculations");
			Console.WriteLine("Original value         : {0}", root.originalDictionary);
			Console.WriteLine("Map -> String (1st)    : {0}", root.calculatedStringFromMap1);
			Console.WriteLine("Map -> String (2nd)    : {0}", root.calculatedStringFromMap2);
			Console.WriteLine("Map -> Binary (Base64) : {0}", Convert.ToBase64String(root.calculatedBinaryFromMap));
			Console.WriteLine("Map -> Xml             : {0}", root.calculatedXmlFromMap);
		}

		public void CalculatedTestsStringToNumeric(String val)
		{
			root.originalString = val;
			Console.WriteLine("==========================================================");
			Console.WriteLine("String to Numeric calculations 1");
			Console.WriteLine("Original value         : {0}", root.originalString);
			Console.WriteLine("String -> Int (1st)    : {0}", root.calculatedIntFromString1);
			Console.WriteLine("String -> Int (2nd)    : {0}", root.calculatedIntFromString2);
			Console.WriteLine("String -> long (1st)   : {0}", root.calculatedLongFromString1);
			Console.WriteLine("String -> long (2nd)   : {0}", root.calculatedLongFromString2);
			Console.WriteLine("String -> double (1st) : {0}", root.calculatedDoubleFromString1);
			Console.WriteLine("String -> double (2nd) : {0}", root.calculatedDoubleFromString2);
			Console.WriteLine("String -> float        : {0}", root.calculatedFloatFromString);
			Console.WriteLine("String -> Decimal      : {0}", root.calculatedDecimalFromString);
			Console.WriteLine("String -> Binary (1st) : {0}", Convert.ToBase64String(root.calculatedBinaryFromString1));
			Console.WriteLine("String -> Binary (2nd) : {0}", Convert.ToBase64String(root.calculatedBinaryFromString2));
			Console.WriteLine("String -> Boolean      : {0}", root.calculatedBooleanFromString);
			Console.WriteLine("==========================================================");
		}

		public void CalculatedTestsStringToMap(String val)
		{
			root.originalString = val;
			Console.WriteLine("==========================================================");
			Console.WriteLine("String to Map Calculations");
			Console.WriteLine("Original value         : {0}", root.originalString);
			Console.WriteLine("String -> Map          : {0}", root.calculatedMapFromString);
			Console.WriteLine("==========================================================");
		}

		public void CalculatedTestsStringToXml(String val)
		{
			root.originalString = val;
			Console.WriteLine("==========================================================");
			Console.WriteLine("String to Xml Calculations");
			Console.WriteLine("Original value         : {0}", root.originalString);
			Console.WriteLine("String -> Xml          : {0}", root.calculatedXmlFromString);
			Console.WriteLine("==========================================================");
		}

		public void CalculatedTestsStringToGuid(String val)
		{
			root.originalString = val;
			Console.WriteLine("==========================================================");
			Console.WriteLine("String To Guid Calculations");
			Console.WriteLine("Original value         : {0}", root.originalString);
			Console.WriteLine("String -> Guid         : {0}", root.calculatedGuidFromString);
			Console.WriteLine("==========================================================");
		}

		public void CalculatedTestsXml(XDocument val)
		{
			root.originalXml = val;
			Console.WriteLine("==========================================================");
			Console.WriteLine("Xml Calculations");
			Console.WriteLine("Original value         : {0}", root.originalXml);
			Console.WriteLine("Xml -> String          : {0}", root.calculatedStringFromXml);
			Console.WriteLine("Xml -> Binary (Base64) : {0}", Convert.ToBase64String(root.calculatedBinaryFromXml));
			Console.WriteLine("==========================================================");
		}
	}
}
