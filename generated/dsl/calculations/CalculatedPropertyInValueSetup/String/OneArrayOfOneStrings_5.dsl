module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneStrings_5 {
    Array<String> oneArrayOfOneStrings;

    calculated Array<String> calculatedOneArrayOfOneStrings from 'it => it.oneArrayOfOneStrings';

    calculated Array<String> persistedOneArrayOfOneStrings from 'it => it.oneArrayOfOneStrings' { persisted; }
  }
}
