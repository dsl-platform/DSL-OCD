module CalculatedPropertyInValueSetup
{
  value NullableListOfNullableLongs_4 {
    List<Long?>? nullableListOfNullableLongs;

    calculated List<Long?>? calculatedNullableListOfNullableLongs from 'it => it.nullableListOfNullableLongs';

    calculated List<Long?>? persistedNullableListOfNullableLongs from 'it => it.nullableListOfNullableLongs' { persisted; }
  }
}
