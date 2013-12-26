module CalculatedTestsMoney {
  root TestMoney {
    Money originalMoney;
    
    calculated String calculatedStringFromMoney from 'it => it.originalMoney.ToString()';
    
    calculated Int calculatedIntFromMoney from 'it => (int) it.originalMoney';
    
    calculated Float calculatedFloatFromMoney from 'it => (float) it.originalMoney';
    
    calculated Long calculatedLongFromMoney from 'it => (long) it.originalMoney';

    calculated Double calculatedDoubleFromMoney from 'it => (double) it.originalMoney';
  
    // won't work, BitConverter, Convert missing
    //calculated Binary calculatedBinaryFromMoney from 'it => BitConverter.GetBytes(Convert.ToDouble(it.originalMoney))';
    
    calculated Decimal calculatedDecimalFromMoney from 'it => it.originalMoney';
    
    calculated Boolean calculatedBooleanFromMoney from 'it => it.originalMoney != 0';
    
  }
}
