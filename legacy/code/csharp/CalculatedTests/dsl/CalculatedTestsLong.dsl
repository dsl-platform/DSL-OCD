module CalculatedTestsLong{
  root TestLong {
    Long originalLong;

    calculated String calculatedStringFromLong from 'it => it.originalLong.ToString()';

    calculated Int calculatedIntFromLong from 'it => (int) it.originalLong';

    calculated Double calculatedDoubleFromLong from 'it => (double) it.originalLong';

    calculated Float calculatedFloatFromLong from 'it => (float) it.originalLong';

    // won't work, BitConverter missing
    //calculated Binary calculatedBinaryFromLong from 'it => BitConverter.GetBytes(it.originalLong)';

    calculated Decimal calculatedDecimalFromLong from 'it => (decimal) it.originalLong';

    calculated Money calculatedMoneyFromLong from 'it => (decimal) it.originalLong';

    calculated Boolean calculatedBooleanFromLong from 'it => it.originalLong != 0';

    // timestamp, date conversions won't work because DateTime feature is missing
    //calculated Timestamp calculatedTimestampFromLong from 'it => DateTime.MinValue.AddTicks(it.originalLong)';
  }
}
