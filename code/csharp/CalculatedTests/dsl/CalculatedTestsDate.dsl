/*
 * Date resolves to System.DateTime
 */
module CalculatedTestsDate {
  root TestDate {
    Date originalDate;
    Timestamp originalTimestamp;

    /*
     * it should return a string representation in specified format i.e. dd-MM-YYYY
     * problem: unsupported method call
     */
    //calculated String calculatedStringFromDate from 'it => it.originalDate.ToString("dd-MM-yyyy HH:mm")';

    /*
     * should return nanoseconds since 1.1.1970
     * ERROR: 42809: column notation .Ticks applied to type date, which is not a composite type
     */
    //calculated Long calculatedStringFromDate1 from 'it => it.originalDate.Ticks';

    /*
     * this one is used to convert the value of the current DateTime object to a binary value
     * unsupported method call
     */
    // calculated Long calculatedStringFromDate2 from 'it => it.originalDate.ToBinary()';

    // won't work, Bitconverter missing
    //calculated Binary calculatedBinaryFromDate from 'it => BitConverter.GetBytes(it.originalDateTime.ToBinary())';

    calculated Timestamp calculatedTimestampFromDate from 'it => it.originalDate';

    calculated Date calculatedDateFromTimestamp from 'it => it.originalTimestamp';
  }
}
