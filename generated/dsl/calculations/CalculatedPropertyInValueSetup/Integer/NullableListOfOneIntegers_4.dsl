module CalculatedPropertyInValueSetup
{
  value NullableListOfOneIntegers_4 {
    List<Integer>? nullableListOfOneIntegers;

    calculated List<Integer>? calculatedNullableListOfOneIntegers from 'it => it.nullableListOfOneIntegers';

    calculated List<Integer>? persistedNullableListOfOneIntegers from 'it => it.nullableListOfOneIntegers' { persisted; }
  }
}
