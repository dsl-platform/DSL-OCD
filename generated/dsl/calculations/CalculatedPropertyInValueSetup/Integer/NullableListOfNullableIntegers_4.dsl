module CalculatedPropertyInValueSetup
{
  value NullableListOfNullableIntegers_4 {
    List<Integer?>? nullableListOfNullableIntegers;

    calculated List<Integer?>? calculatedNullableListOfNullableIntegers from 'it => it.nullableListOfNullableIntegers';

    calculated List<Integer?>? persistedNullableListOfNullableIntegers from 'it => it.nullableListOfNullableIntegers' { persisted; }
  }
}
