module CalculatedPropertyInValueSetup
{
  value OneStringWithMaxLengthOf9_5 {
    String(9) oneStringWithMaxLengthOf9;

    calculated String(9) calculatedOneStringWithMaxLengthOf9 from 'it => it.oneStringWithMaxLengthOf9';

    calculated String(9) persistedOneStringWithMaxLengthOf9 from 'it => it.oneStringWithMaxLengthOf9' { persisted; }
  }
}