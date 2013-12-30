module CalculatedTestsDouble {
  root TestDouble {
    Double originalDouble;

    calculated String calculatedStringFromDouble from 'it => it.originalDouble.ToString()';

    calculated Int calculatedIntFromDouble from 'it => (int) it.originalDouble';

    calculated Float calculatedFloatFromDouble from 'it => (float) it.originalDouble';

    calculated Long calculatedLongFromDouble from 'it => (long) it.originalDouble';

    // won't work, BitConverter missing
    //calculated Binary calculatedBinaryFromDouble from 'it => BitConverter.GetBytes(it.originalDouble)';

    calculated Decimal calculatedDecimalFromDouble from 'it => (decimal) it.originalDouble';

    calculated Money calculatedMoneyFromDouble from 'it => (decimal) it.originalDouble';

    calculated Boolean calculatedBooleanFromDouble from 'it => it.originalDouble != 0d';

  }
}
