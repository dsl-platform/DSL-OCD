module CalculatedTestsFloat {
  root TestFloat {
    Float originalFloat;

    calculated String calculatedStringFromFloat from 'it => it.originalFloat.ToString()';

    calculated Int calculatedIntFromFloat from 'it => (int) it.originalFloat';

    calculated Double calculatedDoubleFromFloat from 'it => (double) it.originalFloat';

    calculated Long calculatedLongFromFloat from 'it => (long) it.originalFloat';

    // won't work, BitConverter missing
    //calculated Binary calculatedBinaryFromFloat from 'it => BitConverter.GetBytes(it.originalFloat)';

    calculated Decimal calculatedDecimalFromFloat from 'it => (decimal) it.originalFloat';

    calculated Money calculatedMoneyFromFloat from 'it => (decimal) it.originalFloat';

    calculated Boolean calculatedBooleanFromFloat from 'it => it.originalFloat != 0f';

  }
}
