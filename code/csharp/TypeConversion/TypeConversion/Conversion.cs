using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Runtime.Serialization.Formatters.Binary;
using System.Xml.Linq;
/*
 * FEATURES THAT AREN'T CURRENTLY SUPPORTED BY DSL, BUT SHOULD BE:
 * 1) System.BitConverter
 * 2) System.Convert
 * 3) System.Text.UTF8Encoding.getBytes(string)
 * 4) DateTime functions
 * 5) XML functions
 * 6) define params in Map, for now default is Map which resolves to Dictionary<String, String>
 * */

namespace TypeConversion
{
	public class Root
	{
		public String originalString = "1000";
		public int originalInt = 589989891;
		public long originalLong = 3;
		public Decimal originalDecimal = new Decimal(3.455352525);
		public float originalFloat = 1000000.45f;
		public double originalDouble = 291892819821.21d;
		public DateTime originalDateTime = DateTime.Now;
		public List<Double> originalListDouble = new List<double> { 1.54, 2.553255, 3, 98291, 4.22121 };
		public Dictionary<String, String> originalDictionary = new Dictionary<string, string>();
		public Guid originalGuid = new Guid();
		public XDocument originalXml = new XDocument();
		public Boolean originalBoolean = true;
		public byte[] originalBinary = new byte[] { };


		public Root()
		{
			originalDictionary.Add("iban", "hr123456789101010101");
			originalDictionary.Add("swift", "zaba1203");
		}

		/*
		 * ALL CONVERSIONS FROM ORIGINAL INT TO SOMETHING
		 * */
		// int => String
		public Func<Root, String> StringFromInt1 = it => it.originalInt.ToString();                // WORKS IN DSL, CONSOLE
		public String calculatedStringFromInt1 { get { return StringFromInt1(this); } }
		public Func<Root, String> StringFromInt2 = it => System.Convert.ToString(it.originalInt);  // DOESN'T WORK IN DSL, BUT IT'S OK IN CONSOLE
		public String calculatedStringFromInt2 { get { return StringFromInt2(this); } }
		// int => long
		public Func<Root, long> LongFromInt1 = it => (long)it.originalInt;
		public long calculatedLongFromInt1 { get { return LongFromInt1(this); } }
		public Func<Root, long> LongFromInt2 = it => Convert.ToInt64(it.originalInt);
		public long calculatedLongFromInt2 { get { return LongFromInt2(this); } }
		// int => float
		public Func<Root, float> FloatFromInt = it => (float)it.originalInt;
		public float calculatedFloatFromInt { get { return FloatFromInt(this); } }
		// int => double
		public Func<Root, double> DoubleFromInt1 = it => (double)it.originalInt;
		public double calculatedDoubleFromInt1 { get { return DoubleFromInt1(this); } }
		public Func<Root, double> DoubleFromInt2 = it => Convert.ToDouble(it.originalInt);
		public double calculatedDoubleFromInt2 { get { return DoubleFromInt2(this); } }
		// int => decimal
		public Func<Root, decimal> DecimalFromInt = it => (decimal)it.originalInt;
		public decimal calculatedDecimalFromInt { get { return DecimalFromInt(this); } }
		// int => byte[]
		public Func<Root, byte[]> BinaryFromInt1 = it => BitConverter.GetBytes(it.originalInt);   // DOESN'T WORK IN DSL.TODO: nature of bit conversion...?
		public byte[] calculatedBinaryFromInt1 { get { return BinaryFromInt1(this); } }

