module CalculatedPropertyInValueSetup
{
  value NullableListOfOneBooleans_4 {
    List<Boolean>? nullableListOfOneBooleans;

    calculated List<Boolean>? calculatedNullableListOfOneBooleans from 'it => it.nullableListOfOneBooleans';

    calculated List<Boolean>? persistedNullableListOfOneBooleans from 'it => it.nullableListOfOneBooleans' { persisted; }
  }
}
