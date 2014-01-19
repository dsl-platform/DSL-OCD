module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullableLongs_4 {
    Set<Long?>? nullableSetOfNullableLongs;

    calculated Set<Long?>? calculatedNullableSetOfNullableLongs from 'it => it.nullableSetOfNullableLongs';

    calculated Set<Long?>? persistedNullableSetOfNullableLongs from 'it => it.nullableSetOfNullableLongs' { persisted; }
  }
}