		public Func<Root, byte[]> BinaryFromInt2 = it =>
		{
			byte[] bytes = new byte[4];
			for (int i = 0; i <= 3; i++) { bytes[i] = (byte)((i > 0) ? it.originalInt >> 8 * (3 - i) : it.originalInt); }
			return bytes;

			/*
			 * this part of code was c/p from 
			 * http://www.dotnetframework.org/default.aspx/DotNET/DotNET/8@0/untmp/whidbey/REDBITS/ndp/clr/src/BCL/System/BitConverter@cs/1/BitConverter@cs
			 * */
			//byte[] bytes = new byte[4];
			//fixed (byte* b = bytes)
			//    *((int*)b) = it.originalInt;
			//return bytes;
		};
		public byte[] calculatedBinaryFromInt2 { get { return BinaryFromInt2(this); } }
		// int => boolean
		public Func<Root, Boolean?> BooleanFromInt = it => { if (it.originalInt == 0) return false; else if (it.originalInt == 1) return true; else return null; };
		public Boolean? calculatedBooleanFromInt { get { return BooleanFromInt(this); } }
		// int => datetime (doesn't work in DSL), well it's possible but it makes more sense to pass long value
		public Func<Root, DateTime> DateTimeFromInt = it => DateTime.MinValue.AddTicks(it.originalInt);
		public DateTime calculatedDateTimeFromInt { get { return DateTimeFromInt(this); } }
		// int => guid, won't work in dsl 
		public Func<Root, Guid> GuidFromInt = it =>
		{
			byte[] bytes = new byte[16];
			BitConverter.GetBytes(it.originalInt).CopyTo(bytes, 0);
			return new Guid(bytes);
		};
		public Guid calculatedGuidFromInt { get { return GuidFromInt(this); } }

		/*
		 * ALL CONVERSIONS FROM ORIGINAL STRING TO SOMETHING
		 * */
		// String => int
		public Func<Root, int> IntFromString1 = it => int.Parse(it.originalString);
		public int calculatedIntFromString1 { get { return IntFromString1(this); } }
		public Func<Root, int> IntFromString2 = it => Convert.ToInt32(it.originalString);
		public int calculatedIntFromString2 { get { return IntFromString2(this); } }
		// String => long
		public Func<Root, long> LongFromString1 = it => long.Parse(it.originalString);
		public long calculatedLongFromString1 { get { return LongFromString1(this); } }
		public Func<Root, long> LongFromString2 = it => Convert.ToInt64(it.originalString);
		public long calculatedLongFromString2 { get { return LongFromString2(this); } }
		// String => double
		public Func<Root, double> DoubleFromString1 = it => double.Parse(it.originalString);
		public double calculatedDoubleFromString1 { get { return DoubleFromString1(this); } }
		public Func<Root, double> DoubleFromString2 = it => Convert.ToDouble(it.originalString);
		public double calculatedDoubleFromString2 { get { return DoubleFromString2(this); } }
		// String => float
		public Func<Root, float> FloatFromString = it => float.Parse(it.originalString);
		public float calculatedFloatFromString { get { return FloatFromString(this); } }
		// String => bigdecimal
		public Func<Root, decimal> DecimalFromString = it => decimal.Parse(it.originalString);
		public decimal calculatedDecimalFromString { get { return DecimalFromString(this); } }
		// String => byte[], won't work in dsl
		public Func<Root, byte[]> BinaryFromString1 = it => System.Text.Encoding.UTF8.GetBytes(it.originalString); // UTF8, UTF7, UTF32, ASCII, Unicode, 
		public byte[] calculatedBinaryFromString1 { get { return BinaryFromString1(this); } }
		// String => byte[], won't work in dsl
		public Func<Root, byte[]> BinaryFromString2 = it => it.originalString.Select(e => (byte)e).ToArray<byte>();
		public byte[] calculatedBinaryFromString2 { get { return BinaryFromString2(this); } }
		// String => UUID
		public Func<Root, Guid> GuidFromString = it => new Guid(it.originalString);
		public Guid calculatedGuidFromString { get { return GuidFromString(this); } }
		// String => String[]
		public Func<Root, String[]> ArrayFromString = it => it.originalString.Split(','); // whatever delimiter
		public String[] calculatedArrayFromString { get { return ArrayFromString(this); } }
		// String => List<String>
		public Func<Root, List<String>> ListFromString = it => new List<string>(it.originalString.Split(',')); // whatever delimiter
		public List<String> calculatedListFromString { get { return ListFromString(this); } }
		// String => Bool?, check if value equals "true", "false", "t", "f", 0 or 1
		public Func<Root, Boolean?> BooleanFromString = it =>
		{
			if (it.originalString.Equals("true") || it.originalString.Equals("t") || it.originalString.Equals("1")) return true;
			else if (it.originalString.Equals("false") || it.originalString.Equals("f") || it.originalString.Equals("0")) return false;
			else return null;
		};

