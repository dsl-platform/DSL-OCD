module CalculatedTestsInt{
  root TestInt{
    Int originalInt;

    // int => string, 1st method, 23 should return "23"
     calculated String calculatedStringFromInt from 'it => it.originalInt.ToString()';

    // int => long, 23 should return 23l
    calculated Long calculatedLongFromInt from 'it => (long) it.originalInt';

    // int => double, 23 should return 23d
    calculated Double calculatedDoubleFromInt from 'it => (double) it.originalInt';

    // int => decimal 23 should return decimal of 23
    calculated Decimal calculatedDecimalFromInt from 'it => (decimal) it.originalInt';

    // int => money (money is same type as decimal)
    calculated Money calculatedMoneyFromInt from 'it => (decimal) it.originalInt';

    // int => float
    calculated Float calculatedFloatFromInt from 'it => (float) it.originalInt';

    /* int => byte[], ugly method, but BitConverter isn't supported
    calculated Binary calculatedBinaryFromInt from @"it =>
    {
      byte[] bytes = new byte[4];
      for (int i = 0; i <= 3; i++) { bytes[i] = (byte)((i > 0) ? it.originalInt >> 8 * (3 - i) : it.originalInt); }
      return new Binary(bytes);
    }";*/

    calculated Boolean? calculatedBooleanFromInt from 'it =>  (it.originalInt == 0)? false: ((it.originalInt == 1)? true: (Boolean?) null)';

    // int => datetime, for example only. it makes more sence to convert long to datetime. Anyway, doesn't work in dsl
    // calculated Timestamp calculatedDateTimeFromInt from 'it => DateTime.MinValue.AddTicks(it.originalInt)';

  }


}
