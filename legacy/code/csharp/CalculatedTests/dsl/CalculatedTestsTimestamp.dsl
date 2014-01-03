module CalculatedTestsTimestamp {
  root TestTimestamp {
    Timestamp originalTimestamp;
    /*
     * it should return a string representation in specified format i.e. dd-MM-YYYY
     * problem: unsupported method call
     */
    //calculated String calculatedStringFromTimestamp from 'it => it.originalTimestamp.ToString("dd-MM-YYYY HH:mm")';

    /*
     * should return nanoseconds since 1.1.1970
     * ERROR: 42809: column notation .Ticks applied to type Timestamp, which is not a composite type
     */
    //calculated Long calculatedStringFromTimestamp1 from 'it => it.originalTimestamp.Ticks';

    /*
     * this one is used to convert the value of the current TimestampTime object to a binary value
     * unsupported method call
     */
    // calculated Long calculatedStringFromTimestamp2 from 'it => it.originalTimestamp.ToBinary()';

    // won't work, Bitconverter missing
    //calculated Binary calculatedBinaryFromTimestamp from 'it => BitConverter.GetBytes(it.originalTimestampTime.ToBinary())';

    calculated Date calculatedDateFromTimestamp from 'it => it.originalTimestamp';
  }
}