		public Boolean? calculatedBooleanFromString { get { return BooleanFromString(this); } }
		// String => Xml
		public Func<Root, XDocument> XmlFromString = it => XDocument.Parse(it.originalString);
		public XDocument calculatedXmlFromString { get { return XmlFromString(this); } }
		// String => Datetime, won't work in dsl
		public Func<Root, DateTime> DateTimeFromString = it => DateTime.ParseExact(it.originalString, "dd-MM-yyyy HH:mm", CultureInfo.InvariantCulture);
		public DateTime calculatedDateTimeFromString { get { return DateTimeFromString(this); } }
		// String => Dictionary<String, String>  i.e. "5,3;2,4"
		public Func<Root, IDictionary<String, String>> MapFromString = it =>
		{
			var d = new Dictionary<String, String>();
			var list = it.originalString.Split(';').Select(e => e.Split('=')).Select(e => { d.Add(e[0], e[1]); return e; });
			return d;
		};
		public IDictionary<String, String> calculatedMapFromString { get { return MapFromString(this); } }

		/*
		 * ALL CONVERSIONS FROM ORIGINAL LONG TO SOMETHING
		 * */
		// long => String
		public Func<Root, String> StringFromLong1 = it => it.originalLong.ToString();
		public String calculatedStringFromLong1 { get { return StringFromLong1(this); } }
		public Func<Root, String> StringFromLong2 = it => Convert.ToString(it.originalLong);
		public String calculatedStringFromLong2 { get { return StringFromLong2(this); } }
		// long => int
		public Func<Root, int> IntFromLong1 = it => (int)it.originalLong;
		public int calculatedIntFromLong1 { get { return IntFromLong1(this); } }
		//		public Func<Root, int> IntFromLong2 = it => Convert.ToInt32(it.originalLong);
		//		public int calculatedIntFromLong2 { get { return IntFromLong2(this); } }
		// long => double
		public Func<Root, double> DoubleFromLong1 = it => (double)it.originalLong;
		public double calculatedDoubleFromLong1 { get { return DoubleFromLong1(this); } }
		public Func<Root, double> DoubleFromLong2 = it => Convert.ToDouble(it.originalLong);
		public double calculatedDoubleFromLong2 { get { return DoubleFromLong2(this); } }
		// long => float
		public Func<Root, float> FloatFromLong = it => (float)it.originalLong;
		public float calculatedFloatFromLong { get { return FloatFromLong(this); } }
		// long => byte[]
		public Func<Root, byte[]> BinaryFromLong = it => BitConverter.GetBytes(it.originalLong);
		public byte[] calculatedBinaryFromLong { get { return BinaryFromLong(this); } }
		// long => decimal
		public Func<Root, decimal> DecimalFromLong = it => (decimal)it.originalLong;
		public decimal calculatedDecimalFromLong { get { return DecimalFromLong(this); } }
		// long => boolean
		public Func<Root, Boolean> BooleanFromLong = it => it.originalLong != 0;
		public Boolean calculatedBooleanFromLong { get { return BooleanFromLong(this); } }
		// long => datetime
		public Func<Root, DateTime> DateTimeFromLong = it => DateTime.MinValue.AddTicks(it.originalLong);
		public DateTime calculatedDateTimeFromLong { get { return DateTimeFromLong(this); } }
		/*
		 * ALL CONVERSIONS FROM DECIMAL TO SOMETHING
		 * */
		// Decimal => String
		public Func<Root, String> StringFromDecimal = it => it.originalDecimal.ToString();
		public String calculatedStringFromDecimal1 { get { return StringFromDecimal(this); } }
		// Decimal => int
		public Func<Root, int> IntFromDecimal = it => (int)it.originalDecimal;
		public int calculatedIntFromDecimal { get { return IntFromDecimal(this); } }
		// Decimal => double
		public Func<Root, double> DoubleFromDecimal1 = it => (double)it.originalDecimal;
		public double calculatedDoubleFromDecimal1 { get { return DoubleFromLong1(this); } }
		// Decimal => float
		public Func<Root, float> FloatFromDecimal = it => (float)it.originalDecimal;
		public float calculatedFloatFromDecimal { get { return FloatFromDecimal(this); } }
		// Decimal => byte[]
		//public Func<Root, byte[]> BinaryFromDecimal = it => BitConverter.GetBytes(it.originalDecimal.);
		// public byte[] calculatedBinaryFromDecimal { get { return BinaryFromDecimal(this); } }
		// Decimal => long
		public Func<Root, long> LongFromDecimal = it => (long)it.originalDecimal;
		public long calculatedLongFromDecimal { get { return LongFromDecimal(this); } }
		// Decimal => boolean
		public Func<Root, Boolean> BooleanFromDecimal = it => it.originalDecimal != 0;
		public Boolean calculatedBooleanFromDecimal { get { return BooleanFromDecimal(this); } }


		/*
		 * ALL CONVERSIONS FROM ORIGINAL FLOAT TO SOMETHING
		 * */
		// float => String
		public Func<Root, String> StringFromFloat = it => it.originalFloat.ToString();
		public String calculatedStringFromFloat { get { return StringFromFloat(this); } }
		// float => long
		public Func<Root, long> LongFromFloat = it => (long)it.originalFloat;
		public long calculatedLongFromFloat { get { return LongFromFloat(this); } }
		// float => int
		public Func<Root, int> IntFromFloat = it => (int)it.originalFloat;
		public int calculatedIntFromFloat { get { return IntFromFloat(this); } }
		// float => double
		public Func<Root, double> DoubleFromFloat = it => (double)it.originalFloat;
		public double calculatedDoubleFromFloat { get { return DoubleFromFloat(this); } }
		// float => decimal
		public Func<Root, decimal> DecimalFromFloat = it => (decimal)it.originalFloat;
		public decimal calculatedDecimalFromFloat { get { return DecimalFromFloat(this); } }
		// float => byte[], won't work in dsl
		public Func<Root, byte[]> BinaryFromFloat = it => BitConverter.GetBytes(it.originalFloat);
		public byte[] calculatedBinaryFromFloat { get { return BinaryFromFloat(this); } }
		// float => boolean
		public Func<Root, Boolean> BooleanFromFloat = it => (it.originalFloat != 0f);
		public Boolean calculatedBooleanFromFloat { get { return BooleanFromFloat(this); } }
		// float => datetime doesn't make sense to use


		/*
		 * ALL CONVERSIONS FROM ORIGINAL DOUBLE TO SOMETHING
		 * */
		// double => String
		public Func<Root, String> StringFromDouble = it => it.originalDouble.ToString();                // WORKS IN DSL, CONSOLE
		public String calculatedStringFromDouble { get { return StringFromDouble(this); } }
		// double => long
		public Func<Root, long> LongFromDouble = it => (long)it.originalDouble;
		public long calculatedLongFromDouble { get { return LongFromDouble(this); } }
		// double => int
		public Func<Root, int> IntFromDouble = it => (int)it.originalDouble;
		public int calculatedIntFromDouble { get { return IntFromDouble(this); } }
		// double => float
		public Func<Root, float> FloatFromDouble = it => (float)it.originalDouble;
		public float calculatedFloatFromDouble { get { return FloatFromDouble(this); } }
		// double => decimal
		public Func<Root, decimal> DecimalFromDouble = it => (decimal)it.originalDouble;
		public decimal calculatedDecimalFromDouble { get { return DecimalFromDouble(this); } }
		// double => byte[], won't work in dsl
		public Func<Root, byte[]> BinaryFromDouble = it => BitConverter.GetBytes(it.originalDouble);
		public byte[] calculatedBinaryFromDouble { get { return BinaryFromDouble(this); } }
		// double => boolean
		public Func<Root, Boolean> BooleanFromDouble = it => it.originalDouble != 0d;
		public Boolean calculatedBooleanFromDouble { get { return BooleanFromDouble(this); } }

		/*
		 * DATE AND TIMESTAMP CONVERSIONS
		 * */
		// Date => String
		public Func<Root, String> StringFromDate = it => it.originalDateTime.ToString("dd-MM-yyyy HH:mm");
		public String calculatedStringFromDate { get { return StringFromDate(this); } }
		// Date => long get exact milliseconds from 1.1.1970
		public Func<Root, long> LongFromDate1 = it => it.originalDateTime.Ticks;
		public long calculatedLongFromDate1 { get { return LongFromDate1(this); } }
		public Func<Root, long> LongFromDate2 = it => it.originalDateTime.ToBinary();
		public long calculatedLongFromDate2 { get { return LongFromDate2(this); } }
		// Date => byte[] get exact milliseconds from 1.1.1970
		public Func<Root, byte[]> BinaryFromDate = it => BitConverter.GetBytes(it.originalDateTime.ToBinary());
		public byte[] calculatedBinaryFromDate { get { return BinaryFromDate(this); } }


		/*
		 * Guid CONVERSIONS
		 * */
		// Guid => String
		public Func<Root, String> StringFromGuid = it => it.originalGuid.ToString();
		public String calculatedStringFromGuid { get { return StringFromGuid(this); } }
		// Guid => byte[] 
		public Func<Root, byte[]> BinaryFromGuid = it => it.originalGuid.ToByteArray();
		public byte[] calculatedBinaryFromGuid { get { return BinaryFromGuid(this); } }

		/*
		 * Xml CONVERSIONS
		 * */
		// Xml => String
		public Func<Root, String> StringFromXml = it => it.originalXml.ToString();
		public String calculatedStringFromXml { get { return StringFromXml(this); } }
		// Xml => byte[] 
		public Func<Root, byte[]> BinaryFromXml = it => System.Text.Encoding.UTF8.GetBytes(it.originalXml.ToString());
		public byte[] calculatedBinaryFromXml { get { return BinaryFromXml(this); } }

		/*
		 * Boolean Conversions
		 * */
		public Func<Root, String> StringFromBoolean = it => it.originalBoolean ? "true" : "false";
		public String calculatedStringFromBoolean { get { return StringFromBoolean(this); } }
		public Func<Root, byte[]> BinaryFromBoolean = it => new byte[] { (byte)(it.originalBoolean ? 0x01 : 0x00) };
		public byte[] calculatedBinaryFromBoolean { get { return BinaryFromBoolean(this); } }


		/*
		 * Binary Conversions
		 * */
		// binary -> long
		public Func<Root, long> LongFromBinary = it => BitConverter.ToInt64(it.originalBinary, 0);
		public long calculatedLongFromBinary { get { return LongFromBinary(this); } }

		// binary -> int
		public Func<Root, int> IntFromBinary = it => BitConverter.ToInt32(it.originalBinary, 0);
		public int calculatedIntFromBinary { get { return IntFromBinary(this); } }

		// binary -> datetime
		public Func<Root, DateTime> DateFromBinary = it => DateTime.FromBinary(BitConverter.ToInt64(it.originalBinary, 0));
		public DateTime calculatedDateTimeFromBinary { get { return DateFromBinary(this); } }

		// binary -> double
		public Func<Root, double> DoubleFromBinary = it => BitConverter.ToDouble(it.originalBinary, 0);
		public double calculatedDoubleFromBinary { get { return DoubleFromBinary(this); } }

		// binary -> boolean
		public Func<Root, Boolean> BooleanFromBinary = it => BitConverter.ToBoolean(it.originalBinary, 0);
		public Boolean calculatedBooleanFromBinary { get { return BooleanFromBinary(this); } }

		// binary -> string
		public Func<Root, String> StringFromBinary = it => BitConverter.ToString(it.originalBinary, 0);
		public String calculatedStringFromBinary { get { return StringFromBinary(this); } }

		// binary -> float
		public Func<Root, float> FloatFromBinary = it => BitConverter.ToSingle(it.originalBinary, 0);
		public float calculatedFloatFromBinary { get { return FloatFromBinary(this); } }

		// double is 8 bytes, and decimal is 16 bytes
		public Func<Root, decimal> DecimalFromBinary = it => (decimal)BitConverter.ToDouble(it.originalBinary, 0);
		public decimal calculatedDecimalFromBinary { get { return DecimalFromBinary(this); } }

		/*
		 * 
		 * COLLECTION CALCULATIONS
		 * All Linq methods, for manipulating collections, are supported
		 * */
		/* FILTER
		 * retrieve all numbers bigger than 2
		 * use case: i.e.
		 * say we have a List<Transaction>, and transaction holds amount, balance, date...
		 * you can filter to retrieve all outgoing transactions by applying negative amount check
		 * */
		public Func<Root, List<Double>> filterList1 = it => it.originalListDouble.Where(elem => elem > 2).ToList<Double>();
		public List<Double> transformedListDouble1 { get { return filterList1(this); } }
		/*
		 * FILTER AND TRANSFORMATION
		 * Now return those smallert than 100 and multiply all elements by 10
		 * */
		public Func<Root, List<Double>> filterList2 = it => it.originalListDouble.Where((elem, index) => elem < 100).Select((i, index) => i + index).ToList<Double>();
		public List<Double> transformedListDouble2 { get { return filterList2(this); } }

		/*
		 * GROUP BY
		 * ODD AND EVEN
		 * */
		public Func<Root, IDictionary<bool, List<Double>>> filterList3 = it => it.originalListDouble.GroupBy(e => e % 2 == 0).ToDictionary(i => i.Key, i => i.ToList<Double>());
		public IDictionary<bool, List<Double>> transformedListDouble3 { get { return filterList3(this); } }



		/*
		 * Dictionary<String, String> (Map) CALCULATIONS
		 * */
		// find value from Map
		public Func<Root, String> filterDictionary = it => it.originalDictionary["iban"];
		public String filteredStringFromDictionary { get { return filterDictionary(this); } }
		// Map to List<List<String>> 
		public Func<Root, List<List<String>>> ListValuesFromMap = it => it.originalDictionary.Select(e => new List<String> { e.Key, e.Value }).ToList();
		public List<List<String>> calculatedListValuesFromMap { get { return ListValuesFromMap(this); } }
		//Map to String

		//serialize map to byte[]
		public Func<Root, byte[]> serializeMapToByteArray = it =>
		{
			MemoryStream stream = new MemoryStream();
			BinaryFormatter formatter = new BinaryFormatter();

			formatter.Serialize(stream, it.originalDictionary);
			return stream.ToArray();
		};
		public byte[] calculatedBinaryFromMap { get { return serializeMapToByteArray(this); } }

		// serialize map to xml, i.e. <root><key>value</key></root>
		public Func<Root, XElement> serializeMapToXml = it => new XElement("root", it.originalDictionary.Select(kv => new XElement(kv.Key, kv.Value)));
		public XElement calculatedXmlFromMap { get { return serializeMapToXml(this); } }

		// serialize map to string 1, won't work in dsl: string.Join not supported
		public Func<Root, String> serializeMapToString1 = it => string.Join(";", it.originalDictionary.Select(x => x.Key + "=" + x.Value).ToArray());
		public String calculatedStringFromMap1 { get { return serializeMapToString1(this); } }

		// serialize map to string 2
		public Func<Root, String> serializeMapToString2 = it => it.originalDictionary.Select(x => x.Key + "=" + x.Value).Aggregate((accumulator, next) => accumulator + next + ";");
		public String calculatedStringFromMap2 { get { return serializeMapToString2(this); } }
	}

}
